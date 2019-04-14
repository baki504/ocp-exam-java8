package chap04.stream.advanced;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class ExceptionCaseStudy {

    public static List<String> create() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {

        // Supplier<List<String>> s = ExceptionCaseStudy::create; // DOES NOT COMPILE

        Supplier<List<String>> s = () -> {
            try {
                return ExceptionCaseStudy.create();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };

        Supplier<List<String>> s2 = ExceptionCaseStudyHelper::createSafe;

    }

}
