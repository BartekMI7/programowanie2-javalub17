package day2.zwierz;

import day2.zwierz.zwierzaki.FoodKind;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private List<Pet> pets = new ArrayList<>();
    private List<Food> food = new ArrayList<>();
    private List<FoodKind> foodToBuy = new ArrayList<>();


    public void addPet(Pet pet) {

    }

    public void addFood(Food food) {

    }

    public void deletePet(Pet pet) {

    }

    public void feedPet() {
        pets.stream().forEach(a -> {
            List<FoodKind> foodKinds = a.foodKind();
            Food foods = food.stream().filter(b -> foodKinds.contains(b.getFoodkind())).findAny().orElse(null);

            if (foods == null) {
                System.out.println("Brak jedzenia dla zwierzaka");
                foodToBuy.addAll(foodKinds);
            } else {
                System.out.println("tu bedzie metoda");
            }
        });
    }
}
