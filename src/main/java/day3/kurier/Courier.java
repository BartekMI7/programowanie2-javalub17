package day3.kurier;

public class Courier implements DHLTypes<Courier> {
    private String name;
    private String telephonNumber;
    private Long idCourier;


    public Courier(String name, String telephonNumber, Long idCourier) {
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

    public Long getIdCourier() {
        return idCourier;
    }

    @Override
    public boolean compareType(Courier obj) {
        return idCourier.equals(obj.getIdCourier());
    }
}
