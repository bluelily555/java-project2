package week3.day3;

import java.util.Arrays;

public class PrimeFactorization {
    public static void main(String[] args) {
        int n1 = 12;
        System.out.println(Arrays.toString(Solution.solution(n1)));
        System.out.println();
        int n2 = 17;
        System.out.println(Arrays.toString(Solution.solution(n2)));
        System.out.println();
        int n3 = 420;
        System.out.println(Arrays.toString(Solution.solution(n3)));
    }
}

class Solution {
    public static int[] solution(int n) {
        int[] tempArr = new int[n];
        for (int i = 2; i <= n ; i++) {
            while (n % i == 0) {
                tempArr[i-1] = i;
                n /= i;
            }
        }

        int cnt = 0;
        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i] > 0) cnt++;
        }
        int[] answer = new int[cnt];

        int idx = 0;
        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i] != 0) answer[idx++] = tempArr[i];
        }

        return answer;
    }
}