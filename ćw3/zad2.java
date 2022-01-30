import cw3klasy.*;

public class zad2 
{
    public static void main (String [] argv)
    {
        /* zad.2
            c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        Figury prostokat1 = new Prostokat("Prostokat 1 (2,4)", 2, 4);
        Figury kwadrat1 = new Kwadrat("Kwadrat 1 (4)", 4);
        Figury prostokat2 = new Prostokat("Prostokat 2 (5,3)", 5, 3);
        Figury kwadrat2 = new Kwadrat("Kwadrat 2 (6)", 6);

        System.out.println ("Pole = " + prostokat1.pole());
        System.out.println ("Obwód = " + prostokat1.obwod());
        System.out.println ("Pole = " + kwadrat1.pole());
        System.out.println ("Obwód = " + kwadrat1.obwod());
        System.out.println ("Pole = " + prostokat2.pole());
        System.out.println ("Obwód = " + prostokat2.obwod());
        System.out.println ("Pole = " + kwadrat2.pole());
        System.out.println ("Obwód = " + kwadrat2.obwod());
    } 
}
