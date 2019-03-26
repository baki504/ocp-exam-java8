package chap03.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        Comparator<Duck> byWeight = new Comparator<Duck>() {
            @Override
            public int compare(Duck d1, Duck d2) {
                return d1.getWeight() - d2.getWeight();
            }
        };
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));

        Collections.sort(ducks);
        System.out.println(ducks); // [Puddles, Quack]

        Collections.sort(ducks, byWeight);
        System.out.println(ducks); // [Quack, Puddles]

        // DOES NOT COMPILE
        // Comparator <Duck> byWeight1 = new Comparator <Duck>() {
        //     public int compareTo( Duck d1, Duck d2) { // <- method name isn't correct. it must be "compare".
        //         return d1. getWeight()- d2. getWeight();
        //     }
        // };

        // ---

        Collections.sort(ducks, (d1, d2) -> d1.getWeight() - d2.getWeight());
        System.out.println(ducks);

        Comparator<Duck> byWeight2 = (d1, d2) -> d1.getWeight() - d2.getWeight();
        Collections.sort(ducks, byWeight2);
        System.out.println(ducks); // [Quack, Puddles]

        Comparator<Duck> byWeight3 = (Duck d1, Duck d2) -> d1.getWeight() - d2.getWeight();
        Collections.sort(ducks, byWeight3);
        System.out.println(ducks); // [Quack, Puddles]

        Comparator<Duck> byWeight4 = (d1, d2) -> {
            return d1.getWeight() - d2.getWeight();
        };
        Collections.sort(ducks, byWeight4);
        System.out.println(ducks); // [Quack, Puddles]

        Comparator<Duck> byWeight5 = (Duck d1, Duck d2) -> {
            return d1.getWeight() - d2.getWeight();
        };
        Collections.sort(ducks, byWeight5);
        System.out.println(ducks); // [Quack, Puddles]

    }

}
