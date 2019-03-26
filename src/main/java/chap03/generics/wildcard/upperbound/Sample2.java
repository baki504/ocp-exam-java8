package chap03.generics.wildcard.upperbound;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {

    static class Bird {
    }

    static class Sparrow extends Bird {
    }

    public static void main(String[] args) {
        List<? extends Bird> birds = new ArrayList<Bird>();
        // birds.add(new Sparrow()); // does not compile
        // birds.add(new Bird()); // does not compile
        // birds.add(new Object()); // does not compile

        List<Bird> standardBirds = new ArrayList<>();
        standardBirds.add(new Bird());

    }
}
