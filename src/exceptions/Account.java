package exceptions;

import java.io.IOException;

public class Account {

    private float accountBalance;

    public void deposit(float value) throws IOException {
        if(value <= 0){
             throw new IOException();
        }
    }

    public void withdraw(float value) throws CustomInsufficientBalanceException {
        if(value>accountBalance){
            throw new CustomInsufficientBalanceException();
        }
    }
}
