package day2.zwierz.zwierzaki;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class FishTest {
    @Test
    public void testFoodKind() {
        //given
        Fish fish = new Fish();


        //when
        List<FoodKind> foodKinds = fish.foodKind();

        //then
        assertTrue(fish.foodKind().contains(FoodKind.RYBY));
        assertTrue(fish.foodKind().contains(FoodKind.KARMA));

    }

}