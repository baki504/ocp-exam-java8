package chap03.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

class X {
    public String toString() {
        return "X";
    }
}

class Y extends X {
    public String toString() {
        return "Y";
    }
}

public class Sample3_17 {
    public static void method1(List<? extends X> list) {
        //list.add(new X());
        //list.add(new Y());
        System.out.println(list.get(0) + " ");
    }

    public static void method2(List<? super Y> list) {
        //list.add(new X());
        list.add(new Y());
        System.out.println(list.get(0) + " ");
    }

    public static void main(String[] args) {
        List<X> l1 = new ArrayList<>();
        List<Y> l2 = new ArrayList<>();
        l1.add(new X());
        l2.add(new Y());

        method1(l1);
        method1(l2);

        method2(l1);
        method2(l2);
    }

}
