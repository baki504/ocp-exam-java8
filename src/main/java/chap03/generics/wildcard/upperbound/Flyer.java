package chap03.generics.wildcard.upperbound;

import java.util.Arrays;
import java.util.List;

public interface Flyer {
    void fly();
}

class HangGlider implements Flyer {
    @Override
    public void fly() {
    }

}

class Goose implements Flyer {
    @Override
    public void fly() {
    }

}

class Sample {
    private void anyFlyer(List<Flyer> flyers) {
        System.out.println("-- anyFlyer --");
        flyers.forEach(System.out::println);
    }

    private void groupOfFlyers(List<? extends Flyer> flyers) {
        System.out.println("-- groupOfFlyers --");
        flyers.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Flyer> flyers = Arrays.asList(new Flyer[] { new HangGlider(), new Goose() });
        List<HangGlider> hangGliders = Arrays.asList(new HangGlider[] { new HangGlider(), new HangGlider() });
        List<Goose> gooses = Arrays.asList(new Goose[] { new Goose(), new Goose() });
        new Sample().anyFlyer(flyers);
        // new Sample().anyFlyer(hangGliders); // does not compile
        new Sample().groupOfFlyers(flyers);
        new Sample().groupOfFlyers(hangGliders);
        new Sample().groupOfFlyers(gooses);
    }
}