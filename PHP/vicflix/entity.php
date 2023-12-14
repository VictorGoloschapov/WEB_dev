<?php
require_once "data_config.php";
include_once "includes/pages_tpl/header.php";


if (!isset($_GET['id'])) {
    ErrorMessage::show("No ID passed into page");
}

$entityId = $_GET['id'];
$entity = new Entity($con, $entityId);

$preview = new previewProvider($con, $userLoggedIn);
$preview->createPreviewVideo($entity);

$seasonProvider = new SeasonProvider($con, $userLoggedIn);
echo $seasonProvider->create($entity);

include_once $tpl_footer;
?>