import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class APP3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C://Users//hajar//IdeaProjects//TPES_SDIA//src//img.jpeg");
            FileOutputStream fos = new FileOutputStream("imgCopie.jpeg");
            byte[] buffer = new byte[1024]; // Buffer de 1 Ko
            int bytesRead;

            // Lire et écrire par blocs de 1024 bytes
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
