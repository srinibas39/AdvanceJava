package exceptions;

import java.io.IOException;

public class ExceptionDemo {

    public static void show() throws IOException{
        //sayHello(null);;
        var account = new Account();
        try{
            account.deposit(-1);
        }
        catch(IOException e){
           // e.printStackTrace();
            System.out.println("Logging");
            throw new IOException();
        }
    }

    public static void showWithdraw() {
        //sayHello(null);;
        var account = new Account();
        try{
            account.withdraw(1000);
        }
        catch(AccountException e){
            // e.printStackTrace();
            var cause = e.getCause();
            e.printStackTrace();
           // System.out.println(e.getMessage());
            System.out.println(cause.getMessage());

        }
    }



    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
