import exceptions.ExceptionDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        ExceptionDemo.show();

       //  ExceptionDemo.show("hello");

        //FileReader reader= null;

        //catching exception


//        try(
//                var reader = new FileReader("file.txt");
//                var writer = new FileWriter("Hello file");
//        ){
//            //reader = new FileReader("file.txt");
//           reader.read();
//           var data = new SimpleDateFormat().parse("");
//
//            System.out.println("Read File");
//        }
////        catch(FileNotFoundException e){
////            System.out.println(e.getMessage());
////        }
//        catch (IOException | ParseException e){
//            System.out.println(e.getMessage());
//        }
////        catch(ParseException e){
////            System.out.println(e.getMessage());
////        }
//        //sometimes we dont have to write finally wehn we are handling external reaources in try block
////        finally {
////            try{
////                if(reader!=null){
////                    reader.close();
////                }
////            }
////            catch (IOException e){
////                e.printStackTrace();
////            }
////        }


    }
}