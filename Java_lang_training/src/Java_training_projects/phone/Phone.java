package Java_training_projects.phone;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone() {}

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String dialerName) {
        System.out.println(dialerName + " is calling");
    }
    public void receiveCall(String dialerName, int number) {
        System.out.println(dialerName + number + " is calling");
    }

    public void showPhoneModel(Phone phone) {
        System.out.println("Phone model: " + phone.getModel());
        System.out.println("Phone weight: " + phone.getWeight());
    }
}
