package week1.day5;

public class SpaceInvadersMemberVariable {
    int location;

    public void moveLeft(){
        location = location-1;
    }
    public void moveRight(){
        location = location+1;
    }

    public static void main(String[] args){
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();

        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();

        System.out.printf("최종 위치 : %d\n", simv.location);

        simv.moveRight();
        System.out.printf("최종 위치 : %d\n", simv.location);
    }

}
