<?php
require_once "includes/pages_setup.php";
require_once "data_config.php";
include_once "includes/pages_tpl/header.php";

if (!isset($_GET['id'])) {
    ErrorMessage::show("No ID passed into page");
}

#create video object using page id
$video = new Video($con, $_GET['id']);
$video->incrementViews();//create video views count
?>