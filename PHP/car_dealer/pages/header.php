<!DOCTYPE html>
<html lang="<?php echo $lang["nav"]["about_us"] ?>">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!--favicon-->
  <link rel="apple-touch-icon" sizes="180x180" href=<?php echo $fileLocationPath["images"] . "/images/favicon/apple-touch-icon.png?"?>>
  <link rel="icon" type="image/png" sizes="32x32" href= <?php echo $fileLocationPath["images"] ."/images/favicon/favicon-32x32.png"?>>
  <link rel="icon" type="image/png" sizes="16x16" href=<?php echo $fileLocationPath["images"] ."/images/favicon/favicon-16x16.png"?>>
  <link rel="manifest" href="/site.webmanifest">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
  <!-- <link rel="stylesheet" href=<?php echo $fileLocationPath["css"] . "/aos.css"?>> -->
  <link rel="stylesheet" href=<?php echo $fileLocationPath["css"] . "/style.css"?>>
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><?php echo $engine->getPageTitle(); ?></title>
</head>
<body>
    <?php if ($engine->getPageFile() == "main"):?>
      <header id="header" class="header">
    <?php else: ?>
      <header id="header" class="header background_black position--fixed">
    <?php endif; ?>
      <div class="container">
        <div class="header_inner">
          <div class="header_logo">
            <div class="logo_title"><span>Car </span>Dealer</div>
            <div class="logo_subtitle">mazlietotu auto tirdzniecība</div>
          </div>
          <nav class="nav" id="nav">
            <?php if ($engine->getPageFile() == "main"): ?>
              <a class="nav_link active active-mobile" href="?page=main"><?php echo $lang["nav"]["about_us"] ?></a>
            <?php else: ?>
              <a class="nav_link" href="?page=main"><?php echo $lang["nav"]["about_us"] ?></a>
            <?php endif; ?>
            <?php if ($engine->getPageFile() == "contacts"): ?>
              <a class="nav_link active active-mobile" href="?page=contacts">Auto pasūtīšana</a>
            <?php else: ?>
              <a class="nav_link" href="?page=contacts">Auto pasūtīšana</a>
            <?php endif; ?>
            <?php if ($engine->getPageFile() == "used_cars_search"): ?>
              <a class="nav_link active active-mobile" href="?page=used_cars_search">Mazlietoti auto </a>
            <?php else: ?>
              <a class="nav_link" href="?page=used_cars_search">Mazlietoti auto </a>
            <?php endif; ?>
            <?php if ($current_lang == "lv"): ?>
              <a class="nav_link active" href="index.php?lang=lv">LV</a>
            <?php else: ?>
              <a class="nav_link" href="index.php?lang=lv">LV</a>
            <?php endif; ?>
            <?php if ($current_lang == "ru"): ?>
              <a class="nav_link active" href="index.php?lang=ru">RU</a>
            <?php else: ?>
              <a class="nav_link" href="index.php?lang=ru">RU</a>
            <?php endif; ?>
            <?php if ($current_lang == "en"): ?>
              <a class="nav_link active" href="index.php?lang=en">ENG</a>
            <?php else: ?>
              <a class="nav_link" href="index.php?lang=en">ENG</a>
            <?php endif; ?>
          </nav>
          <!--Burger menu-->
          <button class="burger" type="button" id="navToggle">
            <span class="burger_line">1</span>
            <span class="burger_line">2</span>
            <span class="burger_line">3</span>
            <span class="burger_line">4</span>
          </button>
        </div>
      </div><!--/.container-->
  </header>