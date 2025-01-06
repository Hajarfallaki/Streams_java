import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class APP4 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("words.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) { // Correction ici
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}