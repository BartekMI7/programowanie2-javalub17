package day2.tel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OsobaTest {
    @Test
    public void testOpis() {


        //given
        Osoba osoba = new Osoba();

        //when


        //then
        assertEquals("dane kontaktowe osoby nie bedacej firmą", osoba.opis());

    }

    @Test
    public void testConstructor1() {
        //given
        NrTelefoniczny nrTelefoniczny = new NrTelefoniczny("081", "516551341");
        Osoba osoba = new Osoba("Jan", "Kowalski", "al. Ujazdowskie", nrTelefoniczny);
        //when
        //then
        assertEquals("Jan", osoba.getImie());
        assertEquals("Kowalski", osoba.getNazwisko());
        assertEquals("al. Ujazdowskie", osoba.getAdres());
        assertEquals(nrTelefoniczny, osoba.getNrTelefonu());


    }
}