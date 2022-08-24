package training.incapsulation;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee robert = new Employee();
        robert.setName("Robert");
        robert.setAge(30);
        robert.showName();
        robert.showAge();
    }
}
