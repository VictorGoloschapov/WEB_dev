<?php
require_once "includes/config.php";

//if user not login, redirect him to register.php
if (!isset($_SESSION["userLoggedIn"])) {
    header("Location: register.php");
}
?>