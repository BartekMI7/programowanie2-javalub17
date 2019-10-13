package day2.cars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SamochodTest {
    @Test
    public void testSamochod() {
        //given
        Samochod samochod = new Samochod("Kia", "LU123456", 2019, 5236L);
        //when
        //then
        assertEquals("Kia", samochod.getModel());
        assertEquals("LU123456", samochod.getNrRejestracyjny());
        assertEquals(2019, samochod.getRokProdukcji());
        assertEquals(5236L, samochod.getPrzebieg());
    }

}