import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class Task2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/test-java.txt");
        file.createNewFile();

        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write("Hello, dear student!\nHow are you?".getBytes());
        outputStream.close();

        TextFileReader textFileReader = new TextFileReader(file);
        System.out.println(textFileReader.getContentAsString());

        file.delete();
    }
}

class TextFileReader {
    File file;

    public TextFileReader(File file){
        this.file = file;
    }

    public String getContentAsString() throws IOException{
        FileInputStream inputStream = new FileInputStream(file);
        Scanner scanner = new Scanner(inputStream);

        String s = "";
        while (scanner.hasNext()) {
            s += (scanner.nextLine() + "\n");
        }
        inputStream.close();

        return s;

    }
}