<?php

include_once "init.php";
include_once "class_engine.php";
$engine = new Engine();

include_once "pages/header.php";

if ($engine->getError()) {
    echo "<div style='border:1px solid red;padding:10px;margin: 10px auto;
        width: 500px;'>" . $engine->getError() . "</div>";
}

echo $engine->getContentPage();

include_once "pages/footer.php";
?>