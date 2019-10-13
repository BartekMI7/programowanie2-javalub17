package day2.zwierz.zwierzaki;

import day2.zwierz.Food;
import day2.zwierz.Pet;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter

public class Cat implements Pet {
    private final List<FoodKind> catFood = Arrays.asList(FoodKind.MYSZY, FoodKind.MIESO);


    @Override
    public List<FoodKind> foodKind() {
        return catFood;
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
