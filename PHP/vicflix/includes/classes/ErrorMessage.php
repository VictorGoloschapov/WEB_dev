<?php
class ErrorMessage {
    public static function show($text) {
        exit("<span class=\"error_banner\">$text</span>");
    }
}
?>