package cw2klasy;

import java.util.Map;
import cw2interfejsy.StudentI;

public class Student implements StudentI
{
    // POLA

    private int[] oceny;
    private String[] przedmioty;
    private Map<String, Integer> zaliczenia;
    private int wiekS, licz = 1;
    private String imieS;

    // KONSTRUKTOR
    
    public Student(String imieS, int wiekS, String[] przedmioty, int[] oceny, Map<String, Integer> zaliczenia)
    {
        this.imieS = imieS;
        this.wiekS = wiekS;
        this.przedmioty = przedmioty;
        this.oceny = oceny;
        this.zaliczenia = zaliczenia;
    }

    // METODY

    private String genImie()
    {
        String imie = (imieS == null) ? imie() : imieS;
        return imie;
    }

    private int genWiek()
    {
        int wiek = (wiekS == 0) ? wiek() : wiekS;
        return wiek;
    }

    public void oceny() 
    {
        String imie = genImie();
        System.out.printf("Oceny ucznia - %s:\n", imie);
        for (int i : oceny) 
        {
            System.out.println(licz + ". " + i);
            licz++;
        }
        licz = 1;
    }

    public void przedmioty() 
    {
        String imie = genImie();
        System.out.printf("Przedmioty ucznia - %s:\n", imie);
        for (String s : przedmioty) 
        {
            System.out.println(licz + ". " + s);
            licz++;
        }
        licz = 1;
    }

    public void zaliczenia() 
    {
        String imie = genImie();
        System.out.printf("Zaliczenia ucznia - %s:\n", imie);
        for (Map.Entry<String, Integer> s : zaliczenia.entrySet()) 
        {
            String przedmiot = s.getKey();
            int ocena = s.getValue();

            System.out.println(licz + ".\n\tPrzedmiot: " + przedmiot + "\n\tOcena: " + ocena);
            licz++;
        }
        licz = 1;
    }

    // toString()

    private String ArrToString(int[] oceny)
    {
        String ocenyS = "[";
        for (int i : oceny) 
        {
            ocenyS = ocenyS + " " + i;
        }
        ocenyS = ocenyS + " ]";
        return ocenyS;
    }

    private String ArrToString(String[] przedmioty)
    {
        String przedmiotyS = "[";
        for (String s : przedmioty) 
        {
            przedmiotyS = przedmiotyS + " " + s;
        }
        przedmiotyS = przedmiotyS + " ]";
        return przedmiotyS;
    }

    @Override
    public String toString()
    {
        String imie = genImie();
        int wiek = genWiek();
        String ocenyS = ArrToString(oceny);
        String przedmiotyS = ArrToString(przedmioty);

        return 
            "Imie: " + imie + 
            "\nWiek: " + wiek + 
            "\nPrzedmioty: " + przedmiotyS + 
            "\nOceny: " + ocenyS + 
            "\nZaliczenia: " + zaliczenia;
    }

    // SETTERY I GETTERY...

    public int[] getOceny() 
    {
        return oceny;
    }

    public void setOceny(int[] oceny) 
    {
        this.oceny = oceny;
    }

    public String[] getPrzedmioty() 
    {
        return przedmioty;
    }

    public void setPrzedmioty(String[] przedmioty) 
    {
        this.przedmioty = przedmioty;
    }

    public Map<String, Integer> getZaliczenia() 
    {
        return zaliczenia;
    }

    public void setZaliczenia(Map<String, Integer> zaliczenia) 
    {
        this.zaliczenia = zaliczenia;
    }

    public int getWiekS() 
    {
        return wiekS;
    }

    public void setWiekP(int wiekS) 
    {
        this.wiekS = wiekS;
    }


    public String getImieS() 
    {
        return imieS;
    }

    public void setImieP(String imieS) 
    {
        this.imieS = imieS;
    }
}