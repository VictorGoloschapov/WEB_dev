package training.lesson_7.Task_10_from_level_5;

import java.util.Scanner;

public class CreditCard {
    private int cardNumber;
    private int pinCode;
    private int balance;
    private int creditLimit;
    private int creditDebt;
    private String cardName;

    public void depositMoney(int pinCode, int depositAmount) {
        if (checkPinCode(pinCode)) {
            if (creditDebt >= depositAmount) {
                creditDebt -= depositAmount;
            } else {
                balance = balance + depositAmount - creditDebt;
                creditDebt = 0;
            }
        }
    }
    public void withdrawMoney(int pinCode, int withdrawAmount) {
        if (checkPinCode(pinCode)) {
            if (balance >= withdrawAmount) {
                balance -= withdrawAmount;
            } else {
                int creditSum = withdrawAmount - balance;
                if (creditSum <= creditLimit) {
                    creditDebt = creditSum;
                    balance = 0;
                } else {
                    System.out.println("Credit limit exceeded");
                }
            }
        }
    }
    private boolean checkPinCode(int pinCode) {
        int count = 0;
        Scanner input = new Scanner(System.in);

        while( count < 3) {
            if (pinCode == this.pinCode) {
                System.out.println("Pin code correct!");
                break;
            } else {
                System.out.println("Pin code incorrect! Please try again");
                pinCode = input.nextInt();
            }
            count++;
        }

        if (count == 3) {
            System.out.println("CARD BLOCKED");
            return false;
        } else {
            return true;
        }
    }

    //создаем кредитную карту конструктором
    public CreditCard(int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditDebt = 0;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCreditDebt() {
        return creditDebt;
    }

    public void setCreditDebt(int creditDebt) {
        this.creditDebt = creditDebt;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    //переопределили метод, можем вывести весь объект в консоль
    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", creditDebt=" + creditDebt +
                ", cardName='" + cardName + '\'' +
                '}';
    }
}
