package chap01.nestedclasses.member;

import java.util.stream.IntStream;

public class Outer {

    private String greeting = "Hi";

    protected class Inner{
        public int repeat = 3;
        public void go() {
            IntStream.range(0, repeat).forEach(i -> System.out.println(i + ":" + greeting));
        }
    }

    public void callInner() {
        new Inner().go();
    }

    public static void main(String[] args) {
        new Outer().callInner();
        System.out.println("---");
        Inner inner = new Outer().new Inner(); // create the inner class, and create class file [Outer$Inner.class].
        inner.go();
    }
}
