package week4.day4;

public class Address {
    private String fullAddr;
    private String sido; //state
    private String sigungu; // city, street

    public Address(){}

    public Address(String fullAddr, String sido, String sigungu) {
        this.fullAddr = fullAddr;
        this.sido = sido;
        this.sigungu = sigungu;
    }

}
