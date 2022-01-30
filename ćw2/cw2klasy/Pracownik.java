package cw2klasy;

import java.util.Map;

public class Pracownik implements PracownikI
{
    private Map<String, Integer> oceny;
    private Map<String, String> grupy, terminy;

    public Map<String, Integer> oceny() 
    {
        return oceny;
    }

    public Map<String,String> grupy() 
    {
        return grupy;
    }

    public Map<String, String> terminy() 
    {
        return terminy;
    }

    public String toString()
    {
       return "Imie: " + imie() + "\nWaga: " + waga() + "\nOceny: " + oceny() + "\nGrupy: " + grupy() + "\nTerminy: " + terminy();
    }

    public Map<String, Integer> getOceny() {
        return oceny;
    }

    public void setOceny(Map<String, Integer> oceny) {
        this.oceny = oceny;
    }

    public Map<String, String> getTerminy() {
        return terminy;
    }

    public void setTerminy(Map<String, String> terminy) {
        this.terminy = terminy;
    }

    public Map<String, String> getGrupy() {
        return grupy;
    }

    public void setGrupy(Map<String, String> grupy) {
        this.grupy = grupy;
    }
}
