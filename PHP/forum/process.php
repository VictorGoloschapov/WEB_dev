<?php
$pageTitle = "PHP-ошибки";

include ("includes/header.html");

function fail($str) {
    echo "<p>Пожалуйста, укажите $str.</p>";
    echo "<p><a href='post.php'>Написать сообщение</p>";
    include ("includes/footer.html");
    exit();
}

if (isset($_POST['message'])) {
    if (!empty(trim($_POST['first_name']))) {
        $firstName = addslashes($_POST['first_name']);
    } else {
        fail("Имя");
    }
    if (!empty(trim($_POST['last_name']))) {
        $lastName = addslashes($_POST['last_name']);
    } else {
        fail("Фамилию");
    }
    if (!empty(trim($_POST['subject']))) {
        $subject = addslashes($_POST['subject']);
    } else {
        fail("Тему");
    }
    if (!empty(trim($_POST['message']))) {
        $message = addslashes($_POST['message']);
    } else {
        fail("текст сообщения");
    }

    require("connect_db.php");

    $sql = "";
}