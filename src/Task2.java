import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class Task2 {
    public static void main(String[] args)throws IOException
        {
            File file = new File("java2.txt");
            file.createNewFile();

            FileOutputStream outputStream = new FileOutputStream(file);
            String s="Welcome to the Candy shop?";
            outputStream.write(s.getBytes());
            outputStream.close();

            TextFileReader textFileReader = new TextFileReader(file);
            textFileReader.getContentAsString();

        }
}

class TextFileReader {
    File f;
    TextFileReader(File o){
        f=o;
    }


    public void getContentAsString() throws IOException  {
        FileInputStream input=new FileInputStream(f);
        Scanner scn=new Scanner(input);
        System.out.println(scn.nextLine());

    }

}
