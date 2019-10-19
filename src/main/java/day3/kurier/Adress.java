package day3.kurier;

public class Adress {
    private String street;
    private String city;
    private int houseNumber;
    private int postCode;

    public Adress(String street, String city, int houseNumber, int postCode) {
        this.street = street;
        this.city = city;
        this.houseNumber = houseNumber;
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getPostCode() {
        return postCode;
    }
}
