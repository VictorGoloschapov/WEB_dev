<?php
    session_start();

    if (!isset($_SESSION['lang'])) {
        $_SESSION['lang'] = 'en';
    } elseif (isset($_GET['lang']) && $_SESSION['lang'] != $_GET['lang'] && !empty($_GET['lang'])) {
        if ($_GET['lang'] == 'en') {
            $_SESSION['lang'] = 'en';
        } elseif ($_GET['lang'] == 'ru') {
            $_SESSION['lang'] = 'ru';
        } elseif ($_GET['lang'] == 'lv') {
            $_SESSION['lang'] = 'lv';
        }
    }

    $current_lang = $_SESSION['lang'];

    require_once $_SESSION['lang'] . ".php";

    echo "Choosen lang: " . $current_lang;

    //to redirect to current page when switching language
?>