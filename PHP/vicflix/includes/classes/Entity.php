<?php
class Entity {
    private $con;
    private $sqlData;

    public function __construct($con, $input) {
        $this->con = $con;

        if(is_array($input)) {
            $this->sqlData = $input; // we have already data array
        } else {
            $query = $this->con->prepare("SELECT * FROM entities WHERE id=:id"); // if not, will take data from DB
            $query->bindValue(":id", $input);
            $query->execute();

            $this->sqlData = $query->fetch(PDO::FETCH_ASSOC);
        }

    }

    public function getId() {
        return $this->sqlData["id"];
    }

    public function getName() {
        return $this->sqlData["name"];
    }

    public function getThumbnail() {
        return $this->sqlData["thumbnail"];
    }

    public function getPreview() {
        return $this->sqlData["preview"];
    }

    public function getCategoryId() {
        return $this->sqlData["categoryId"];
    }

    public function getSeasons() {
        $query = $this->con->prepare("SELECT * FROM videos WHERE entityId = :id AND isMovie = 0 ORDER BY season, episode ASC");
        $query->bindValue(":id", $this->getId());
        $query->execute();

        //return seasons and videos
        $seasons = array();
        $videos = array();
        $currentSeason = null;

        while($row = $query->fetch(PDO::FETCH_ASSOC)) {
            if ($currentSeason != null && $currentSeason != $row["season"]) {
                $seasons[] = new Season($currentSeason, $videos); //array of season objects
                $videos = array();
            }

            //get current season
            $currentSeason = $row["season"]; //on which season I currently on
            $videos[] = new Video($this->con, $row);
        }

        if (sizeof($videos) != 0) {//only if ve have any video
            $seasons[] = new Season($currentSeason, $videos); //array of season objects
        }

        return $seasons;
    }
}
?>