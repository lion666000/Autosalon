package dedictnost;

import java.util.Random;

public class Auto {
    private int pocetSedadel = 5;
    private int pocetDveri = 5;
    private int pocetNahradnihKol = 1;
    private int pocetKoni;
    private int cena;
    private String barva;



    public int getPocetSedadel() {
        return pocetSedadel;
    }

    public int getPocetDveri() {
        return pocetDveri;
    }

    public int getPocetNahradnihKol() {
        return pocetNahradnihKol;
    }

    public int getPocetKoni() {
        return pocetKoni;
    }

    public int getCena() {
        return cena;
    }

    public String getBarva() {
        return barva;
    }

    public Auto(int pocetKoni, int cena, String barva) {
        this.pocetKoni=pocetKoni;
        this.cena=cena;
        this.barva=barva;
    }



    public void vypisInfo(){
        System.out.println("Pocet Sedadel: "+pocetSedadel+" ,pocet dveri: "+pocetDveri+" ,pocet nahradnich kol: "+pocetNahradnihKol+" ,pocet koni: "+pocetKoni+",cena: "+cena+" ,barva: "+barva);
    }

    public void jizdaStart() {
        System.out.println("Auto začalo svou jízdu.");
    }
}
