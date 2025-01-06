import java.io.File;

public class AP1 {
    public static void main(String[] args) {
        File file=new File("C://Users/hajar/OneDrive/Bureau/enspec_club");
        System.out.println(file.isDirectory()?"Dossier":"Fichier");
        System.out.print(file.getAbsolutePath());
        System.out.println();
        System.out.print(file.canRead()?"r":"-");
        System.out.print(file.canWrite()?"w":"-");
        System.out.print(file.canExecute()?"x":"-");
        for(File file1:file.listFiles()){
            System.out.print(file1.isDirectory()?"d":"-");
            System.out.print(" " +file1.getName());
            System.out.println(" "+file1.length());

        }
    }
}
