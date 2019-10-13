package day2.zwierz.zwierzaki;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class DogTest {
    @Test
    public void testFoodKind() {
        //given
        Dog dog = new Dog();


        //when
        List<FoodKind> foodKinds = dog.foodKind();
        //then
        assertTrue(dog.foodKind().contains(FoodKind.MIESO));
        assertTrue(dog.foodKind().contains(FoodKind.KARMA));
        assertTrue(dog.foodKind().contains(FoodKind.MLEKO));


    }

}