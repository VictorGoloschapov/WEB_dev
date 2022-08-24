package training.different_topics;

class Thing {
    public String name;
    public static String description;

    public void showName() {
        System.out.println(name);
    }
    public static void showDescription() {
        System.out.println(description);
        //System.out.println(name); - так нельзя, только к static переменным обращаемся
    }
}

public class App {
    public static void main(String[] args) {
        //к методу и переменным нужно обращаться через объект
        Thing thing1 = new Thing();
        thing1.name = "Bob";
        thing1.showName();
        Thing thing2 = new Thing();
        thing2.name = "Sara";
        thing2.showName();

        //Вызов static переменной и метода
        //Принадлежат напрямую классу
        Thing.description = "I am the thing";
        Thing.showDescription();
    }
}
