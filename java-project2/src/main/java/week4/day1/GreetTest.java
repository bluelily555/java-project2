package week4.day1;

public class GreetTest {
    public static void main(String[] args) {
        Greet greet = new Greet();
        greet.printHello();

        greet.printMessage("안녕하세요.");
        greet.printMessageWithName("김경록", "좋은 하루 되세요.");
    }
}
