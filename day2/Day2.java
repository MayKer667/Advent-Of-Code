import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Day2{


    public static String[] decoupe(String listeChar, int nb){
        String[] res = new String[listeChar.length()/nb];
        for(int i = 0;i<listeChar.length();i++){
            //System.out.println(i+" "+nb+" "+listeChar.length());
            res[i/nb] += listeChar.charAt(i);
        }
        return res;
    }

    public static long problematique(long elemenLong){
        String elem = Long.toString(elemenLong);
        int taille = elem.length();
        boolean alreadyTest = false;
        for (int i = 1;i<taille/2;i++){
            boolean bon = true;
            int nbPar = i;
            if (taille%i==0){
                String[] liste = decoupe(elem,nbPar);
                if(i==3 && !alreadyTest){
                    for(String y:liste){
                        System.out.println(y);
                    }
                    alreadyTest=true;
                }
                for(int y = 1;y<liste.length;y++){
                    if (!liste[0].equals(liste[y])){
                        bon=false;
                    }
                }
                if(bon){
                    return elemenLong;
                }
            }
        }
        
        return 0;
    }
    
    public static void main(String[] args) throws IOException{

        System.out.println(5%3+" "+6%3+" "+6%4);
        BufferedReader read = new BufferedReader(new FileReader("info.txt"));
        String ligne = read.readLine();
        String[] elements = ligne.split(",");
        long res = 0;
        for(int i = 0; i<elements.length;i++){
            String[] listeElem = elements[i].split("-");
            long premElem = Long.parseLong(listeElem[0]);
            long deuxElem = Long.parseLong(listeElem[1]);
            for(long y = premElem;y<deuxElem;y++){
                String strElem = Long.toString(i);
                long pb = problematique(y);
                //if (pb!=0) System.out.println(pb + " "+y);
                res+=pb;
            }
        }
        System.out.println(res);
    }
}

//7830558185 too low
//37432260594 solution