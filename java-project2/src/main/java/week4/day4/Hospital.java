package week4.day4;

public class Hospital {
    private String name;
    private Address address;
    private String phoneNumber;

    public Hospital(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = new Address(address);
        this.phoneNumber = phoneNumber;
    }
}
