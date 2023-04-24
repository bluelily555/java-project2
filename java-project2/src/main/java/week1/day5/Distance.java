package week1.day5;

public class Distance { //도전과제
    Point p1;
    Point p2;

    public Distance(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public void getDistance(){

        int xDistance = p1.x - p2.x;
        int yDistance = p1.y - p2.y;

        if(xDistance < 0) xDistance -= (2*xDistance);

        if(yDistance < 0) yDistance -= (2*yDistance);

        double pointDistance = Math.sqrt(xDistance*xDistance + yDistance*yDistance);

        System.out.printf("root %d", pointDistance);

    }


}
