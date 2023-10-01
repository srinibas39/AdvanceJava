package LambdaExpressionAndFunctionalInterfaces;

public class LambdasDemo {

    public static  void show(){
        //dependecy injection
        greet(new ConsolePrinter());
    }


    //Here I need to talk with the interface
    public static void greet(Printer printer){
        printer.print("Hello printer");
    }
}
