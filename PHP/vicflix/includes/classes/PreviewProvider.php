<?php
class PreviewProvider {
    private $con;
    private $username;

    public function __construct($con, $username) {
        $this->con = $con;
        $this->username = $username;
    }

    public function createCategoryPreviewVideo($categoryId) {
        $entitiesArray = EntityProvider::getEntities($this->con, $categoryId, 1);

        if(sizeof($entitiesArray) == 0) {
            ErrorMessage::show("No TV Shows to display!");
        }

        return $this->createPreviewVideo($entitiesArray[0]);
    }

    public function createTvShowPreviewVideo() {
        $entitiesArray = EntityProvider::getTVShowEntities($this->con, null, 1);

        if(sizeof($entitiesArray) == 0) {
            ErrorMessage::show("No TV Shows to display!");
        }

        return $this->createPreviewVideo($entitiesArray[0]);
    }

    public function createMoviesPreviewVideo() {
        $entitiesArray = EntityProvider::getMoviesEntities($this->con, null, 1);

        if(sizeof($entitiesArray) == 0) {
            ErrorMessage::show("No Movies to display!");
        }

        return $this->createPreviewVideo($entitiesArray[0]);
    }

    public function createPreviewVideo($entity) {
        //will return random entities
        if ($entity == null) {
            $entity = $this->getRandomEntity(); //contain entity object
        }

        $id = $entity->getId();
        $name = $entity->getName();
        $thumbnail = $entity->getThumbnail();
        $preview = $entity->getPreview();

        $videoId = VideoProvider::getEntityVideoForUser($this->con, $id,
        $this->username);
        $video = new Video($this->con, $videoId);
        $inProgress = $video->isInProgress($this->username);
        $playButtonText = $inProgress ? "Continue watching" : "Play";
        $seasonEpisode = $video->getSeasonAndEpisode();
        $subHeading = $video->isMovie() ? "" : $seasonEpisode;

        return include "includes/pages_tpl/preview_image.php";
    }

    public function createEntityPreviewSquare($entity) {
        $id = $entity->getId();
        $thumbnail = $entity->getThumbnail();
        $name = $entity->getName();

        return "<a href=\"entity.php?id=$id\">
                    <div class=\"preview__container small\">
                        <img src=\"$thumbnail\" title=\"$name\">
                    </div>
                </a>";
    }

    private function getRandomEntity() {
        $entity = EntityProvider::getEntities($this->con, null, 1);

        return $entity[0];
    }
}
?>

