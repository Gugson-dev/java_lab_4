import cw1interfejsy.*;
import cw1klasy.*;
import cw1enumy.*;

public class zad1 
{
  public static void main(String[] args) 
  {
    /* zad.3
      a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
      drugi objekt typem Budynek,
      b) wykorzystać wszystkie metody do implementacji pól,
      c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom,
      d) sprawdzić czy idzie wywołać z obu instancji objektu (deklaracja z interfejsu i z klasy)
      metodę której nie ma zadeklarowane w interfejsie Budynek, ale jest dopisana w klassie Dom,
    */

    //OBJEKTY
    Dom dom = new Dom();
    Budynek budynek = new Dom();

    // IMPLEMENTACJA W DOM
    dom.setCena(3000);
    dom.setKodPocztowy("80-463");
    dom.setKolor(KolorEnum.BIALY);
    dom.setMiejscowosc("Gdańsk");
    dom.setNrDomu(13);
    dom.setNrLokalu("19 F");
    dom.setPowBudynku(35.5);
    dom.setPowParkingu(0.0);
    dom.setPowPodworka(0.0);
    dom.setUlica("Startowa");
    dom.setFundusz(150000);
    dom.liczbaMieszkancow(4);
    dom.liczbaOkien(8);
    
    // IMPLEMENTACJA W BUDYNEK
    budynek.adresBudynku("Gdańsk", "Pilotów", 4, "20 G", "80-460");
    budynek.powierzchnia(35.5, 0.0, 0.0);
    budynek.liczbaOkien(8);
    budynek.liczbaMieszkancow(4);
    budynek.kolorDomu(KolorEnum.BIALY);
    budynek.wyliczCene(35.5, 1250);
    budynek.kupMieszkanie(150000, 3000);

    // WYPISANIE OBU OBJEKTÓW POPRZEZ toString() I DODATKOWEJ METODY (AKURAT PASUJE)
    System.out.println(dom.toString());
    dom.dziala(); 
    System.out.println(budynek.toString());
    // budynek.dziala();  <-- nie działa :)


  }
}
