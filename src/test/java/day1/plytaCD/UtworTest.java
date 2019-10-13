package day1.plytaCD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtworTest {

    @Test
    public void testCostructor() {

        //given
        Utwor utwor = new Utwor("Baranek", "Kult", 3.4);

        //when
        String autor = utwor.getAuthor();
        String tytul = utwor.getTitle();
        double czas = utwor.getTime();


        //then
        assertEquals("Kult", autor);
        assertEquals("Baranek", tytul);
        assertEquals(Double.valueOf(3.4), Double.valueOf(czas));


    }

}