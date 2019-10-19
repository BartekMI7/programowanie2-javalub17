package day2.zwierz.zwierzaki;

import day2.zwierz.Food;
import day2.zwierz.Pet;

import java.util.Arrays;
import java.util.List;

public class Dog implements Pet {
    private final List<FoodKind> dogFood = Arrays.asList(FoodKind.KARMA, FoodKind.MLEKO, FoodKind.MIESO);

    @Override
    public List<FoodKind> foodKind() {
        return dogFood;
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
