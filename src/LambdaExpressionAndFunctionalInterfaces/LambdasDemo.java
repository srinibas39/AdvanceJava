package LambdaExpressionAndFunctionalInterfaces;

public class LambdasDemo {

    public static  void show(){
        //dependecy injection
        //greet(new ConsolePrinter());

        //anonymous inner class
//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//                System.out.println("Printed "+message);
//            }
//        });

//        improvement over anonymous lambda expression

//        greet((String message) ->{
//            System.out.println("Pinted "+ message);
//        });

//        more simplification of lambda expression
        greet(message -> System.out.println("Printed "+message));
    }


    //Here I need to talk with the interface
    public static void greet(Printer printer){
        printer.print("Hello printer");
    }
}
