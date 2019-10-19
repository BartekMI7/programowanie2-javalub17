package day3.kurier;

import org.junit.Test;

import static org.junit.Assert.*;

public class DHLTest {
    @Test
    public void testAddWarehouse(){
        //given
        DHL dhl = new DHL();
        Adress warehouseAdres1 = new Adress("zl. Racławickie","Lublin",12,20532);
        Warehouse warehouse = new Warehouse(1L,warehouseAdres1);
        //when
        dhl.addWarehouse(warehouse);
        //then
        Warehouse warehouse1 = new Warehouse(1L,warehouseAdres1);

        dhl.removeWarehouse(warehouse);
        assertEquals(0,dhl.getWarehouseList().size());


    }

    @Test
    public void testAddCourier(){
        //given
        DHL dhl = new DHL();
        //Adress couriecAdress = new Adress("zl. Racławickie","Lublin",12,20532);
        Courier courier1 = new Courier("Jan Kowalski","4561245",1L);
        Courier courier2 = new Courier("Jan Kowal","4561255",2L);
        Courier courier3 = new Courier("Jan Kowalczyl","4561232",3L);
        //when
        dhl.addCourier(courier1);
        dhl.addCourier(courier2);
        dhl.addCourier(courier3);
        //then

        assertEquals(3,dhl.getCourierList().size());
    }
}