package day2.zwierz.zwierzaki;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class BirdTest {
    @Test
    public void testFoodKind() {
        //given
        Bird bird = new Bird();

        //when
        List<FoodKind> foodKinds = bird.foodKind();

        //then
        assertTrue(bird.foodKind().contains(FoodKind.ZBOZE));
        assertTrue(bird.foodKind().contains(FoodKind.MYSZY));

    }

}