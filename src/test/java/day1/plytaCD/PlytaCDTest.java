package day1.plytaCD;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PlytaCDTest {
    @Test
    public void testConstructor() {
        //given
        List<Utwor> inputUtwory = new ArrayList<>();
        PlytaCD plytaCD = new PlytaCD("Tata Kazika", "1993", inputUtwory);

        //when
        List<Utwor> outputUtwory = new ArrayList<>();


        //then
        assertEquals(inputUtwory, outputUtwory);

    }

    @Test
    public void testSearch() {
        //given
        List<Utwor> inputUtwory = new ArrayList<>();
        inputUtwory.add(new Utwor("Dziewczyna bez zeba na przedzie", "Kazik", 3.2));
        inputUtwory.add(new Utwor("Maciek ja tylko zartowalem", "Kazik", 4.3));
        inputUtwory.add(new Utwor("Baranek", "Kazik", 3.22));
        PlytaCD plytaCD = new PlytaCD("Tata Kazika", "1993", inputUtwory);

        //when

        Utwor znalezionyUtwor = plytaCD.search("Maciek ja tylko zartowalem");

        //then
        assertEquals("Kazik", znalezionyUtwor.getAuthor());
        assertEquals("Maciek ja tylko zartowalem", znalezionyUtwor.getTitle());
    }

    @Test
    public void testSearchNotFound() {
        //given
        List<Utwor> inputUtwory = new ArrayList<>();
        inputUtwory.add(new Utwor("Dziewczyna bez zeba na przedzie", "Kazik", 3.2));
        inputUtwory.add(new Utwor("Maciek ja tylko zartowalem", "Kazik", 4.3));
        inputUtwory.add(new Utwor("Baranek", "Kazik", 3.22));
        PlytaCD plytaCD = new PlytaCD("Tata Kazika", "1993", inputUtwory);

        //when

        Utwor znalezionyUtwor = plytaCD.search("Celina");

        //then
        assertNull(znalezionyUtwor);

    }

    @Test
    public void testSearchNull() {
        //given
        List<Utwor> inputUtwory = new ArrayList<>();
        inputUtwory.add(new Utwor("Dziewczyna bez zeba na przedzie", "Kazik", 3.2));
        inputUtwory.add(new Utwor("Maciek ja tylko zartowalem", "Kazik", 4.3));
        inputUtwory.add(new Utwor("Baranek", "Kazik", 3.22));
        PlytaCD plytaCD = new PlytaCD("Tata Kazika", "1993", inputUtwory);

        //when
        Utwor znalezionyUtwor = plytaCD.search(null);

        //then
        assertNull(znalezionyUtwor);

    }
}