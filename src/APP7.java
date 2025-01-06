import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class APP7 {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("products.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Product p1=(Product)ois.readObject();
            System.out.println(p1.getName()+" "+p1.getPrice()+" "+p1.getQuantity());
            Product p2=(Product)ois.readObject();
            System.out.println(p2.getName()+" "+p2.getPrice()+" "+p2.getQuantity());
        }catch(IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
    }
}
