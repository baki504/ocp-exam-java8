package chap01.nestedclasses.local;

public class Outer {

    private int length = 5;

    public void calculate() {
        final int width = 20;

        // A local inner class is a nested class defined within a method.
        // They do not have an access specifier.
        // They cannot be declared static and cannot declare static fields or methods.
        // They have access to all fields and methods of the enclosing class.
        // They do not have access to local variables of a method unless those variables are final or effectively final. More on this shortly.
        class Inner {
            public void multiply() {
                System.out.println(length * width);
            }
        }

        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        new Outer().calculate();
    }

    public void isItFinal() {
        int one = 20; // effectively final
        int two = one; // not effectively final
        two++;
        int three; // effectively final
        if (one == 4)
            three = 3;
        else
            three = 4;
        int four = 4; // not effectively final
        class Inner {
            public void dispOuterNum() {
                System.out.println(one);
                // System.out.println(two); // cannot compile because it's not final
                System.out.println(three);
                // System.out.println(four); // cannot compile because it's not final
            }
        }
        four = 5;
    }
}
