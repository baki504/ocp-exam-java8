package chap09.paths;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatingPaths {

    public static void main(String[] args) throws URISyntaxException {
        Path path1 = Paths.get("pandas/cuddly.png");
        Path path2 = Paths.get("c:\\zooinfo\\November\\employees.txt");
        Path path3 = Paths.get("/home/zoodirector");

        Path path4 = Paths.get("pandas", "cuddly.png");
        Path path5 = Paths.get("c:", "zooinfo", "November", "employees.txt");
        Path path6 = Paths.get("/", "home", "zoodirector");

        //Paths path_ng1 = Paths.get("/alligator/swim.txt");// DOES NOT COMPILE
        //Path path_ng2 = Path.get("/crocodile/food.csv");// DOES NOT COMPILE

        Path path7 = Paths.get(new URI("file://pandas/cuddly.png")); // THROWS EXCEPTION // AT RUNTIME...?
        Path path8 = Paths.get(new URI("file:///c:/zoo-info/November/employees.txt"));
        Path path9 = Paths.get(new URI("file:///home/zoodirectory"));

        //Path path10 = Paths.get(new URI("http://www.wiley.com")); // Exception in thread "main" java.nio.file.FileSystemNotFoundException: Provider "http" not installed
        //Path path11 = Paths.get(new URI("ftp://username:password@ftp.the-ftp-server.com")); // Exception in thread "main" java.nio.file.FileSystemNotFoundException: Provider "ftp" not installed

        //Path path12 = Paths.get(new URI("http://www.wiley.com")); // Exception in thread "main" java.nio.file.FileSystemNotFoundException: Provider "http" not installed
        //URI uri12 = path12.toUri();

    }

}
