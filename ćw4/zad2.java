public class zad2 
{
    public static void main(String[] args) 
    {
        /* zad.2
            a) stworzyć dowolny przykład z NullPonterException,
            b) stworzyć dowolny przykład z ArithmeticException ,
            c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
        */

        String wyraz;
        
        try
        {    
            int liczby[] = new int[10];    
            liczby[13] = 30/0;
            wyraz = "Naprawione";    
        }    
        catch(ArithmeticException e)
        {  
            System.out.println("Nie można dzielić przez 0! Napraw to przed kolejnym uruchomieniem");
            wyraz = null;  
        }  
        catch(ArrayIndexOutOfBoundsException e)
        {  
            System.out.println("Podany indeks nie znajduje się w tablicy! Napraw to przed kolejnym uruchomieniem");
            wyraz = null;  
        }

        try 
        {
            System.out.println("Długość wyrazu = " + wyraz.length());
        } 
        catch (NullPointerException e) 
        {
            System.out.println("Ustawiony string ma wartość null :( Napraw to przed kolejnym uruchomieniem");
        } 

        finally 
        {
            System.out.println("Koniec programu.");
        }   
    }
}
