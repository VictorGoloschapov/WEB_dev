<?php
require_once "data_config.php";
require_once "includes/pages_setup.php";
include_once "includes/pages_tpl/header.php";

if (!isset($_GET['id'])) {
    ErrorMessage::show("No ID passed into page");
}

#create video object using page id
$video = new Video($con, $_GET['id']);
$video->incrementViews();//create video views count

include_once $tpl_watch_container;

include_once $tpl_footer;
?>