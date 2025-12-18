import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class day1{
    public static int[] changeRes(int res,char premChar,int changeRes,int nbZero){
        int changeResult = changeRes%100;
        if (premChar=='L'){
            res -= changeResult;
            if (res<0){
                res+=100;
                nbZero+=1;
            } 
        }
        else{
            res += changeResult;
            if (res>99){
                res -= 100;
                nbZero+=1;
            }
        }
        int[] tab = {res,nbZero};
        return tab;
    }

    public static int nbTour(int nb){
        return (nb/100);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader read = new BufferedReader(new FileReader("./info.txt"));
        int compteur = 0;
        String ligne = read.readLine();

        int res = 50;
        int nb = Integer.parseInt(ligne.substring(1));
        int nbZero = 0;
        while (ligne != null){
            nb = Integer.parseInt(ligne.substring(1));
            compteur++;
            int[] tabRes = changeRes(res,ligne.charAt(0),nb,nbZero);
            res = tabRes[0];
            nbZero=tabRes[1];
            int nombreDeTour = nb/100;
            if (nombreDeTour>0) System.out.println("Nombre de tours "+nombreDeTour+" tour "+compteur+" nombre zero "+nbZero);
            nbZero+=nombreDeTour;
            ligne = read.readLine();
            if (res<0 || res>99){
                System.out.println("res "+res);
                break;
            }
        }
        System.out.println(312+" modulo 100 "+(312-(312%100))/100+" "+312%100);
        read.close();
        System.out.println(compteur);
        System.out.println(nbZero);

    }
}