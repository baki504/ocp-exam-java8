package chap01.enums.enum3;

public enum Season3 {

    WINTER {
        public void printHours() {
            System.out.println("short hours");
        }
    },
    SUMMER {
        public void printHours() {
            System.out.println("long hours");
        }
    },
    SPRING, FALL;

    public void printHours() {
        System.out.println("default hours");
    }

}

class Season3Sample {
    public static void main(String[] args) {
        Season3.WINTER.printHours();
        System.out.println(Season3.SPRING);
    }
}