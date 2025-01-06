
import java.io.*;
public class APP6 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("products.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Product p1 = new Product("DELL", 1900, 2);
            Product p2 = new Product("HP", 2000, 3);
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.close(); // Correction ici

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
