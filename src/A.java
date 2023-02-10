import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class A {
    public static void main(String[] args) {
        try {
            URL documentHTML = new URL(args[0]);
            String tag = args[1];
            try {
                URLConnection connectDocument = documentHTML.openConnection();
                BufferedReader reader = new BufferedReader(new InputStreamReader(connectDocument.getInputStream()));
                String line;

                while ((line = reader.readLine()) != null){
                    if(line.contains("<" + tag)){
                        System.out.println(line);
                    }
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("No es pot llegir el arxiu URL amb el BufferedReader, hi ha un error.");
            }
        } catch (MalformedURLException e) {
            System.out.println("La URL no es vàlida o esta malament.");
        }
    }
}