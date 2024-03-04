<?php
require_once "data_config.php";
include_once "includes/pages_tpl/header.php";

$preview = new previewProvider($con, $userLoggedIn);
$preview->createMoviesPreviewVideo();
$categoryContainer = new CategoryContainers($con, $userLoggedIn);
echo $categoryContainer->showMoviesCategories();

include_once $tpl_footer;
?>