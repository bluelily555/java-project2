package week4.day2;

public class MultiplicationTable{
    private String multipleSimbol;

    public MultiplicationTable(String multipleSimbol){
        this.multipleSimbol = multipleSimbol;
    }
    public void printDan(int dan){
        //곱하기 기호 x로 표기
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSimbol, i, dan * i);
        }
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable("x");
        //2, 5, 7, 8
        mt.printDan(2);
        mt.printDan(5);

        MultiplicationTable mt2 = new MultiplicationTable("*");
        mt2.printDan(7);
        mt2.printDan(8);
    }
}
