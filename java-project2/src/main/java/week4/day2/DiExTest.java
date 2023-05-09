package week4.day2;

public class DiExTest {
    public static void main(String[] args) {
//         = new PyramidShapeDrawer(); //서로 다른 구현 클래스 이므로 type mismatch로 변수 선언 불가

        ShapeDrawer sd1 = new PyramidShapeDrawer(); //상위 클래스로 선언된 변수에는 하위 클래스 객체로 생성 가능
        DiEx de = new DiEx(sd1);

        sd1.printShape(5);
        de.doSth(); //주입된 구현 클래스의 동작을 수행함.

        //내부의 shapeDrawer를 구현한 내용이 없기 때문에 NullPointerException 발생. 추상클래스는 알맹이가 없는 빈껍데기이기 때문에 그 자체만으로는 사용할 수 없고 반드시 구현 클래스로 생성해서 사용해야함.
//        DiEx de = new DiEx();
//        de.doSth();

    }
}
