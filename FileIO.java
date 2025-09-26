import java.io.*;
import java.nio.file.*;

public class FileIO {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write("hello, this is a sample text file!\n");
            writer.write("written using FileWriter.");
        } catch (IOException e) {
            System.out.println("error writing to file: " + e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("read: " + line);
            }
        } catch (IOException e) {
            System.out.println("error reading file: " + e.getMessage());
        }

        Path path = Paths.get("test2.txt");
        try {
            Files.writeString(path, "test2 content");

            String content = Files.readString(path);
            System.out.println("content: " + content);

            System.out.println("file exists: " + Files.exists(path));
            System.out.println("file size: " + Files.size(path));
        } catch (IOException e) {
            System.out.println("error with test2 I/O: " + e.getMessage());
        }

        try {
            Path dir = Paths.get("testDir");
            Files.createDirectory(dir);
            System.out.println("directory created");

            Files.list(dir).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("error with directory operations: " + e.getMessage());
        }
    }
}
