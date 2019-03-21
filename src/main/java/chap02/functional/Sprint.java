package chap02.functional;

import java.util.Collections;

import org.apache.commons.lang3.builder.ToStringBuilder;

import chap02.design.immutable.Animal;

@FunctionalInterface
public interface Sprint {
    public void sprint(Animal animal);
}

class Tiger implements Sprint {

    @Override
    public void sprint(Animal animal) {
        System.out.println("Animal is sprinting fast! -> " + ToStringBuilder.reflectionToString(animal));
    }

    public static void main(String[] args) {
        new Tiger().sprint(new Animal(Collections.emptyList()));
    }

}
