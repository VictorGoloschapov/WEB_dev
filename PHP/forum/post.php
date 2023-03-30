<?php
$pageTitle = "PHP-публикация сообщения";

include ("includes/header.html");
("connect_db.php");

echo '<div style="padding: 0 10px;">
    <form action="process.php" method="POST" accept-charset="utf-8>
        Имя: <input name="first_name" type="text">
        Фамилия: <input name="last_name" type="text">
        <p>Тема:<br>
        <input name="subject" type="text" size="64"></p>
        <p>Сообщение</p>
        <textarea name="message" rows="5" cols="50"></textarea></p>
        <p><input type="submit" value="Отправить"></p>
    </form>
</div>';

echo '<p><a href="forum.php">Вернуться к форуму</a></p>';
include ("includes/footer.html");
