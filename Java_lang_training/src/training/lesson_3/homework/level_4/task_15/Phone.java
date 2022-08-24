package training.lesson_3.homework.level_4.task_15;

class Phone {

    String model;//убрал лишнюю скобку

    Phone(String newModel) { //поменял название конструктора на Phone
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}
