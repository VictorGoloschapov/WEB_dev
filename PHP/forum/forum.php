<?php
$pageTitle = "PHP-форум";
include ("includes/header.html");
require("connect_db.php");

$sqlQuery = 'SELECT * FROM users';
$result = mysqli_query($dbc, $sqlQuery);

if ()

include ("includes/footer.html");
