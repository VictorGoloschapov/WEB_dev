<?php
require_once "data_config.php";
include_once "includes/pages_tpl/header.php";

$preview = new previewProvider($con, $userLoggedIn);
$preview->createPreviewVideo(null);
$categoryContainer = new CategoryContainers($con, $userLoggedIn);
echo $categoryContainer->showAllCategories();

include_once $tpl_footer;

?>