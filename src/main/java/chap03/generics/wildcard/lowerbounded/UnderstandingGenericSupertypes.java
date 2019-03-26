package chap03.generics.wildcard.lowerbounded;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UnderstandingGenericSupertypes {

    public static void main(String[] args) {
        List<? super IOException> exceptions = new ArrayList<>();
        // exceptions.add(new Exception()); // does not compile
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());

    }

}