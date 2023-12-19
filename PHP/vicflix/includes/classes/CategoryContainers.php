<?php
class CategoryContainers {
    private $con;
    private $username;

    //class to display all movie categories on page

    public function __construct($con, $username) {
        $this->con = $con;
        $this->username = $username;
    }

    public function showAllCategories() {
        //select all categories from DB
        $query = $this->con->prepare("SELECT * FROM categories");
        $query->execute();

        $html = "<div class=\"preview_categories\">";

        while($row = $query->fetch(PDO::FETCH_ASSOC)) {
            $html .= $this->getCategoryHtml($row, null, true, true);
        }

        return $html . "</div>";
    }

    public function showCategory($categoryId, $title = null) {
        //select all categories from DB
        $query = $this->con->prepare("SELECT * FROM categories WHERE id = :id");
        $query->bindValue(":id", $categoryId);
        $query->execute();

        $html = "<div class=\"preview_categories no-scroll\">";

        while($row = $query->fetch(PDO::FETCH_ASSOC)) {
            $html .= $this->getCategoryHtml($row, $title, true, true);
        }

        return $html . "</div>";
    }

    //create html for each category
    private function getCategoryHtml($sqlData, $title, $tvShows, $movies) {
        $categoryId = $sqlData['id'];
        $title = $title == null ? $sqlData['name'] : $title;

        //retrieve entity for each category
        if ($tvShows && $movies) {
            //get all tv shows and movies
            $entities = EntityProvider::getEntities($this->con, $categoryId, 30);
        } else if ($tvShows) {
            //get tv shows only

        } else {
            //get movie entity
        }

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
                    <a href=\"category.php?id=$categoryId\">
                        <h3>$title</h3>
                    </a>
                    <div class=\"entities\">
                        $entitiesHtml
                    </div>
                </div>";
    }
}
?>