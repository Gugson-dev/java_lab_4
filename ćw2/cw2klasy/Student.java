package cw2klasy;
import java.util.Map;

public class Student implements StudentI
{

   private int[] oceny;
   private String[] przedmioty;
   private Map<String, Integer> zaliczenia;


   public int[] oceny() 
   {
      return oceny;
   }

   public void przedmioty() 
   {
       System.out.printf("Przedmioty ucznia - %s:\n", imie());
      for (String s : przedmioty) {
          System.out.println("1. " + s);
      }
   }

   public Map<String, Integer> zaliczenia() 
   {
      return zaliczenia;
   }

   public String toString(int[] s)
   {

      return "Imie: " + imie() + "\nWaga: " + waga() + "\nOceny: " + oceny() + "\nPrzedmioty: " + getPrzedmioty() + "\nZaliczenia: " + zaliczenia();
   }

    public int[] getOceny() {
        return oceny;
    }

    public void setOceny(int[] oceny) {
        this.oceny = oceny;
    }

    public String[] getPrzedmioty() {
        return przedmioty;
    }

    public void setPrzedmioty(String[] przedmioty) {
        this.przedmioty = przedmioty;
    }

    public Map<String, Integer> getZaliczenia() {
        return zaliczenia;
    }

    public void setZaliczenia(Map<String, Integer> zaliczenia) {
        this.zaliczenia = zaliczenia;
    }

}