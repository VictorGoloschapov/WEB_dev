<!DOCTYPE html>
<html lang="lv">
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
    <title><?php $engine->getTitle(); ?></title>
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
            <a class="nav_link active active-mobile" href="?page=main">Sākums</a>
            <a class="nav_link" href="?page=contacts">Auto pasūtīšana</a>
            <a class="nav_link" href="?page=used_cars_search">Mazlietoti auto </a>
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