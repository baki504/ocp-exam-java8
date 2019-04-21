package chap09.searching;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class PrintingFileContents {

    public static void main(String[] args) {
        Path path = Paths.get("fish/sharks.log");

        try {
            Files.lines(path).forEach(System.out::println);
        } catch (IOException e) {
            // Handle file I/O exception...
        }

        System.out.println("--------------");

        try {
            System.out.println(
                    Files.lines(path)
                            .filter(s -> s.startsWith("WARN "))
                            .map(s -> s.substring(5))
                            .collect(Collectors.toList()));
        } catch (IOException e) {
            // Handle file I/ O exception...
        }
    }

}
