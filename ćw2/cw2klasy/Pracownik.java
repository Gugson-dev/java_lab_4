package cw2klasy;

import java.util.Map;
import cw2interfejsy.PracownikI;

public class Pracownik implements PracownikI
{
    // POLA

    private Map<String, Integer> oceny;
    private Map<String, String> grupy, terminy;
    private int wiekP, licz = 1;
    private String imieP;

    // KONSTRUKTOR

    public Pracownik(String imieP, int wiekP, Map<String, String> grupy, Map<String, Integer> oceny, Map<String, String>terminy)
    {
        this.imieP = imieP;
        this.wiekP = wiekP;
        this.grupy = grupy;
        this.oceny = oceny;
        this.terminy = terminy;
    }

    // METODY

    private String genImie()
    {
        String imie = (imieP == null) ? imie() : imieP;
        return imie;
    }

    private int genWiek()
    {
        int wiek = (wiekP == 0) ? wiek() : wiekP;
        return wiek;
    }

    public void oceny() 
    {
        String imie = genImie();
        System.out.printf("Uczniowie pod opieką - %s:\n", imie);
        for (Map.Entry<String, Integer> s : oceny.entrySet()) 
        {
            String uczen = s.getKey();
            int ocena = s.getValue();

            System.out.println(licz + ".\n\tUczeń: " + uczen + "\n\tOcena: " + ocena);
            licz++;
        }
        licz = 1;
    }

    public void grupy() 
    {
        String imie = genImie();
        System.out.printf("Grupy nauczyciela - %s:\n", imie);
        for (Map.Entry<String, String> s : grupy.entrySet()) 
        {
            String grupa = s.getKey();
            String spec = s.getValue();

            System.out.println(licz + ".\n\tGrupa: " + grupa + "\n\tSpecjalizacja: " + spec);
            licz++;
        }
        licz = 1;
    }

    public void terminy() 
    { 
        String imie = genImie();
        System.out.printf("Terminy zaliczeń - %s:\n", imie);
        for (Map.Entry<String, String> s : grupy.entrySet()) 
        {
            String przedmiot = s.getKey();
            String termin = s.getValue();

            System.out.println(licz + ".\n\tPrzedmiot: " + przedmiot + "\n\tTermin: " + termin);
            licz++;
        }
        licz = 1;
    }

    // toString()

    public String toString()
    {
        String imie = genImie();
        int wiek = genWiek();
        
        return 
            "Imie: " + imie + 
            "\nWiek: " + wiek + 
            "\nOceny: " + oceny + 
            "\nGrupy: " + grupy + 
            "\nTerminy: " + terminy;
    }

    // SETTERY I GETTERY...

    public Map<String, Integer> getOceny() 
    {
        return oceny;
    }

    public void setOceny(Map<String, Integer> oceny) 
    {
        this.oceny = oceny;
    }

    public Map<String, String> getTerminy() 
    {
        return terminy;
    }

    public void setTerminy(Map<String, String> terminy) 
    {
        this.terminy = terminy;
    }

    public Map<String, String> getGrupy() 
    {
        return grupy;
    }

    public void setGrupy(Map<String, String> grupy) 
    {
        this.grupy = grupy;
    }

    public int getWiekP() 
    {
        return wiekP;
    }

    public void setWiekP(int wiekP) 
    {
        this.wiekP = wiekP;
    }

    public String getImieP() 
    {
        return imieP;
    }

    public void setImieP(String imieP) 
    {
        this.imieP = imieP;
    }
}
