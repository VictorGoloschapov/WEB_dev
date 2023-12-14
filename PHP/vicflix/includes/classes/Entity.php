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

    public function getSeasons() {
        $query = $this->con->prepare("SELECT * FROM videos WHERE entityId = :id AND isMovie = 0 ORDER BY season, episode ASC");
        $query->bindValue(":id", $this->getId());
        $query->execute();


    }
}
?>