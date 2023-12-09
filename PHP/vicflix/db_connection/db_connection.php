<?php
//connecting to DB using PDO
try {
    $con = new PDO("mysql:dbname=vikflix;host=localhost", "root", "Supertank20ss!");
    $con->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_WARNING);
}
catch (PDOException $e) {
    exit("Connection failed: " . $e->getMessage());
}
?>