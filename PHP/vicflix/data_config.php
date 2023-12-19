<?php
require_once "includes/config.php";
require_once "includes/pages_setup.php";
require_once "includes/classes/PreviewProvider.php";
require_once "includes/classes/CategoryContainers.php";
require_once "includes/classes/Entity.php";
require_once "includes/classes/EntityProvider.php";
require_once "includes/classes/ErrorMessage.php";
require_once "includes/classes/SeasonProvider.php";
require_once "includes/classes/Season.php";
require_once "includes/classes/Video.php";


//if user not login, redirect him to register.php
if (!isset($_SESSION["userLoggedIn"])) {
    header("Location: register.php");
}

$userLoggedIn = $_SESSION["userLoggedIn"];
?>