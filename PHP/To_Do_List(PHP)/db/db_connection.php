<?php
$hostName = 'localhost';
$userName = 'root';
$password = 'Supertank20ss!';
$database = 'ToDoList';

$conn = new mysqli($hostName, $userName, $password, $database);

if ($conn->connect_error) {
  die("Connection error: " . $conn->connect_error);
}
?>