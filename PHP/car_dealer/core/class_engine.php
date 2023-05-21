<?php
/**
 * Engine v1.0
 * author Victor Goloschapov
 * =========================
 * Find opened pages by GET method
 * log errors
 * return opened pages
 * generate page title
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
        //    var_dump($_GET);

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

    public function getPageFile() {
        return $this->_pageFile;
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