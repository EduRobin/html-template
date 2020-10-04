import java.util.*;

class Korona {
    public static void main(String args[]) {

       
        ArrayList<Stat> zeme = new ArrayList<Stat>();



        System.out.println("-----------------------------------------------");
        System.out.println("KORONA JE TADY ESKEREEEEEEEEEEEEEEEEEE");
        System.out.println("-----------------------------------------------");

        zeme.add(new Stat("Italie", 60000000, 9100, 463, 724));
        zeme.add(new Stat("Cesko", 10000000, 40, 0, 0));
        zeme.add(new Stat("Cina", 1000000000, 67000, 3000, 47000));
        zeme.add(new Stat("Rusko", 144000000, 20, 0, 3));
        zeme.add(new Stat("Spanelsko", 46000000, 1200, 30, 32));


        for(int i = 0; i < zeme.size(); i++) {
            System.out.println("Stat: " + zeme.get(i).nazevStatu() + ", Pocet obyvatel: " + zeme.get(i).pocetObyvatel() + ", Pocet nakazenych: " + zeme.get(i).pocetNakazenych() + ", Pocet umrti: " + zeme.get(i).pocetUmrti() + ", Pocet vylecenych: " + zeme.get(i).pocetVylecenych + ", Pocet nakazenych v %: " + zeme.get(i).vratProcentoNakazenychZPopulace() + "Pocet mrtvych v %:" + zeme.get(i).vratProcentoUmrtiZNakazenych());
        }

        



    }
}