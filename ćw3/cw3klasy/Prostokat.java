package cw3klasy;

public class Prostokat extends Figury
{
    double bokA, bokB;
    String nazwa;
    
    public Prostokat (String nazwa, double bokA, double bokB)
    {
        this.bokA = bokA;
        this.bokB = bokB;
        this.nazwa = nazwa;
    }
    
    public double pole ()
    {
        nazwaFigury(nazwa);
        return bokA * bokB;
    }

    public double obwod()
    {
        return 2*bokA + 2*bokB;
    }
}
