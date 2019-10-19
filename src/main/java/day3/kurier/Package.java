package day3.kurier;

import java.time.LocalDate;

public class Package {
    private Adress adressSender;
    private int idPackage;
    private LocalDate sendingDate;
    private LocalDate deliveryDate;
    private Adress AdressRecever;
    private ParamsPackage paramsPackage;

    public Package(Adress adressSender, int idPackage, LocalDate sendingDate, LocalDate deliveryDate, Adress adressRecever, ParamsPackage paramsPackage) {
        this.adressSender = adressSender;
        this.idPackage = idPackage;
        this.sendingDate = sendingDate;
        this.deliveryDate = deliveryDate;
        this.AdressRecever = adressRecever;
        this.paramsPackage = paramsPackage;
    }

    public Adress getAdressSender() {
        return adressSender;
    }

    public int getIdPackage() {
        return idPackage;
    }

    public LocalDate getSendingDate() {
        return sendingDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public Adress getAdressRecever() {
        return AdressRecever;
    }

    public ParamsPackage getParamsPackage() {
        return paramsPackage;
    }
}
