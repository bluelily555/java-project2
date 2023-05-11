package week4.day4;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        //문자형
        List<String>  strList = new ArrayList<>();
        strList.add("hello");
        strList.add("bye");
        strList.add("1");

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(34);
        intList.add(5);

        for (String str: strList) {
            System.out.println(str);
        }
        System.out.println("=====================");
        for (int i: intList
             ) {
            System.out.println(i);
        }

    }
}
