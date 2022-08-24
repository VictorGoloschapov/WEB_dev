package training.lesson_7.Task_10_from_level_5;

public class CreditCardApp {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(222255553, 0000);
        card1.setCreditLimit(300);
        card1.setCardName("MASTERCARD");
        card1.depositMoney(1000, 300);

        //System.out.println(card1);

        card1.withdrawMoney(0000, 200);

        //System.out.println(card1);


    }
}
