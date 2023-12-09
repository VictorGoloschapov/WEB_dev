<?php
require_once "includes/config.php";
require_once "includes/classes/FormSanitizer.php";
require_once "includes/classes/Constants.php";
require_once "includes/classes/Account.php";

$account = new Account($con);

$site_logo = "vicFlix";

$titles = array(
    "website_main_title" => "Welcome to " . $site_logo,
    "register_form" => "Sign Up",
    "login_form" => "Sign in",
);

$tpl_header = "includes/pages_tpl/header.php";
$tpl_login_form = "includes/pages_tpl/login_form.php";
$tpl_registration_form = "includes/pages_tpl/registration_form.php";
?>