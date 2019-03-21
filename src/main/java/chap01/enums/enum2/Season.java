package chap01.enums.enum2;

public enum Season {

    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

    private String expectedVisitors;

    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }

}

class SeasonSample {
    public static void main(String[] args) {
        Season.SPRING.printExpectedVisitors(); // Medium
    }
}
