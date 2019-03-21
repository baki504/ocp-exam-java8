package chap02.design.immutable2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public final class Animal {
    private final String species;
    private final int age;
    private final List<String> favoriteFoods;

    public Animal(String species, int age, List<String> favoriteFoods) {
        this.species = species;
        this.age = age;

        if (favoriteFoods == null) {
            throw new RuntimeException(" favoriteFoods is required");
        }

        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFood(int index) {
        return favoriteFoods.get(index);
    }

    public static void main(String[] args) {
        Animal lion = new Animal("lion", 5, Arrays.asList(" meat", "more meat"));

        // Create a new Animal instance using data from the first instance
        List<String> favoriteFoods = new ArrayList<String>();

        //        for (int i = 0; i < lion.getFavoriteFoodsCount(); i++) {
        //            favoriteFoods.add(lion.getFavoriteFood(i));
        //        }

        IntStream.range(0, lion.getFavoriteFoodsCount())
                .forEach(i -> favoriteFoods.add(lion.getFavoriteFood(i)));

        Animal updatedLion = new Animal(lion.getSpecies(), lion.getAge() + 1, favoriteFoods);

        System.out.println(updatedLion);

    }
}
