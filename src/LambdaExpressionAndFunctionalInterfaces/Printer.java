package LambdaExpressionAndFunctionalInterfaces;

public interface Printer {

    //this is a functional interface because it has one abstract method
    //If we have more than one abstract method then it is not a functional interfaces
    void print(String message);


    //In java interface we can have default methods which can have implementation
    //but this is  a bad java practice
//    default void printMessageTwice(String message){
//        for(int i=0; i<2;i++){
//            System.out.println(message);
//        }
//    }



}
