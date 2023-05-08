package week4.day1;

public class UserFactory {
    User getAdultUser(){
        User user = new User();
        user.age = 34;
        return user;
    }

}
