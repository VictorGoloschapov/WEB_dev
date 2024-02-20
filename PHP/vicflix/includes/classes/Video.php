<?php
class Video {
    private $con;
    private $sqlData;
    private $entity; //to what entity video belongs to

    public function __construct($con, $input) {
        $this->con = $con;

        if(is_array($input)) {
            $this->sqlData = $input; // we have already data array
        } else {
            $query = $this->con->prepare("SELECT * FROM videos WHERE id=:id"); // if not, will take data from DB
            $query->bindValue(":id", $input);
            $query->execute();
            $this->sqlData = $query->fetch(PDO::FETCH_ASSOC);
        }

        $this->entity = new Entity($con, $this->sqlData["entityId"]); //entity object
    }

    public function getId() {
        return $this->sqlData["id"];
    }

    public function getTitle() {
        return $this->sqlData["title"];
    }

    public function getDescription() {
        return $this->sqlData["description"];
    }

    public function getFilePath() {
        return $this->sqlData["filePath"];
    }

    public function getThumbnail() {
        return $this->entity->getThumbnail(); //thumbnail from entity object
    }

    public function getEpisodeNumber() {
        return $this->sqlData["episode"];
    }

    public function incrementViews() {
        $query = $this->con->prepare("UPDATE videos SET views=views+1 WHERE id=:id");
        $query->bindValue(":id", $this->getId());
        $query->execute();
    }
}

?>