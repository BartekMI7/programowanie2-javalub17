package day2.cars;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class RezerwacjaTest {

    @Test
    public void testRezerwacja() throws ParseException {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        //given
        Klient klient = new Klient("Jan", "Kowalski", "ul. Dluga 5", "ABC123456");
        Samochod samochod = new Samochod("Kia", "LU123456", 2019, 2135L);
        Date dataOd = simpleDateFormat.parse("2019-10-15");
        Date dataDo = simpleDateFormat.parse("2019-10-22");
        Rezerwacja rezerwacja = new Rezerwacja(klient, samochod, dataOd, dataDo);
        //when
        //then
        assertEquals(klient, rezerwacja.getKlient());
        assertEquals(samochod, rezerwacja.getSamochod());
        assertEquals(dataOd, rezerwacja.getDataOd());
        assertEquals(dataDo, rezerwacja.getDataDo());

    }

}