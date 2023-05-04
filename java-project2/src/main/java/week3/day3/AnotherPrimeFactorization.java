package week3.day3;

import java.util.Arrays;

public class AnotherPrimeFactorization {
    public static void main(String[] args) {
        int n1 = 12;
        System.out.println(Arrays.toString(Solution1.solution(n1)));
        System.out.println();
        int n2 = 17;
        System.out.println(Arrays.toString(Solution1.solution(n2)));
        System.out.println();
        int n3 = 420;
        System.out.println(Arrays.toString(Solution1.solution(n3)));
    }
}

class Solution1{
    public static int[] solution(int n){
        int divisor = 2;
        int[] arr = new int[n + 1];
        int idx = 0;

        while(n > 1){
            if (n % divisor == 0) { //나누어 떨어질 때
                arr[idx++] = divisor;
                n /= divisor;
            } else { // 안나누어 떨어지면 ++. 이전 수로 나눠떨어지는 수는 더이상 중요하지 않음.
                divisor++;
            }
        }

        return arr;
    }
}
