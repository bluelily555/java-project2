package week4.day4;

public class Hospital {
    private String name;
    private Address address;
    private String homepage; // 병원 전화번호 없어서 홈페이지 주소로 변경

    public Hospital(String name, String homepage, Address address) {
        this.name = name;
        this.address = address;
        this.homepage = homepage;
    }
}
