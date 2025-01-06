import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class APP2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("./words.txt");
            FileWriter fw = new FileWriter("./wordsCopies.txt");

            int c;
            while ((c = fr.read()) != -1) {
                fw.write((char) c); // Cast to char before writing
            }
            fr.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}