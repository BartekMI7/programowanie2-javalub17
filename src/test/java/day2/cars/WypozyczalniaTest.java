package day2.cars;


import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class WypozyczalniaTest {

    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    @Test(expected = IllegalStateException.class)
    public void testDodajWypozyczenie() throws ParseException {
        // given
        Klient klient = new Klient("Jan", "Kowalski", "ul. Bajkowa 12, Lublin","PGH6753");
        Samochod samochod = new Samochod("Audi", "LU1726RT", 2015, 10000L);
        Date dateOd = simpleDateFormat.parse("2019-10-04");
        Date dateDo = simpleDateFormat.parse("2019-10-05");
        Rezerwacja rezerwacja = new Rezerwacja(klient, samochod, dateOd, dateDo);
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        // when
        wypozyczalnia.dodajRezerwacje(rezerwacja);

        // then
        wypozyczalnia.dodajRezerwacje(rezerwacja);
    }

    @Test (expected = IllegalStateException.class)
    public void testDodajWypozyczenie2() throws ParseException {
        // given
        Klient klient = new Klient("Jan", "Kowalski", "ul. Bajkowa 12, Lublin", "PGH6753");
        Samochod samochod = new Samochod("Audi", "LU1726RT", 2015, 10000L);
        Date dateOd = simpleDateFormat.parse("2019-10-04");
        Date dateDo = simpleDateFormat.parse("2019-10-08");
        Rezerwacja rezerwacja = new Rezerwacja(klient, samochod, dateOd, dateDo);
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        // when
        wypozyczalnia.dodajRezerwacje(rezerwacja);
        // then
        Date dateOd1 = simpleDateFormat.parse("2019-10-06");
        Date dateDo2 = simpleDateFormat.parse("2019-10-07");
        Rezerwacja rezerwacja1 = new Rezerwacja(klient, samochod, dateOd1, dateDo2);
        wypozyczalnia.dodajRezerwacje(rezerwacja1);
    }


    @Test (expected = IllegalStateException.class)
    public void testDodajWypozyczenie3() throws ParseException {
        // given
        Klient klient = new Klient("Jan", "Kowalski", "ul. Bajkowa 12, Lublin", "PGH6753");
        Samochod samochod = new Samochod("Audi", "LU1726RT", 2015, 10000L);
        Date dateOd = simpleDateFormat.parse("2019-10-04");
        Date dateDo = simpleDateFormat.parse("2019-10-08");
        Rezerwacja rezerwacja = new Rezerwacja(klient, samochod, dateOd, dateDo);
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        // when
        wypozyczalnia.dodajRezerwacje(rezerwacja);
        // then
        Date dateOd1 = simpleDateFormat.parse("2019-10-02");
        Date dateDo2 = simpleDateFormat.parse("2019-10-05");
        Rezerwacja rezerwacja1 = new Rezerwacja(klient, samochod, dateOd1, dateDo2);
        wypozyczalnia.dodajRezerwacje(rezerwacja1);
    }


    @Test (expected = IllegalStateException.class)
    public void testDodajWypozyczenie4() throws ParseException {
        // given
        Klient klient = new Klient("Jan", "Kowalski", "ul. Bajkowa 12, Lublin", "PGH6753");
        Samochod samochod = new Samochod("Audi", "LU1726RT", 2015, 10000L);
        Date dateOd = simpleDateFormat.parse("2019-10-04");
        Date dateDo = simpleDateFormat.parse("2019-10-08");
        Rezerwacja rezerwacja = new Rezerwacja(klient, samochod, dateOd, dateDo);
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        // when
        wypozyczalnia.dodajRezerwacje(rezerwacja);
        // then
        Date dateOd1 = simpleDateFormat.parse("2019-10-07");
        Date dateDo2 = simpleDateFormat.parse("2019-10-12");
        Rezerwacja rezerwacja1 = new Rezerwacja(klient, samochod, dateOd1, dateDo2);
        wypozyczalnia.dodajRezerwacje(rezerwacja1);
    }


    @Test (expected = IllegalStateException.class)
    public void testDodajWypozyczenie5() throws ParseException {
        // given
        Klient klient = new Klient("Jan", "Kowalski", "ul. Bajkowa 12, Lublin", "PGH6753");
        Samochod samochod = new Samochod("Audi", "LU1726RT", 2015, 10000L);
        Date dateOd = simpleDateFormat.parse("2019-10-04");
        Date dateDo = simpleDateFormat.parse("2019-10-08");
        Rezerwacja rezerwacja = new Rezerwacja(klient, samochod, dateOd, dateDo);
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        // when
        wypozyczalnia.dodajRezerwacje(rezerwacja);
        // then
        Date dateOd1 = simpleDateFormat.parse("2019-10-03");
        Date dateDo2 = simpleDateFormat.parse("2019-10-12");
        Rezerwacja rezerwacja1 = new Rezerwacja(klient, samochod, dateOd1, dateDo2);
        wypozyczalnia.dodajRezerwacje(rezerwacja1);
    }
}