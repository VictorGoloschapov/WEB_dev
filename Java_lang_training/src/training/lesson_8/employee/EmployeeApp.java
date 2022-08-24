package training.lesson_8.employee;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 2000, 2022, 05, 20);
        Employee employee2 = new Employee("Sara Conor", 2010, 2022, 01, 15);
        Employee employee3 = new Employee("Bob Smith Jr.", 1000, 1960, 02, 10);

        Employee[] employees = new Employee[3];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;

        System.out.println(employee2.getName() + " Salary is " + employee2.getSalary());
        employee2.riseSalary(20);
        System.out.println(employee2.getName() + " Salary is " + employee2.getSalary());
        System.out.println();

        for (Employee e : employees) {
            System.out.println(e.getName() + " Salary is " + e.getSalary());
        }
        System.out.println();
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
