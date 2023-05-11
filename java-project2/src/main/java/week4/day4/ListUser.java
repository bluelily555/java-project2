package week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User user1 = new User("김미미", "01012341234", 37);
        users.add(user1);

        User user2 = new User("김나나", "01012341235", 14);
        users.add(user2);

        for(User user : users){
            System.out.printf("%s님의 전화번호는 %s입니다.\n", user.getName(), user.getPhoneNumber());
        }
    }
}
