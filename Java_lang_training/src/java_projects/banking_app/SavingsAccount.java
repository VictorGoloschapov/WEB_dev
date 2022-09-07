package java_projects.banking_app;

import java.util.*;

public interface SavingsAccount {
    final double rate = 0.04;
    final int limit = 10000;
    final int limitSmall = 200;
    void deposit(double amount, Date date);
    void withdraw(double amount, Date date);
}
