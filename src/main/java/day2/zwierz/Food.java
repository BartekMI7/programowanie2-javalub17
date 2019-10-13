package day2.zwierz;

import day2.zwierz.zwierzaki.FoodKind;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Food {
    private String foodDescription;
    private int foodAmount;
    private FoodKind foodkind;

}
