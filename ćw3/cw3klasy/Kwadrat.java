package cw3klasy;

public class Kwadrat extends Figury 
{
    double bokA;
    String nazwa;


    public Kwadrat (String nazwa, double bokA)
    {
        this.bokA = bokA;
        this.nazwa = nazwa;
    }

    public double pole()
    {
        nazwaFigury(nazwa);
        return bokA*bokA;
    }

    public double obwod()
    {
        return 4 * bokA;
    }
}
