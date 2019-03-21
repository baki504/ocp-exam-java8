package chap01.nestedclasses.staticnested;

public class Enclosing {

    static class Nested {
        private int price = 6;
    }

    public static void main(String[] args) {
        System.out.println(new Nested().price);
    }
}
