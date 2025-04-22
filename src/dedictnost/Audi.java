package dedictnost;

public class Audi extends Auto{


    public Audi(int pocetKoni,int cena,String barva) {
        super(pocetKoni,cena,barva);
    }

    @Override
    public void jizdaStart() {
        System.out.println("Audi začalo svou jízdu. Počet osob: "+super.getPocetSedadel());
    }
}
