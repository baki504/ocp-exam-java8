package chap04.stream.advanced;

import java.io.IOException;
import java.util.List;

public class ExceptionCaseStudyHelper {

    public static List<String> createSafe() {

        try {
            return ExceptionCaseStudy.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
