package tg;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("왈왈 으르릉 컹컹컹");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();

        dog.eat();
        dog.makeSound();
    }
}



