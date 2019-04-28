package other.shoeisha;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// 5-10
public class FilesWithStream {

    public static void main(String[] args) {
        Stream<Path> p = Stream.of(
                Paths.get("sample.html"),
                Paths.get("sample.txt"));
        p.filter(s -> s.toString()
                .endsWith("txt"))
                .forEach(s -> {
                    try {
                        Files.readAllLines(s)
                                .stream()
                                .forEach(System.out::println);
                    } catch (IOException e) {
                        System.out.println("Exception");
                    }
                });
    }

}
