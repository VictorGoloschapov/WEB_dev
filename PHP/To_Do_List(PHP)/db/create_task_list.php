<?php
include_once("db_connection.php");

$sql = 'CREATE TABLE IF NOT EXISTS tasks ('.
'id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,' .
'task_name VARCHAR(255) DEFAULT NULL)';

if ($conn->query($sql)) {
    echo "Таблица users успешно создана";
} else {
    echo "Ошибка: " . $conn->error;
}

$conn->close();
?>