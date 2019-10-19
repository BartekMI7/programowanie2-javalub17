package day3.kurier;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements DHLTypes<Warehouse> {
    private final List<Package> LISTPACKAGE = new ArrayList<>();
    private Long idWarehouse;
    private Adress AdressWarehouse;

    public Warehouse(Long idAdress, Adress adressWarehouse) {
        this.idWarehouse= idAdress;
        this.AdressWarehouse = adressWarehouse;
    }

    public List<Package> getLISTPACKAGE() {
        return LISTPACKAGE;
    }

    public Long getIdWarehouse() {
        return idWarehouse;
    }

    public Adress getAdressWarehouse() {
        return AdressWarehouse;
    }

    public void addPackage(Package newPackage){

    }

    public void removePackage(Package newPackage){

    }


    @Override
    public boolean compareType(Warehouse obj) {
        return idWarehouse.equals(obj.getIdWarehouse());
    }
}
