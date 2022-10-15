package java_projects.banking_app_Rev1;

import java.util.Date;

public interface SavingsAccount {
    final double rate = 0.04;
    final int limit = 10000;
    final int limitSmall = 200;
    void deposit(double amount, Date date);
    void withdraw(double amount, Date date);
}
