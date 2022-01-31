import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] liczby = new int[]{1, 2, 3, 4, 5, 6};
        boolean isIndexIncorrect = false;
        int index = 0;
            


                System.out.print("Wprowadź numer indeksu do którego chcesz zobaczyć przypisaną wartość: ");
                while (true) 
                {
                    try 
                    {
                        while (!isIndexIncorrect)
                        {
                            index = Integer.parseInt(input.next());
                            System.out.println("Numer: " + index + "\nWartość: " + liczby[index]);
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException e) 
                    {
                        System.out.println("Wprowadź poprawny indeks!");
                        isIndexIncorrect = true;
                        continue;
                    }
                
                    catch (NumberFormatException s)
                    {
                        System.out.println("Wprowadzony index musi być wartością int");
                        isIndexIncorrect = true;
                        continue;
                    }
                    finally 
                    {
                        System.out.println("Koniec wyświetlania");
                    }
                    break; 

                }  





        input.close();
    }
}
