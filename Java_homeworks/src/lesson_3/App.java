package lesson_3;

public class App {
    public static void main(String[] args) {
        Dog myDog = new Dog(); //object created. / constructor 1
        myDog.name = "John"; //добавляем свойство объекту
        myDog.speak();//вызвали метод
        //----------------
        System.out.println(myDog.name);
        //----------------

        Dog youngDog = new Dog(1, "Nike", 50); //object created / constructor 2
        youngDog.speak();
        //---------------
        System.out.println(youngDog.age);
        System.out.println(youngDog.name);
        System.out.println(youngDog.height);
        //---------------

        /*пример объекта на JS
      let youngDog = {
            age = 1,
            name = "Nike",
            height = 50
          }
         */

        Dog sam = new Dog("Sam"); //object created / constructor 3
        sam.greetings();
        //---------------
        System.out.println("Dog name: " + sam.name);
        //---------------

        Dog jack = new Dog(12); //object created / constructor 4
        //---------------
        System.out.println(jack.age);
        //---------------

    }
}
