package tg;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * 3.14;
    }

    public static void main(String[] args) {
        Shape ractangle = new Ractangle(5, 10);
        Shape circle = new Circle(3.5);

        double area1 = ractangle.calculateArea();
        double perimeter1 = ractangle.calculatePerimeter();

        double area2 = circle.calculateArea();
        double perimeter2 = circle.calculatePerimeter();

        System.out.println("사각형의 넓이: " + area1);
        System.out.println("사각형의 둘레: " + perimeter1);
        System.out.println("원의 넓이: " + area2);
        System.out.println("원의 둘레: " + perimeter2);
    }
}
