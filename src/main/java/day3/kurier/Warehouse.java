package day3.kurier;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Warehouse implements DHLTypes<Warehouse> {
    private final List<Package> listPackage = new ArrayList<>();
    private Long idWarehouse;
    private Adress AdressWarehouse;

    public Warehouse(Long idAdress, Adress adressWarehouse) {
        this.idWarehouse = idAdress;
        this.AdressWarehouse = adressWarehouse;
    }

    public List<Package> getListPackage() {
        return listPackage;
    }

    public Long getIdWarehouse() {
        return idWarehouse;
    }

    public Adress getAdressWarehouse() {
        return AdressWarehouse;
    }

    public void addPackage(Package newPackage) {
        int totalLength = newPackage.getParamsPackage().getHeight() +
                newPackage.getParamsPackage().getLength() +
                newPackage.getParamsPackage().getWidth();

        double totalWeight = newPackage.getParamsPackage().getWeight();

        Optional<Package> exist = listPackage
                .stream()
                .filter(a -> a.getIdPackage() == (newPackage.getIdPackage()))
                .findAny();


        if (exist.isPresent()) {
            throw new IllegalStateException("Given package with the same ID already exist");
        }

        if (totalLength > 500) {
            throw new IllegalStateException("Too big package");
        }

        if (totalWeight > 20) {
            throw new IllegalStateException("To heavy package");

        } else {
            listPackage.add(newPackage);
        }

    }

    public void removePackage(Package newPackage) {

    }


    @Override
    public boolean compareType(Warehouse obj) {
        return idWarehouse.equals(obj.getIdWarehouse());
    }
}
