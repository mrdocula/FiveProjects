package com.daniyar.bankaccount_task_5;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount > balance){
            throw  new InsufficientFundsException("InsufficientFundsException!!!");
        }
         balance -= amount;
    }

    public void deposit(double amount) throws NegativeAmountException{
        if (amount < 0){
            throw  new NegativeAmountException("NegativeAmountException!!!");
        }
        balance += amount;
    }
}
