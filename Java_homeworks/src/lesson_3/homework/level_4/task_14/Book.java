package lesson_3.homework.level_4.task_14;

class Book {

    String title;//добавил точку с запятой, чтобы закрыть инструкцию

    Book(String bookTitle) {
        this.title = bookTitle; // переменной title присваиваем значение параметра bookTitle
    }

    String getTitle() {
        return this.title;
    }
}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
