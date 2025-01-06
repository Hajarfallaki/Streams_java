import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class APP5 {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"))) {
            bw.write("Bonjour tout le monde\n"); // Ajout d'une nouvelle ligne
            bw.write("Fin");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}