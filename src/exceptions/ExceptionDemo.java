package exceptions;

import java.io.IOException;

public class ExceptionDemo {

    public static void show(){
        //sayHello(null);;
        var account = new Account();
        try{
            account.deposit(-1);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
