public class day1{
    public static void main(String[] args){
        List<String> datas = new ArrayList<>();
        for (String ligne : Files.readAllLines(Paths.get(info))) {
            for (String chaine : ligne.split(\\s+)){
                String entier = Integer.valueOf(chaine);
                datas.add(entier);
            }
        }
        int res = 50;
        for (String i:datas){
            int nb = parInt(i.substring(1));
            int temp = res;
            nb=nb-(nb%100)*100
            if (i.charat(0)=="L"){
                res-=nb;
            }
            else res+=nb;
            if (nb<0){
                
            }
        }
    }
}