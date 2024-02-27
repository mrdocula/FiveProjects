package com.daniyar.bankaccount_task_5;

public class NegativeAmountException extends Exception{
    public NegativeAmountException(String message) {
        super(message);
    }
}
