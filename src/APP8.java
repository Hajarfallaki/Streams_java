import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class APP8 {
    public static void main(String[] args) {
        FileInputStream fis1 = null;
        FileInputStream fis2 = null;
        FileOutputStream fos = null;
        SequenceInputStream sis = null;

        try {
            fis1 = new FileInputStream("file.txt");
            fis2 = new FileInputStream("words.txt");
            sis = new SequenceInputStream(fis1, fis2);
            fos = new FileOutputStream("result.txt");

            int data;
            while ((data = sis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sis != null) sis.close();
                if (fos != null) fos.close();
                if (fis1 != null) fis1.close();
                if (fis2 != null) fis2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}