package week5.day3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack1 {
    int[] arr =new int[10000];
    int pointer = 0;

    public void push(int value){
        arr[pointer++] = value;
    }
    public int pop(){
        if(isEmpty()) throw new EmptyStackException();
        return arr[--pointer];
    }

    public boolean isEmpty(){
        if(pointer == 0) return true;
        else return false;
    }
    public int peek(){
        if(isEmpty()) throw new EmptyStackException();
        else return arr[pointer -1];
    }

    public char[] inToPost(char[] infix){
        char[] operations = new char[infix.length+1];
        char[] result = new char[infix.length+1];
        int idx1 = 0;
        int idx2 = 0;

        char temp = '\0';
        for (int i = 0; i < infix.length; i++) {
            if(Character.isDigit(infix[i])){
                result[idx2++] = infix[i];
            } else {
                if(temp == '*' || temp == '/') result[idx2++] = infix[i];
                else {
                    result[idx2++] = temp;
                    temp = infix[i];
                }

            }
        }

//        for (int i = 0; i < infix.length; i++) {
//           if(Character.isDigit(infix[i])) result[idx2++] = infix[i];
//           else operations[idx1++] = infix[i];
//            System.out.println(Arrays.toString(result));
//        }
//        for (int i = 0; i <= idx1; i++) {
//            System.out.println(idx2);
//            result[idx2++] = operations[i];
//            System.out.println(idx2);
//        }
        return result;
    }


    public static void main(String[] args) {
        Stack1 st = new Stack1();

        st.push(1);
        System.out.println(st.toString());
        st.pop();
        System.out.println(st.isEmpty());
//        st.pop();

        char[] state = {'1', '-', '4', '*', '2'};
        state = st.inToPost(state);
        System.out.println(Arrays.toString(state));
    }
}
