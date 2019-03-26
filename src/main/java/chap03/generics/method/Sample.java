package chap03.generics.method;

public interface Sample {

    public static <T> void sink(T t) {
    }

    public static <T> T identity(T t) {
        return t;
    }

    // does not compile
    // public static T noGood(T t) {
    //     return t;
    // }
}
