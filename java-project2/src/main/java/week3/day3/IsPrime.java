package week3.day3;

public class IsPrime {
    public static void main(String[] args) {
        int num = 7;
        int factors = 0; //약수의 개수
        for(int i = 2; i < num; i++){ //1~6까지
            if(num % i == 0) factors++;

        }
        //factors = 1
        System.out.printf("facotrs: %d\n", factors);
        System.out.println(factors == 0 ? num + "은 소수입니다." : num + "은 소수가 아닙니다.");
    }

}
