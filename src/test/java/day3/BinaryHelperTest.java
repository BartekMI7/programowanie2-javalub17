package day3;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryHelperTest {
    @Test
    public void testConvertToBinary() {
        //given
        BinaryHelper binaryHelper = new BinaryHelper();

        //when
        List<String> result = binaryHelper.converToBinary(0, 10);


        //then
        //assertEquals("0",result.get(0));
        assertEquals("1", result.get(1));
        assertEquals("10", result.get(2));
        //assertEquals("11",result.get(3));
        assertEquals("100", result.get(3));
        assertEquals("101", result.get(4));
        //assertEquals("110",result.get(6));
        //assertEquals("111",result.get(7));
        assertEquals("1000", result.get(5));
        assertEquals("1001", result.get(6));
        assertEquals("1010", result.get(7));
    }

    @Test
    public void testConvertToBinaryPerformance() {
        //given
        BinaryHelper binaryHelper = new BinaryHelper();

        //when
        List<String> result = binaryHelper.converToBinary(0, 10000);


        //then
        //assertEquals("0",result.get(0));
        //assertEquals("1",result.get(1));
        //assertEquals("10",result.get(2));
        //assertEquals("11",result.get(3));
        //assertEquals("100",result.get(3));
        //assertEquals("101",result.get(4));
        //assertEquals("110",result.get(6));
        //assertEquals("111",result.get(7));
        //assertEquals("1000",result.get(5));
        //assertEquals("1001",result.get(6));
        //assertEquals("1010",result.get(7));
    }

    @Test
    public void testConcatZero() {
        //given
        BinaryHelper binaryHelper = new BinaryHelper();

        //when
        List<String> list = binaryHelper.converToBinary(0, 65000);
        List<String> listAfterTransform = binaryHelper.concatZeros(list, 7);

        //then
        listAfterTransform.forEach(v -> {
            assertEquals(7, v.length());
        });
        assertEquals("0000000", listAfterTransform.get(0));
        assertEquals("0000001", listAfterTransform.get(1));
    }
}