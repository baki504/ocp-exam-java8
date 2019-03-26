package chap03.generics;

import java.util.ArrayList;
import java.util.List;

class A {
}

class B extends A {
}

class C extends B {
}

public class PuttingItAllTogegher {

    public static void main(String[] args) {
        // Unbounded wildcard
        List<?> list1 = new ArrayList<A>();

        // Upper-bounded wildcard
        List<? extends A> list2 = new ArrayList<A>();
        List<? extends A> list2_2 = new ArrayList<B>();
        List<? extends A> list2_3 = new ArrayList<C>();

        // Lower-bounded wildcard
        List<? super A> list3 = new ArrayList<A>();
        // List<? super A> list3_1 = new ArrayList<B>(); // does not compile
        // List<? super A> list3_2 = new ArrayList<C>(); // does not compile
        List<? super A> list3_3 = new ArrayList<Object>(); // does not compile

        // Upper-bounded wildcard
        // List<? extends B> list4 = new ArrayList<A>(); // does not compile
        List<? extends B> list4_1 = new ArrayList<B>();
        List<? extends B> list4_2 = new ArrayList<C>();

        // Lower-bounded wildcard
        List<? super B> list5 = new ArrayList<A>();
        List<? super B> list5_1 = new ArrayList<B>();
        // List<? super B> list5_2 = new ArrayList<C>(); // does not compile
        List<? super B> list5_3 = new ArrayList<Object>(); // does not compile

        // Unbounded wildcard
        // List<?> list6 = new ArrayList<? extends A>(); // does not compile
    }

    <T> T method1(List<? extends T> list) {
        return list.get(0);
    }

    // DOES NOT COMPILE
    // <T> <? extends T > method2( List <? extends T > list) {
    //     return list.get( 0);
    // }

    // DOES NOT COMPILE
    // <B extends A> B method3(List<B> list) {
    //     return new B();
    // }

    void method4(List<? super B> list) {
    }

    // DOES NOT COMPILE
    // because it tries to mix a method-specific type parameter with a wildcard. A wildcard must have a ? in it.
    // <X> void method5(List<X super B> list) {
    // }

}
