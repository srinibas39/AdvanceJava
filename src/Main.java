import exceptions.CustomInsufficientBalanceException;
import exceptions.ExceptionDemo;
import generics.GenericList;
import generics.List;
import generics.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {


//        Excptions
//        try {
//            //ExceptionDemo.show();
//            ExceptionDemo.showWithdraw();
//        }
//        catch (Throwable e ){
//            System.out.println("Unexpected error occured");
//        }




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


// Generics

//        var list = new List();
//        list.add(10);
//        list.add("");
//        list.add(new User());
//
//       ;
//        ;
//
//        System.out.println(list.get(0));
//        //here list.get(10)--> primitive type ==> list.get(Integer.valurOf(10))
//        //converting yo primitive   to reference types
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));

        //generic list
//        var genericList = new GenericList<Integer>();
//        genericList.add(10);
//        var genericListUser = new GenericList<User>();
//        genericListUser.add(new User());
//
//        //Boxing and UnBoxing
//
//        GenericList<Double> listD = new GenericList<Double>();
//
//        //boxing --> java converts primimtie type to its wrapper instance
//        listD.add(1.1);
//        //unboxing --. java converts its wrapper instance to its specific primitiv type
//        listD.get(0);


// comparable

        var user1 = new User(10);
        var user2 = new User(20);

        int result = user1.compareTo(user2);

        if(result < 0){
            System.out.println("user1 < user2");
        }
        else if(result > 0){
            System.out.println("user1 > user2 ");
        }
        else{
            System.out.println("user1 is equal to user2");
        }



    }
}