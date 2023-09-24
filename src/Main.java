import exceptions.ExceptionDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

       //  ExceptionDemo.show("hello");

        FileReader reader= null;

        //catching exception


        try{
            reader = new FileReader("file.txt");
           reader.read();
           var data = new SimpleDateFormat().parse("");

            System.out.println("Read File");
        }
//        catch(FileNotFoundException e){
//            System.out.println(e.getMessage());
//        }
        catch (IOException | ParseException e){
            System.out.println(e.getMessage());
        }
//        catch(ParseException e){
//            System.out.println(e.getMessage());
//        }
        finally {
            try{
                reader.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}