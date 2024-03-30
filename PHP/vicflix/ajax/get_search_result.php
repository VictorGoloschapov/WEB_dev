<?php
require_once "../includes/config.php";
require_once "../includes/classes/SeacrhResultsProvider.php";
require_once "../includes/classes/EntityProvider.php";
require_once "../includes/classes/Entity.php";
require_once "../includes/classes/PreviewProvider.php";


//need to sanitize input filed in search.php
if (isset($_POST["term"]) && isset($_POST["username"])) {
    $searchResultProvider = new SeacrhResultsProvider($con, $_POST["username"]);
    echo $searchResultProvider->getResults($_POST["term"]);
} else {
    echo "No term or username passed into file";
}
?>