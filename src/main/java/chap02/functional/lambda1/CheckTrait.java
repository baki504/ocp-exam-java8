package chap02.functional.lambda1;

public interface CheckTrait {
    public boolean test(Animal a);
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return species;
    }

}

class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait trait) {
        if (trait.test(animal))
            System.out.println(animal);
    }

    public static void main(String[] args) {
        print(new Animal("fish", false, true), a -> a.canHop());
        print(new Animal("kangaroo", true, false), a -> a.canHop());
        print(new Animal("rabbit", true, false), a -> a.canHop());
    }
}
