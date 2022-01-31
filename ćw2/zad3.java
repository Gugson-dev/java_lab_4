import java.util.LinkedHashMap;

import cw2klasy.*;

public class zad3 
{
    public static void main(String[] args) 
    {
        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola,
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola,
        c) wypisać metody toString() wszystkich objektów,
        */

        // POTRZEBNE ZMIENNE

        // STUDENCI OBYDWAJ
        String[] przedmioty = {"Matma", "Polski", "Angielski", "Historia", "Informatyka"};

        // STUDENT I
        int[] oceny1 = {5,6,4,3,5,6,2};

        LinkedHashMap<String, Integer> zaliczenia1 = new LinkedHashMap<>();
        zaliczenia1.put("Matma", 5);
        zaliczenia1.put("Polski", 3);
        zaliczenia1.put("Informatyka", 6);


        // STUDENT II
        int[] oceny2 = {4,3,2,5,2,4,6};

        LinkedHashMap<String, Integer> zaliczenia2 = new LinkedHashMap<>();
        zaliczenia2.put("Matma", 3);
        zaliczenia2.put("Polski", 5);
        zaliczenia2.put("Informatyka", 4);


        // PRACOWNICY OBYDWAJ
        LinkedHashMap<String, String> grupy = new LinkedHashMap<>();
        grupy.put("PR3","Programista");
        grupy.put("PR2","Programista");
        grupy.put("PR1","Programista");

        LinkedHashMap<String, Integer> oceny = new LinkedHashMap<>();
        oceny.put("Daniel", 6);
        oceny.put("Jan", 5);
        oceny.put("Bartek", 4);

        LinkedHashMap<String, String> terminy = new LinkedHashMap<>();
        terminy.put("Programowanie w Java","31.01.2022");
        terminy.put("Programowanie w C#","28.01.2022");
        terminy.put("Programowanie w Python","02.02.2022");

        // PRACOWNIK I
        // Chęć wymyślania innych wartości = 0%

        // PRACOWNIK II
        // Chęć wymyślania innych wartości = 0%

        // 2 Objekty typu Student
        Student student1 = new Student(null, 0 , przedmioty, oceny1, zaliczenia1);
        Student student2 = new Student("Bartek", 23, przedmioty, oceny2, zaliczenia2);

        // 2 Objekty typu Pracownik
        Pracownik pracownik1 = new Pracownik("Krzysztof", 25, grupy, oceny, terminy);
        Pracownik pracownik2 = new Pracownik(null, 0, grupy, oceny, terminy);

        // wypisać metody toString() wszystkich objektów
        System.out.println(student1.toString() + "\n"); 
        System.out.println(student2.toString() + "\n");
        System.out.println(pracownik1.toString() + "\n");
        System.out.println(pracownik2.toString());
    }
}