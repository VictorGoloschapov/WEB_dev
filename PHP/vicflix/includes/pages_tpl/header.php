<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/2b97f93fbd.js" crossorigin="anonymous"></script>
    <!-- <script src="assets/js/main.js"></script> -->
    <link rel="stylesheet" type="text/css" href="assets/style/style.css">
    <link rel="apple-touch-icon" sizes="180x180" href="assets/favicon/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="assets/favicon//favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="assets/favicon//favicon-16x16.png">
    <link rel="manifest" href="assets/favicon//site.webmanifest">
    <title><?=$titles["website_main_title"]?></title>
</head>
<body>
    <div class="wrapper">

<?php
//hiding nan bar on page.php
if(!isset($hideNav)) {
    include_once "nav_bar.php";
}
?>