<!DOCTYPE html>
<html>
<head>
<title>METANIT.COM</title>
<meta charset="utf-8" />
</head>
<body>
<?php
if(isset($_GET["technologies"])){

    $technologies = $_GET["technologies"];
    foreach($technologies as $item) echo "$item<br />";
}
echo var_dump($_GET);
if(isset($_GET["remember2"]) && $_GET["remember2"] == 1)
    echo "true";
?>
<h3>Форма ввода данных</h3>
<form method="GET">
    <p>ASP.NET: <input type="checkbox" name="technologies[]" value="ASP.NET" /></p>
    <p>PHP: <input type="checkbox" name="technologies[]" value="PHP" /></p>
    <p>Node.js: <input type="checkbox" name="technologies[]" value="Node.js" /></p>


    <div>Запомнить: <input type="checkbox" name="remember"/></div>
    <div>Запомнить: <input type="checkbox" name="remember2" value = "1"/></div>
    <input type="submit" value="Отправить">
</form>
</body>
</html>