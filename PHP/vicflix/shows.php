<?php
require_once "data_config.php";
include_once "includes/pages_tpl/header.php";

$preview = new previewProvider($con, $userLoggedIn);
$preview->createTvShowPreviewVideo();
$categoryContainer = new CategoryContainers($con, $userLoggedIn);
echo $categoryContainer->showTVShowCategories();

include_once $tpl_footer;
?>