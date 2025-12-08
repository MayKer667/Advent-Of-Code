import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class day1{
    public static void main(String[] args) throws IOException{
        BufferedReader read = new BufferedReader(new FileReader("../Day1/info.txt"));
        int compteur = 0;
        String ligne = read.readLine();

        int res = 50;
        int nb = Integer.parseInt(ligne.substring(1));
        int nbZero = 0;
        while (ligne != null){
            nb = Integer.parseInt(ligne.substring(1));
            //System.out.print("nb "+nb);
            //nb = nb%100;
            compteur++;
            if (ligne.charAt(0)=='L'){
                res-=nb;
            }
            else res+=nb;
            res%=100;
            if (compteur<40 || compteur%100==10) {
                System.out.println("res1 "+res);    
            }
            if (res<0){
                res+=100;
            }
            if (res==0) nbZero+=1;
            if ((res>nb%100) && (ligne.charAt(0)=='L')){
                nbZero+=1;
            }
            else if (res<nb%100 && (ligne.charAt(0)=='R')) nbZero+=1;
            if (compteur<40 || compteur%100==10) {
                System.out.println("res2 "+res);    
            }//System.out.println("nb "+nb+" res "+res+" ligne "+ligne.charAt(0)+" "+(ligne.charAt(0)=='L')+" compteur "+compteur+" nbZero "+nbZero);
            nbZero += (nb-nb%100)/100;
            ligne = read.readLine();
        }
        System.out.println((50-68)%100+" modulo 100 "+12%100*100);
        read.close();
        System.out.println(compteur);
        System.out.println(nbZero);

    }
}