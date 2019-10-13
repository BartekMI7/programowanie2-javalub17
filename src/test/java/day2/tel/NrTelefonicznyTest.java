package day2.tel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NrTelefonicznyTest {

    @Test
    public void testNrTelefonicznyConstructor() {
        //given
        NrTelefoniczny nrTelefoniczny = new NrTelefoniczny("081", "516551341");
        //when


        //then
        assertEquals("081", nrTelefoniczny.getNrKierunkowy());
        assertEquals("516551341", nrTelefoniczny.getNrTelefonu());


    }

}