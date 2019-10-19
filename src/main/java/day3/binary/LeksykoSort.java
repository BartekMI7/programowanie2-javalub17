package day3.binary;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeksykoSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "ala",
                "1",
                "2",
                "12",
                "22",
                "1000",
                "kot",
                "10",
                "0101",
                "111111111"

        );
        //Collections.sort(list);
        //System.out.println(Arrays.toString(list.toArray()));
        list.stream()
                .sorted()
                .forEach(a-> System.out.println(a));
    }
}
