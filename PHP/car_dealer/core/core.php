<?php
include_once "language/language_change_handler.php";
include_once "init.php";
include_once "class_engine.php";
$engine = new Engine();
$engine->setPageTitle($lang["page_title"]);

include_once "pages/header.php";

if ($engine->getError()) {
    echo "<div style='border:1px solid red;padding:10px;margin: 10px auto;
        width: 500px;'>" . $engine->getError() . "</div>";
}

echo $engine->getContentPage();

include_once "pages/footer.php";
?>