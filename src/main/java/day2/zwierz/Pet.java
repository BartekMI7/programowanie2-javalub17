package day2.zwierz;

import day2.zwierz.zwierzaki.FoodKind;

import java.util.List;

public interface Pet {
    public List<FoodKind> foodKind();

    void doSound();

    void doIntroduce();

    void doFeed(Food food);

    void entertainMe();

}

