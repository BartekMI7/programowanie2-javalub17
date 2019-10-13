package day2.zwierz.zwierzaki;

import day2.zwierz.Food;
import day2.zwierz.Pet;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter

public class Bird implements Pet {
    private final List<FoodKind> birdFood = Arrays.asList(FoodKind.ZBOZE, FoodKind.MYSZY);


    @Override
    public List<FoodKind> foodKind() {
        return birdFood;
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
