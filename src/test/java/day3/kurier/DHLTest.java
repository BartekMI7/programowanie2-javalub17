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

}