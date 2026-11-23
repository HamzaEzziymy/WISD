import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectureCaracteres {
    public static void main(String [] args) throws IOException{
        BufferedReader stream = null;
        String str;
        try {
            stream = new BufferedReader(new FileReader("fichier1.txt"));
            while ((str = stream.readLine()) != null){
                System.out.println(str);
            }
        }catch (FileNotFoundException exc){
            System.out.println("Erreur de lecture du fichier");
        }finally {
            if (stream != null) {
                stream.close();
            }
        }
    }
}
