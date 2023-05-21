<?php

include_once "class_engine.php";
include_once "init.php";
include_once "pages/header.php";

$engine = new Engine();

if ($engine->getError()) {
    echo "<div style='border:1px solid red;padding:10px;margin: 10px auto;
        width: 500px;'>" . $engine->getError() . "</div>";
}

echo $engine->getContentPage();

include_once "pages/footer.php";
?>