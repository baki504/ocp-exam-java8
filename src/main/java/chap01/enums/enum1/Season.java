package chap01.enums.enum1;

public enum Season {
    WINTER, SPRING, SUMMER, FALL
}

class SeasonSample {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER);// SUMMER
        System.out.println(s == Season.SUMMER); // true

        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        Season s1 = Season.valueOf("SUMMER");// SUMMER
        //Season s2 = Season.valueOf("summer");// exception

        Season summer = Season.SUMMER;
        switch (summer) {
        case WINTER:
            System.out.println(" Get out the sled!");
            break;
        case SUMMER:
            System.out.println(" Time for the pool!");
            break;
        default:
            System.out.println(" Is it summer yet?");
        }

        switch (summer) {
        // case 0: // DOES NOT COMPILE
        //     System.out.println(" Get out the sled!"); break; }
        }

    }
}