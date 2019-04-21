package chap09.searching;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.stream.Stream;

public class DirectorySearch {

    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/chap01");
        System.out.println(path.toUri());

        long dateFilter = 1420070400000l;
        System.out.println(new Date(1420070400000l));

        try {
            Stream<Path> stream = Files.find(
                    path, 10, (p, a) -> p.toString().endsWith(".java") && a.lastModifiedTime().toMillis() > dateFilter);
            stream.forEach(p -> {
                System.out.println(p.toAbsolutePath());
            });
        } catch (Exception e) {
            // Handle file I/O exception...
        }
    }
}
