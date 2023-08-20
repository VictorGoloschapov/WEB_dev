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
class Engine {
    private $_pageFile = null;
    private $_error = null;
    private $_pageTitle = null;

    public function __construct() {
        if (isset($_GET['page'])) {
            $this->_pageFile = $_GET['page'];
            $this->_pageFile = str_replace(".", "null", $_GET['page']);
            $this->_pageFile = str_replace("/", "null", $_GET['page']);
            $this->_pageFile = str_replace("", "null", $_GET['page']);

        //    var_dump($this->_pageFile);
        // echo $this->_pageFile;
           var_dump($_GET);

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

    public function getPageFile() {
        return $this->_pageFile;
    }

    public function setError($error) {
        $this->_error = $error;
    }

    public function getError() {
        return $this->_error;
    }

    public function setPageTitle($pageTitle) {
        $this->_pageTitle = $pageTitle;
    }

    public function getPageTitle() {
        return $this->_pageTitle;
    }

    public function getContentPage() {
        return file_get_contents("pages/page_templates/" . $this->_pageFile . ".php");
    }
}
?>