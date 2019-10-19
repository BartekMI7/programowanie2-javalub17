package day3.kurier;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class WarehouseTest {
    @Test
    public void testWarehouseAddPackage(){

        //given
        ParamsPackage paramsPackage1 = new ParamsPackage(23, 43, 55, 18);
        Adress adress1 = new Adress("Raclawickie", "Lublin", 24, 20456);
        Package package1 = new Package(adress1, 4L, LocalDate.now(), null, adress1, paramsPackage1);
        Package package2 = new Package(adress1, 5L, LocalDate.now(), null, adress1, paramsPackage1);
        Warehouse warehouse1 = new Warehouse(10L, adress1);
        //when
        warehouse1.addPackage(package1);
        warehouse1.addPackage(package2);
        //then
        assertEquals(2,warehouse1.getListPackage().size());


    }

}