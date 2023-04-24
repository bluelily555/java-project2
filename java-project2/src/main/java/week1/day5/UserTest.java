package week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User kyeongrok = new User();
        kyeongrok.name = "김경록";
        kyeongrok.phoneNumber = "010-0000-1234";
        kyeongrok.age = 37;

        User jaesung = new User();
        jaesung.name = "재성 매니저님";
        jaesung.phoneNumber = "010-0000-1235";
        jaesung.age = 24;

        System.out.printf("%s님은 성인입니까? %s\n", kyeongrok.name, kyeongrok.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", jaesung.name, jaesung.isAdult());
    }
}
