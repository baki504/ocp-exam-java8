package chap03.comparable;

import java.util.ArrayList;
import java.util.List;

public class LegacyDuck implements Comparable {
    private String name;

    public LegacyDuck(String name) {
        super();
        this.name = name;
    }

    @Override
    public int compareTo(Object obj) {
        // When dealing with legacy code, the compareTo() method requires a cast since it is passed an Object.
        LegacyDuck d = (LegacyDuck) obj;
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        LegacyDuck duck1 = new LegacyDuck("duck1");
        LegacyDuck duck2 = new LegacyDuck("duck2");
        System.out.println(duck1.compareTo(duck2));

        List<LegacyDuck> duckList = new ArrayList<>();
        duckList.add(duck2);
        duckList.add(duck1);
        System.out.println(duckList);

    }

}
