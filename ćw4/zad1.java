import java.util.Scanner;

public class zad1 
{
    public static void main(String[] args) 
    {
        /* zad.1
            a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
            b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
            c) zabezpieczyć kod przed wprowadzeniem:
            - za dużej liczby (index > tab.length),
            - wprowadzeniem innego znaku niż liczba,
            d) użyć metody finally aby wyświetlić komunikat zakończenia programu
            e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

            PODPOWIEDZI:
            scan.next() - można wprowadzać dowolny znak z klawiatury,
            index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

            warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
            boolean isIndexCorrect
            white(!isIndexCorrect) {}
        */

        Scanner input = new Scanner(System.in);
        int[] liczby = new int[]{1, 2, 3, 4, 5, 6};
        boolean isIndexIncorrect = true;
        int index = 0;
            
        System.out.print("Wprowadź numer indeksu do którego chcesz zobaczyć przypisaną wartość: ");
        try 
        {
                index = Integer.parseInt(input.next());
                System.out.println("Liczba pod indeksem '" + index + "' to: " + liczby[index-1]);
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            while (isIndexIncorrect) 
            {
                System.out.print("Wprowadź poprawny index!: ");
                try 
                {
                    index = Integer.parseInt(input.next());
                    System.out.println("Liczba pod indeksem '" + index + "' to: " + liczby[index-1]);

                } 
                catch (ArrayIndexOutOfBoundsException s) 
                {
                    continue;
                }
                catch (NumberFormatException n)
                {
                    continue;
                }
                isIndexIncorrect = false;
            }
        }
        catch (NumberFormatException f) 
        {
            while (isIndexIncorrect) 
            {
                System.out.print("Wprowadź poprawny index!: ");
                try 
                {
                    index = Integer.parseInt(input.next());
                    System.out.println("Liczba pod indeksem '" + index + "' to: " + liczby[index-1]);

                } 
                catch (ArrayIndexOutOfBoundsException s) 
                {
                    continue;
                }
                catch (NumberFormatException n)
                {
                    continue;
                }
                isIndexIncorrect = false;
            }
        }
        
        finally 
        {
            System.out.println("Koniec programu!");
        }

        input.close();  
    }
}
