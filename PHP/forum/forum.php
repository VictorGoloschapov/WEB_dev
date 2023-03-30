<?php
$pageTitle = "PHP-форум";
include ("includes/header.html");
require("connect_db.php");

$sqlQuery = 'SELECT * FROM users';
$result = mysqli_query($dbc, $sqlQuery);

if (mysqli_num_rows($result) > 0) {
    echo '<table><tr><th>Автор</th><th id="msg">Сообщение</th></tr>';

    while ($row = mysqli_fetch_array($result, MYSQLI_ASSOC)) {
        echo '<tr><td>'.
        $row['first_name'].' '.
        $row['last_name'].'<br>'.
        $row['post_date'].'</td><td>'.
        $row['subject'].'</td><td>'.
        $row['message'].'</td><tr>';
    }
    echo '</table>';
} else {
    echo 'В настоящее время сообщний нет';
}

echo '<p><a href="post.php">Написать сообщение</a>';
mysqli_close($dbc);

include ("includes/footer.html");
