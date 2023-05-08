package week4.day1;

public class Greet {
    public void printHello(){
        System.out.println("Hello");
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageWithName(String name, String message){
        System.out.printf("%s님 %s\n", name, message);
    }
}
