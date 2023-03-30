<?php
$pageTitle = "PHP-ошибки";

include ("includes/header.html");

function fail($str) {
    echo "<p>Пожалуйста, укажите $str.</p>";
    echo "<p><a href='post.php'>Написать сообщение</p>";
    include ("includes/footer.html");
    exit();
}

// print_r($_POST);
// print_r($_POST['first_name']);

if (isset($_POST['message'])) {
    if (isset($_POST['first_name'])) {
        $firstName = addslashes($_POST['first_name']);
    } else {
        fail("Имя");
    }
    if (isset($_POST['last_name'])) {
        $lastName = addslashes($_POST['last_name']);
    } else {
        fail("Фамилию");
    }
    if (isset($_POST['subject'])) {
        $subject = addslashes($_POST['subject']);
    } else {
        fail("Тему");
    }
    if (isset($_POST['message'])) {
        $message = addslashes($_POST['message']);
    } else {
        fail("текст сообщения");
    }
}

require("connect_db.php");

$sql = "INSERT INTO users (first_name, last_name, subject, message, post_date) VALUES ('$firstName', '$lastName', '$subject', '$message', NOW())";

$result = mysqli_query($dbc, $sql);

if (mysqli_affected_rows($dbc) != 1) {
    echo '<p>Ошибка</p>'.mysqli_error($dbc);
    mysqli_close($dbc);
} else {
    mysqli_close($dbc);
    header('Location: forum.php');
}