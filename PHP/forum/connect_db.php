<?php

$host = "localhost";
$userName = "root";
$dbPassword = "Supertank20ss!";
$dbName = "forum";

$dbc = new mysqli($host, $userName, $dbPassword, $dbName);
if ($dbc->connect_error) {
    die("Ошибка: " . $dbc->connect_error);
}
echo "Подключение успешно установлено";
$dbc->close();