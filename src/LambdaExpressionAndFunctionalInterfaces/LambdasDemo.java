package LambdaExpressionAndFunctionalInterfaces;

public class LambdasDemo {

    public LambdasDemo(String message) {
    }

    public  void print(String message){}

    public static void show(){
//       greet(message -> System.out.println(message));
//
//        //convert this to method experssion
//        //Class/Object :: method
//        greet(System.out :: println);


        //static cases
//        greet(message -> print(message));
//        greet(LambdasDemo :: print);

        //instance case
//
//        var demo = new LambdasDemo();
//        greet(message -> demo.print(message));
//
//        greet(demo :: print);

        //for constructor
        greet(message -> new LambdasDemo(message));

        greet(LambdasDemo:: new);

    }


    //Here I need to talk with the interface
    public static void greet(Printer printer){
        printer.print("Hello printer");
    }
}
