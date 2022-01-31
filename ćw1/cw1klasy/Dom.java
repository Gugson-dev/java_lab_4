package cw1klasy;

import cw1enumy.KolorEnum;
import cw1interfejsy.Budynek;

public class Dom implements Budynek
{         
    /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie (nie deklarujemy tej metody w interfejsie),
    */

    // POLA(PRYWATNE)
    private double powBudynku;
    private double powPodworka;
    private double powParkingu;
    private String miejscowosc;
    private String ulica;
    private int nrDomu;
    private String nrLokalu;
    private String kodPocztowy;
    private int value;
    private KolorEnum kolor;
    private double powierzchnia;
    private String adres;
    private double cena;
    private double fundusz;
    private int mieszkancy, okna;
    private String kup;


    // METODY
    @Override
    public double powierzchnia(double powBudynku, double powPodworka, double powParkingu) {
        return powBudynku + powPodworka + powParkingu;
    }

    @Override
    public String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy) 
    {
        return 
            "Adres = " + 
            ulica + " " + nrLokalu + "/" + nrDomu + ", " + 
            kodPocztowy + " " + miejscowosc;
    }

    @Override
    public void liczbaOkien(int value) 
    {
        this.okna = value;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        this.mieszkancy = value;
        
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        this.kolor = kolor;
        
    }

    @Override
    public double wyliczCene(double powierzchnia, double cena) {
        return powierzchnia * cena;
    }

    @Override
    public boolean kupMieszkanie(double fundusz, double cena) {
        if (fundusz >= cena && mieszkancy == 0) return true;
        else return false;
    }

    // DODATKOWA METODA
    public void dziala()
    {
        System.out.println("Działa\n");
    }
    
    // NADPISANY toString()
    @Override
    public String toString()
    {
        powierzchnia = powierzchnia(powBudynku, powPodworka, powParkingu);
        adres = adresBudynku(miejscowosc, ulica, nrDomu, nrLokalu, kodPocztowy);
        cena = wyliczCene(powierzchnia, cena);
        kup = (kupMieszkanie(fundusz, cena)) ? "tak" : "nie";

        return 
            "Dom:" + 
            "\n" + adres + 
            "\nPowierzchnia = " + powierzchnia + "m^2" + 
            "\nLiczba okien = " + okna + 
            "\nLiczba mieszkancow = " + mieszkancy + 
            "\nCena = " + cena + 
            "\nCzy można kupić?: " + kup;
    }



    // GETTERY I SETTERY..
    public double getPowBudynku() 
    {
        return powBudynku;
    }

    public void setPowBudynku(double powBudynku) 
    {
        this.powBudynku = powBudynku;
    }

    public double getPowPodworka() 
    {
        return powPodworka;
    }

    public void setPowPodworka(double powPodworka) 
    {
        this.powPodworka = powPodworka;
    }

    public double getPowParkingu() 
    {
        return powParkingu;
    }

    public void setPowParkingu(double powParkingu) 
    {
        this.powParkingu = powParkingu;
    }

    public String getMiejscowosc() 
    {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) 
    {
        this.miejscowosc = miejscowosc;
    }

    public String getUlica() 
    {
        return ulica;
    }

    public void setUlica(String ulica) 
    {
        this.ulica = ulica;
    }

    public int getNrDomu() 
    {
        return nrDomu;
    }

    public void setNrDomu(int nrDomu) 
    {
        this.nrDomu = nrDomu;
    }

    public String getNrLokalu() 
    {
        return nrLokalu;
    }

    public void setNrLokalu(String nrLokalu) 
    {
        this.nrLokalu = nrLokalu;
    }

    public String getKodPocztowy() 
    {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) 
    {
        this.kodPocztowy = kodPocztowy;
    }

    public int getValue() 
    {
        return value;
    }

    public void setValue(int value) 
    {
        this.value = value;
    }

    public KolorEnum getKolor() 
    {
        return kolor;
    }

    public void setKolor(KolorEnum kolor) 
    {
        this.kolor = kolor;
    }

    public double getPowierzchnia() 
    {
        return powierzchnia;
    }

    public void setPowierzchnia(double powierzchnia) 
    {
        this.powierzchnia = powierzchnia;
    }

    public double getCena() 
    {
        return cena;
    }

    public void setCena(double cena) 
    {
        this.cena = cena;
    }

    public double getFundusz() 
    {
        return fundusz;
    }

    public void setFundusz(double fundusz) 
    {
        this.fundusz = fundusz;
    }
}
