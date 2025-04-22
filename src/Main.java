import dedictnost.Audi;
import dedictnost.Fabia;
import dedictnost.Ferrari;

public class Main {
    public static void main(String[] args) {
        System.out.println("AutoSalonApp");
        System.out.println("");

        Ferrari ferrari = new Ferrari(500,1500000,"Červená");
        Audi audi = new Audi(300,271000,"Šedá");
        Fabia fabia = new Fabia(10,50000,"Modrá");

        ferrari.jizdaStart();
        ferrari.vypisInfo();

        audi.jizdaStart();
        audi.vypisInfo();

        fabia.jizdaStart();
        fabia.vypisInfo();

        System.out.println("Farrari cena: "+ferrari.getCena());
        System.out.println("Ashwits cena: "+audi.getCena());
        System.out.println("Flabia cena: "+fabia.getCena());

    }
}