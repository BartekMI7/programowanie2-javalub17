package day2.cars;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class WypozyczenieTest {
    @Test
    public void testWypozyczenie() throws ParseException {
        String patterm = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patterm);

        //given
        Klient klient = new Klient("Jan", "Kowalski", "ul. Dluga 5", "ABC123456");
        Samochod samochod = new Samochod("Kia", "LU123456", 2019, 2135L);
        Date dataOd = simpleDateFormat.parse("2019-10-15");
        Date dataDo = simpleDateFormat.parse("2019-10-22");

        Wypozyczenie wypozyczenie = new Wypozyczenie(klient, samochod, dataOd, dataDo);

        //when
        //then
        assertEquals(klient, wypozyczenie.getKlient());
        assertEquals(samochod, wypozyczenie.getSamochod());
        assertEquals(dataOd, wypozyczenie.getDataOd());
        assertEquals(dataDo, wypozyczenie.getDataDo());


    }

}