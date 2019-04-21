package chap09.searching;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadAllLinesVsLines {

    public static void main(String[] args) {
        try {
            String log = "fish/sharks.log";

            // Files.readAllLines returns List<String>
            System.out.println("--- Files.readAllLines ---");
            Files.readAllLines(Paths.get(log)).forEach(System.out::println);

            System.out.println("");

            // Files.lines returns stream
            System.out.println("--- Files.lines ---");
            Files.lines(Paths.get(log)).forEach(System.out::println);

            System.out.println();

            // OK
            Path path = Paths.get("fish", "sharks.log");
            System.out.println("< Files.lines >");
            Files.lines(path).filter(s -> s.length() > 2).forEach(System.out::println);

            // NG - Files.readAllLines does not compile
            // because the filter() operation cannot be applied to a Collection
            // without first converting it to a Stream using the stream() method.
            // Files.readAllLines(path).filter(s -> s.length() > 2).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
