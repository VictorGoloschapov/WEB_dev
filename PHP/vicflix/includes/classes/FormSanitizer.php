<?php
class FormSanitizer {
    //will not create an instance object, just call function when sanitizing input field
    public static function sanitizeFormString($inputText) {
        $inputText = self::removeTags($inputText);
        $inputText = self::removeHtmlSpecialChars($inputText);
        $inputText = trim($inputText);
        $inputText = strtolower($inputText);
        $inputText = ucfirst($inputText);
        return $inputText;
    }

    public static function sanitizeFormUsername($inputText) {
        $inputText = self::removeTags($inputText);
        $inputText = self::removeHtmlSpecialChars($inputText);
        $inputText = trim($inputText);
        $inputText = strtolower($inputText);
        return $inputText;
    }

    public static function sanitizeFormEmail($inputText) {
        $inputText = self::removeTags($inputText);
        $inputText = self::removeHtmlSpecialChars($inputText);
        $inputText = trim($inputText);
        $inputText = strtolower($inputText);
        return $inputText;
    }

    public static function sanitizeFormPassword($inputText) {
        $inputText = self::removeTags($inputText);
        $inputText = trim($inputText);
        return $inputText;
    }

    private static function removeTags($inputText) {
        $inputText = strip_tags($inputText);
        return $inputText;
    }

    private static function removeHtmlSpecialChars($inputText) {
        $inputText = htmlentities($inputText);
        $inputText = htmlspecialchars($inputText);
        return $inputText;
    }
}
?>