package cw1interfejsy;

import cw1enumy.*;

public interface Budynek 
{
    /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
            - String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
            - void liczbaOkien(int value); // użycie jak setter
            - void liczbaMieszkancow(int value); // użycie jak setter
            - void kolorDomu(KolorEnum kolor); // użycie jak setter
            - double wyliczCene(double powierzchnia, double cena);
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
    */
    
    double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
    String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
    void liczbaOkien(int value);
    void liczbaMieszkancow(int value);
    void kolorDomu(KolorEnum kolor);
    double wyliczCene(double powierzchnia, double cena);
    boolean kupMieszkanie(double fundusz, double cena);
}
