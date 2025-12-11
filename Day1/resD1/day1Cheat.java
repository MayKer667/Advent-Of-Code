import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//import java.io.IOException;
import java.io.IOException;

public class day1Cheat{
    private int DIAL_SIZE = 99;
    public static void main(String[] args) throws IOException{
        BufferedReader read = new BufferedReader(new FileReader("../resD1/info.txt"));
        int compteur = 0;
        String ligne = read.readLine();
        
        int position = 50;
        int rotation = Integer.parseInt(ligne.substring(1));
        int zeroCount = 0;

        while (ligne != null){
            int sens = 1;
            if (ligne.charAt(0)=='R'){
                sens=1;
            }
            else sens = -1;
            rotation = Integer.parseInt(ligne.substring(1));
            position += rotation*sens;
            position = Math.floorMod(position + rotation, 99);
            if (position == 0) {
                zeroCount++;
            }

            ligne = read.readLine();
        }
        read.close();
        System.out.println(zeroCount);
    }
}