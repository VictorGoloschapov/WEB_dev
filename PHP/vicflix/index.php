<?php
require_once "includes/config.php";
require_once "includes/pages_setup.php";
require_once "includes/classes/PreviewProvider.php";
require_once "includes/classes/CategoryContainers.php";
require_once "includes/classes/Entity.php";
require_once "includes/classes/EntityProvider.php";
include_once "includes/pages_tpl/header.php";


//if user not login, redirect him to register.php
if (!isset($_SESSION["userLoggedIn"])) {
    header("Location: register.php");
}

$userLoggedIn = $_SESSION["userLoggedIn"];
$preview = new previewProvider($con, $userLoggedIn);
$preview->createPreviewVideo(null);
$categoryContainer = new CategoryContainers($con, $userLoggedIn);
echo $categoryContainer->showAllCategories();

include_once $tpl_footer;

?>