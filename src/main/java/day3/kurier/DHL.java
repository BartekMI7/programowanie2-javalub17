package day3.kurier;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DHL {
    private final List<Warehouse> warehouseList = new ArrayList<>();
    private final List<Customer> customerList = new ArrayList<>();
    private final List<Courier> courierList = new ArrayList<>();

    public List<Warehouse> getWarehouseList() {
        return warehouseList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public List<Courier> getCourierList() {
        return courierList;
    }

    public void addWarehouse(Warehouse warehouse) {
        boolean warehouseExist = warehouseList.stream().filter(a -> a.getIdWarehouse().equals(warehouse.getIdWarehouse()))
                .findAny().isPresent();
        if (!warehouseExist) {
            warehouseList.add(warehouse);
        }
    }

    public void addCourier(Courier courier) {
        boolean courierExist = courierList.stream().filter(a -> a.getIdCourier().equals(courier.getIdCourier()))
                .findAny().isPresent();
        if (!courierExist) {
            courierList.add(courier);
        }

    }

    public void addCustomer(Customer customer) {
        boolean customerExist = customerList.stream().filter(a -> a.getIdCustomer().equals(customer.getIdCustomer()))
                .findAny().isPresent();
        if (!customerExist) {
            customerList.add(customer);
        }
    }

    public void removeWarehouse(Warehouse warehouse) {
        Optional<Warehouse> warehouseExist = warehouseList.stream()
                .filter(a -> a.getIdWarehouse().equals(warehouse.getIdWarehouse()))
                .findAny();

        if (!warehouseExist.isPresent()) {
            throw new IllegalArgumentException("nie znaleziono magazynu");
        } else {
            warehouseList.remove(warehouseExist.get());
        }
    }

    public void removeCustomer(Customer customer) {
        Optional<Customer> customerExist = customerList.stream()
                .filter(a -> a.getIdCustomer().equals(customer.getIdCustomer()))
                .findAny();
        if (!customerExist.isPresent()){
            throw new IllegalArgumentException("nie znaleziono klienta");
        }
        else {
            customerList.remove(customerExist.get());
        }
    }

    public void removeCourier(Courier courier) {
        Optional<Courier>courierExist = courierList.stream()
                .filter(a->a.getIdCourier().equals(courier.getIdCourier()))
                .findAny();
        if (!courierExist.isPresent()){
            throw new IllegalArgumentException("nie znaleziono kuriera");

        }
        else {
            courierList.remove(courierExist.get());
        }

    }


}
