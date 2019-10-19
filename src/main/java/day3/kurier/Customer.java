package day3.kurier;



public class Customer {
    private String firstName;
    private String lastName;
    private String adress;
    private String telephonNumber;
    private Long idCustomer;


    public Customer(String firstName, String lastName, String adress, String telephonNumber, Long idCustomer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.telephonNumber = telephonNumber;
        this.idCustomer = idCustomer;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return adress;
    }

    public String getTelephonNumber() {
        return telephonNumber;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }
}
