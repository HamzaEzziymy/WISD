import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

class CreateFichierTexte {
    public static void main(String [] args) throws  IOException {
        PrintWriter ecrire;
        ecrire = new PrintWriter(new FileOutputStream("fichier1.txt"));
        ecrire.println("Bonjour");
        ecrire.println(100);
        ecrire.println(true);
        ecrire.println(3.141589);
        ecrire.close();
    }
}