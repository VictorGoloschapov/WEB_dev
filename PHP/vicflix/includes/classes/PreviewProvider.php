<?php
class PreviewProvider {
    private $con;
    private $username;

    public function __construct($con, $username) {
        $this->con = $con;
        $this->username = $username;
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

