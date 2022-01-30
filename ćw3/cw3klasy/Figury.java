package cw3klasy;

public abstract class Figury
{
    public abstract double pole();
    public abstract double obwod(); 
    
    public void nazwaFigury(String figura)
    {
        System.out.println("\nTo jest figura: " + figura);
    }
}
