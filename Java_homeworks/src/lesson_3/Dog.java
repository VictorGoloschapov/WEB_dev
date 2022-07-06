package lesson_3;

class Dog {
    /*класс содержит:
    1. Данные (переменные / поля)
    2. Поведение (методы)
     */

    //Данные
    int age;
    String name;
    int height;

    //Класс - это шаблон объекта, какие поля/методы определили, такие используем

    //Конструкторы
    //Сделали 3 конструктора. можем делать объект, используя один из них
    public Dog() { //неявный конструктор, создание объекта без данных / constructor 1
        //шаблон для создания полей объекта
    }
    public Dog(int age, String name, int height) { // constructor 2
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public Dog(String name) { // constructor 3
        this.name = name;
    }
    public Dog(int dogAge) { // constructor 4
        this.age = dogAge;
    }
    //Поведение (методы / функции)
    //void - метод ничего не возвращает
    void speak() {
        System.out.println(name + " says: wof wof wof");
    }
    void greetings() {
        System.out.println("hello, may name is: " + name);
    }
}
