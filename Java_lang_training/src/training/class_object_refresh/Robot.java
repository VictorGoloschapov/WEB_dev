package training.class_object_refresh;

public class Robot {
    String name;

    public Robot() {}
    public Robot(String name) {
      this.name = name;
    }

    public void sayName() {
        System.out.println("Hello my name is " + this.name);
    }
}
