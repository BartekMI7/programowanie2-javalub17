package day2.tel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirmaTest {
    @Test
    public void testOpis() {
        //given
        Firma firma = new Firma();
        //when
        //then
        assertEquals("dane kontaktowe firmy", firma.opis());
    }


    @Test
    public void testConstructor() {
        //given
        NrTelefoniczny nrTelefoniczny = new NrTelefoniczny("081", "516551341");
        Firma firma = new Firma("SDA", "al. Raclawickie 8", nrTelefoniczny);
        //when
        //then
        assertEquals("SDA", firma.getNazwaFirmy());
        assertEquals("al. Raclawickie 8", firma.getAdres());
        assertEquals(nrTelefoniczny, firma.getNrTelefonu());


    }

}