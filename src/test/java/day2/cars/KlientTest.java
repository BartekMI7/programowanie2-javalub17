package day2.cars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KlientTest {
    @Test
    public void testKlient() {
        //given
        Klient klient = new Klient("Jan", "Kowalski", "ul. Kowalska 5", "ABC19875412");
        //when
        //then
        assertEquals("Jan", klient.getImie());
        assertEquals("Kowalski", klient.getNazwisko());
        assertEquals("ul. Kowalska 5", klient.getAdres());
        assertEquals("ABC19875412", klient.getNumerDowodu());
    }
}