package day1.plytaCD;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BibliotekaTest {
    @Test
    public void testAdd() {
        //given
        List<Utwor> listaUtworow = new ArrayList<>();
        listaUtworow.add(new Utwor("Highway", "AC/DC", 3.6));

        Biblioteka biblioteka = new Biblioteka();
        PlytaCD plytaCD = new PlytaCD("Back in black", "AC/DC", listaUtworow);

        //when
        biblioteka.addCD(plytaCD);
        List<PlytaCD> listaPlytResult = biblioteka.getListaPlyt();


        //then
        assertEquals(1, listaPlytResult.size());
        biblioteka.popCDName("Back in black");
        listaPlytResult = biblioteka.getListaPlyt();
        assertEquals(0, listaPlytResult.size());


    }

    @Test
    public void testSearchByName() {
        // given
        List<Utwor> listaUtworow = new ArrayList<>();
        listaUtworow.add(new Utwor("Highway", "AC/DC", 3.6));

        Biblioteka biblioteka = new Biblioteka();
        PlytaCD plytaCD = new PlytaCD("Back in black", "AC/DC", listaUtworow);
        //then
        biblioteka.addCD(plytaCD);
        PlytaCD foundCD = biblioteka.searchByTitle("Back in black");
        PlytaCD foundCD1 = biblioteka.searchByTitle("random title");

        //then

        assertNotNull(foundCD);
        assertNull(foundCD1);
    }

    @Test
    public void testToString() {
        // given
        List<Utwor> listaUtworow = new ArrayList<>();
        listaUtworow.add(new Utwor("Highway", "AC/DC", 3.6));
        listaUtworow.add(new Utwor("Thunder", "AC/DC", 3.8));
        listaUtworow.add(new Utwor("Random", "AC/DC", 3.8));

        Biblioteka biblioteka = new Biblioteka();
        PlytaCD plytaCD = new PlytaCD("Back in black", "2004", listaUtworow);

        //then
        biblioteka.addCD(plytaCD);
        String listedLibrary = biblioteka.toString();


        //then
        assertEquals("Back in black 2004 \n" +
                "Highway AC/DC 3.6\n" +
                "Thunder AC/DC 3.8\n" +
                "Random AC/DC 3.8\n", listedLibrary);


    }

    @Test
    public void saveTest() throws FileNotFoundException {
        //given
        List<Utwor> listaUtworow = new ArrayList<>();
        listaUtworow.add(new Utwor("Highway", "AC/DC", 3.6));
        listaUtworow.add(new Utwor("Thunder", "AC/DC", 3.8));
        listaUtworow.add(new Utwor("Random", "AC/DC", 3.8));

        Biblioteka biblioteka = new Biblioteka();
        PlytaCD plytaCD = new PlytaCD("Back in black", "2004", listaUtworow);
        biblioteka.addCD(plytaCD);


        List<Utwor> listaUtworow2 = new ArrayList<>();
        listaUtworow2.add(new Utwor("Random Title", "Random Author", 3.6));
        PlytaCD plytaCD2 = new PlytaCD("Sample CD", "2000", listaUtworow2);
        biblioteka.addCD(plytaCD2);

        //when
        biblioteka.save();

        //then
        biblioteka.getListaPlyt().clear();


        assertEquals(0, biblioteka.getListaPlyt().size());
        biblioteka.read();
        assertEquals(2, biblioteka.getListaPlyt().size());
        assertEquals(3, biblioteka.getListaPlyt().get(0).getUtwory().size());
        assertEquals(3, biblioteka.getListaPlyt().get(0).getUtwory().size());


    }

    @Test
    public void testRead() throws FileNotFoundException {
        //given
        Biblioteka biblioteka = new Biblioteka();

        //when
        biblioteka.read();

        //then
        List<PlytaCD> listaPlyt = biblioteka.getListaPlyt();

        assertEquals(2, listaPlyt.size());
        assertEquals(3, listaPlyt.get(0).getUtwory().size());
        assertEquals(1, listaPlyt.get(1).getUtwory().size());


    }


}