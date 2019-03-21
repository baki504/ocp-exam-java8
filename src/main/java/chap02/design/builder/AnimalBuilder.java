package chap02.design.builder;

import java.util.Arrays;
import java.util.List;

import chap02.design.immutable2.Animal;

public class AnimalBuilder {
    private String species;
    private int age;
    private List<String> favoriteFoods;

    public AnimalBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }

    public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {

        this.favoriteFoods = favoriteFoods;
        return this;
    }

    public Animal build() {
        // return new Animal(species, age, null);
        return new Animal(species, age, favoriteFoods);
    }

    public static void main(String[] args) {
        AnimalBuilder duckBuilder = new AnimalBuilder();
        duckBuilder.setAge(4).setFavoriteFoods(Arrays.asList(" grass", " fish")).setSpecies(" duck");
        Animal duck = duckBuilder.build();
        Animal flamingo = new AnimalBuilder().setFavoriteFoods(Arrays.asList(" algae", " insects"))
                .setSpecies("flamingo").build();

    }
}
