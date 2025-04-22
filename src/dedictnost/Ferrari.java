package dedictnost;

public class Ferrari extends Auto{

    public Ferrari(int pocetKoni,int cena,String barva) {
        super(pocetKoni,cena,barva);
    }

    @Override
    public void jizdaStart() {
        System.out.println("Ferrari začalo svou jízdu. Počet osob: "+super.getPocetSedadel());
    }
}
