package chap09.paths;

import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class AccessingTheUnderlyingFileSystemObject {

    public static void main(String[] args) throws URISyntaxException {
        Path path1 = FileSystems.getDefault().getPath("pandas/cuddly.png");
        Path path2 = FileSystems.getDefault().getPath("c:", "zooinfo", "November", "employees.txt");
        Path path3 = FileSystems.getDefault().getPath("/home/zoodirector");

        // FileSystem fileSystem = FileSystems.getFileSystem(new URI("http://www.selikoff.net")); // Provider http not found
        // Path path = fileSystem.getPath("duck.txt");
    }

}
