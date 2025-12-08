import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class day1{
    public static void main(String[] args){
        //File nameFile = new File("info");
        BufferedReader read = new BufferedReader(new FileReader("../Day1/info.txt"));
        int compteur = 0;
        String ligne = read.readLine();

        int res = 50;
        int nb = Integer.parseInt(ligne.substring(1));
        while (ligne != null){
            compteur++;
            if (ligne.charAt(0)=='L'){
                res-=nb;
            }
            else res+=nb;
            if (nb<0){
                res+=100;
            }
            ligne = read.readLine();
        }
        read.close();
        System.out.println(compteur);

    }
}