package com.daniyar.bankaccount_task_5;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(100.00);
        try {
            bankAccount.withdraw(10);
            bankAccount.deposit(15);
        } catch (InsufficientFundsException e) {
            throw new RuntimeException(e);
        }catch (NegativeAmountException e) {
            throw new RuntimeException(e);
        }

    }
}
