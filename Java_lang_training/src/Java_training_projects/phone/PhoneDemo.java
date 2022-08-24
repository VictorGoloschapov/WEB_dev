package Java_training_projects.phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone iphone6S = new Phone();
        iphone6S.setModel("Iphone 6S");
        iphone6S.setWeight(100);
        iphone6S.showPhoneModel(iphone6S);

        Phone samsungGalaxyS22 = new Phone("Samsung Galaxy S22", 110);
        samsungGalaxyS22.showPhoneModel(samsungGalaxyS22);

        Phone huaweiP20 = new Phone("Huawei P20", 100);
        huaweiP20.showPhoneModel(huaweiP20);

        iphone6S.receiveCall("Olga ", 25921041);
    }
}
