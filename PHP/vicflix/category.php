<?php
require_once "data_config.php";
include_once "includes/pages_tpl/header.php";

if (!isset($_GET['id'])) {
    ErrorMessage::show("No id passed to page");
}

$preview = new previewProvider($con, $userLoggedIn);
$preview->createCategoryPreviewVideo($_GET['id']);
$categoryContainer = new CategoryContainers($con, $userLoggedIn);
echo $categoryContainer->showCategory($_GET['id']);

include_once $tpl_footer;
?>