package other.shoeisha.files;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class FilesSamples {

    public static void main(String[] args) {

        // 61
        System.out.println(61);
        Path path = Paths.get("test");
        try {
            Files.find(path, 1, (pt, attr) -> !attr.isSymbolicLink())
                    .map(p -> p.toString())
                    .collect(Collectors.toList())
                    .stream()
                    .filter(x -> x.toString().endsWith(".txt"))
                    .forEach(System.out::print);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        // 63
        System.out.println(63);
        try {
            Files.walk(Paths.get("src/main/java/chap03/comparable").toRealPath().getParent(),
                    FileVisitOption.FOLLOW_LINKS)
                    .map(p -> p.toAbsolutePath().toString())
                    .filter(x -> x.endsWith(".java"))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 65
        System.out.println(65);
        Path path2 = Paths.get("test/subdir");
        try {
            Files.find(path2.getParent(), 1,
                    (p, attr) -> p.toString().endsWith(".txt") || Files.isDirectory(p))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
