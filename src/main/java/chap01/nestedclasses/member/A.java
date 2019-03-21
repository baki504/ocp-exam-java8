package chap01.nestedclasses.member;

public class A {
    private int x = 10;

    class B {
        private int x = 20;

        public void displayX() {
            System.out.println(this.x); // 20
            System.out.println(A.this.x); // 10
            // System.out.println(C.this.x); // compile error.
        }

        class C {
            private int x = 30;

            public void allTheX() {
                System.out.println(x); // 30
                System.out.println(this.x); // 30
                System.out.println(B.this.x); // 20
                System.out.println(A.this.x); // 10
            }

        }
    }

    public static void main(String[] args) {
        new A().new B().new C().allTheX();
        System.out.println("---");
        new A().new B().displayX();
    }
}
