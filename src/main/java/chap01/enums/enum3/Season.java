package chap01.enums.enum3;

public enum Season {

    WINTER {
        public void printHours() {
            System.out.println("9am-3pm");
        }
    },
    SPRING {
        public void printHours() {
            System.out.println("9am-5pm");
        }
    },
    SUMMER {
        public void printHours() {
            System.out.println("9am-7pm");
        }
    },
    FALL {
        public void printHours() {
            System.out.println("9am-5pm");
        }
    };
    // DUMMYSEASON; // cannot compile because it's doesn't implement printHours().

    public abstract void printHours();

}

class SeasonSample {
    public static void main(String[] args) {
        Season.WINTER.printHours();
        Season.WINTER.printHours();
    }
}