import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Day2{

    public static int problematique(String elem){
        int millieu = elem.length/2;
        if (elem.length%2==1){
            return 0;
        }
        String res = "";
        for(int i = 0; i<(millieu);i++){
            if(elem[i]!=elem[i+millieu]){
                return 0;
            }
            res+=elem[i];
        }
        return Integer.parseInt(res);
    }
    
    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new FileReader("./info.txt"));
        String ligne = read.readLine();
        String[] elements = ligne.split(",");
        int res = 0;
        for(int i = 0; i<elements.length;i++){
            String[] listeElem = elements[i].split("-");
            int premElem = Integer.parseInt(listeElem[0]);
            int deuxElem = Integer.parseInt(listeElem[1]);
            for(int y = premElem;y<deuxElem;y++){
                String strElem = Integer.toString(i);
                int pb = problematique(strElem);
                res+=pb;
            }
        }
        System.out.println(res);
    }
}