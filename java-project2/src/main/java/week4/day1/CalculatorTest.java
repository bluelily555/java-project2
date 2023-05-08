package week4.day1;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.plus();
        System.out.println(result);

        calculator.printPlusOne(30);
        calculator.printPlusOne(100);
        calculator.printPlusOne(350);

        calculator.printPlus(10, 20);
        calculator.printPlus(20, 30);
    }
}
