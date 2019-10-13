package day2.zwierz.zwierzaki;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class CatTest {
    @Test
    public void testFoodKind() {
        //given
        Cat cat = new Cat();


        //when
        List<FoodKind> foodKinds = cat.foodKind();

        //then
        assertTrue(cat.foodKind().contains(FoodKind.ZBOZE));
        assertTrue(cat.foodKind().contains(FoodKind.MYSZY));

    }

}