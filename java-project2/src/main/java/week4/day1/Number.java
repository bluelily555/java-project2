package week4.day1;

public class Number {
    private int num = 10;

    public boolean isOdd(){
        return num % 2 != 0;
    }

    public boolean isEven(){
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Number num = new Number();
        System.out.printf("짝수인지? %b\n", num.isEven());
        System.out.printf("홀수인지? %b\n", num.isOdd());
    }
}
