package day2.zwierz.zwierzaki;

import day2.zwierz.Food;
import day2.zwierz.Pet;

import java.util.Arrays;
import java.util.List;

public class Fish implements Pet {
    private final List<FoodKind> fishFood = Arrays.asList(FoodKind.RYBY, FoodKind.KARMA);

    @Override
    public List<FoodKind> foodKind() {
        return fishFood;
    }

    @Override
    public void doSound() {

    }

    @Override
    public void doIntroduce() {

    }

    @Override
    public void doFeed(Food food) {

    }

    @Override
    public void entertainMe() {

    }
}
