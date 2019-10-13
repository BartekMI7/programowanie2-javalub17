import day1.validators.PeselValidator;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PeselValidatorTest {

    @Test
    public void testPeselNull() {
        //given - tworzymy pesel ktory bedzie nulem
        String pesel = null;
        PeselValidator validator = new PeselValidator();

        //when - co jest testowane
        boolean result = validator.validate(pesel);

        //then
        assertFalse(result);

    }

    @Test
    public void testPeselCorrect() {
        //given
        String pesel = "02070803628";
        PeselValidator validator = new PeselValidator();

        //when - co jest testowane
        boolean result = validator.validate(pesel);

        //then
        assertTrue(result);

    }

}