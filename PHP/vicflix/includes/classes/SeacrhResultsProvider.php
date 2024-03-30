<?php

class SeacrhResultsProvider {
    private $con;
    private $username;

    public function __construct($con, $username) {
        $this->con = $con;
        $this->username = $username;
    }

    public function getResults($inputText) {
        //need to get all entities
        $entities = EntityProvider::getSearchEntities($this->con, $inputText);

        $html = "<div class=\"preview_categories no-scroll\">";

        $html .= $this->getResultHtml($entities);

        return $html . "</div>";
    }

    private function getResultHtml($entities) {
        if (sizeof($entities) == 0) {
            return;
        }

        $entitiesHtml = "";

        $previewProvider = new PreviewProvider($this->con, $this->username);

        foreach ($entities as $entity) {
            $entitiesHtml .= $previewProvider->createEntityPreviewSquare($entity);
        }

        // return $entitiesHtml . "<br>";
        return "<div class=category>
                    <div class=\"entities\">
                        $entitiesHtml
                    </div>
                </div>";
    }
}
?>