<?php

require('connect_db.php');

$sql = 'CREATE TABLE IF NOT EXISTS users ('.
    'post_id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,'.
    'first_name VARCHAR(20) NOT NULL,'.
    'last_name VARCHAR(40) NOT NULL,'.
    'subject VARCHAR(60) NOT NULL,'.
    'message TEXT NOT NULL,'.
    'post_date DATETIME NOT NULL)';

if ($dbc->query($sql)) {
    echo "Таблица users успешно создана";
} else {
    echo "Ошибка: " . $dbc->error;
}

$dbc->close();00