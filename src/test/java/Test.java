import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        System.out.println("%" + "AA" + "%");
    }

    public static void fileSearch(File file, List<File> result) {
        if (file.isFile()) {
            if (file.getName().endsWith(".xhtml")) {
                result.add(file);
            }
        } else if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                fileSearch(f, result);
            }
        }
    }

    public void test() {
        List<File> results = new ArrayList<>();
        System.out.println("File under: " + new File("./src/main/resources/META-INF/resources/").getAbsolutePath());
        for (File file : new File("./src/main/resources/META-INF/resources/").listFiles()) {
            fileSearch(file, results);
        }

        results.forEach(file -> System.out.println(file.getAbsolutePath().substring(file.getAbsolutePath().lastIndexOf("resources")).replace("resources\\", "")));

    }
}
