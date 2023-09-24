package exceptions;

import java.io.IOException;

public class Account {

    private float accountBalance;

    public void deposit(float value) throws IOException {
        if(value <= 0){
             throw new IOException();
        }
    }

    public void withdraw(float value) throws AccountException {
        if(value>accountBalance){
            //throw new CustomInsufficientBalanceException();
//            var customInsufficientBalanceException = new CustomInsufficientBalanceException();
//            var accountException = new AccountException();
//
//            accountException.initCause(customInsufficientBalanceException);
//
//            throw new AccountException();

            throw new AccountException(new CustomInsufficientBalanceException());
        }
    }
}
