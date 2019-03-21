package chap01.enums.enum2;

public enum OnlyOne {

    ONCE(true);

    private OnlyOne(boolean b) {
        System.out.println("constructing");
    }

    public static void main(String[] args) {
        OnlyOne firstCall = OnlyOne.ONCE;// prints constructing
        OnlyOne secondCall = OnlyOne.ONCE; // doesn't print anything
    }

}
