import exceptions.ExceptionDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

       //  ExceptionDemo.show("hello");

        //catching exception

        try{
           var file = new FileReader("file.txt");
            System.out.println("Read File");
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}