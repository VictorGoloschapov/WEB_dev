<?php
/**
 * Engine v1.0
 * author Victor Goloschapov
 * =========================
 * Find opened pges by GET method
 * log errors
 * return opened pages
 * generates page title
 */

include_once "init.php";
class Engine {
    private $_pageFile = null;
    private $_error = null;

    public function __construct() {
        if (isset($_GET['page'])) {
            $this->_pageFile = $_GET['page'];
            $this->_pageFile = str_replace(".", "null", $_GET['page']);
            $this->_pageFile = str_replace("/", "null", $_GET['page']);
            $this->_pageFile = str_replace("", "null", $_GET['page']);

           var_dump($this->_pageFile);

            $this->isTemplateExists();
        } else {
            $this->_pageFile = "main";
        }
    }
    private function isTemplateExists() {
        if (!file_exists("pages/page_templates/" . $this->_pageFile . ".php")) {
            $this->setError("Template not found");
            $this->_pageFile = "main";
        }
    }

    private function setError($error) {
        $this->_error = $error;
    }

    public function getError() {
        return $this->_error;
    }

    public function getContentPage() {
        return file_get_contents("pages/page_templates/" . $this->_pageFile . ".php");
    }

    public function getTitle() {
        global $pageTitles;
        echo $pageTitles[$this->_pageFile];
    }
}
?>