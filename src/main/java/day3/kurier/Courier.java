package day3.kurier;

public class Courier {
    private String name;
    private String telephonNumber;
    private String idCourier;


    public Courier(String name, String telephonNumber, String idCourier) {
        this.name = name;
        this.telephonNumber = telephonNumber;
        this.idCourier = idCourier;
    }

    public String getName() {
        return name;
    }

    public String getTelephonNumber() {
        return telephonNumber;
    }

    public String getIdCourier() {
        return idCourier;
    }
}
