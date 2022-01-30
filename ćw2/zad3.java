import java.util.LinkedHashMap;

import cw2klasy.*;

public class zad3 {

    public static void main(String[] args) {
        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola,
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola,
        c) wypisać metody toString() wszystkich objektów,
        */
        Student student = new Student();
        //Student student2 = new Student();
        int[] oceny = {5,6,4,3,5,6,2};
        String[] przedmioty = {"Matma", "Polski", "Angielski", "Historia", "Informatyka"};
        LinkedHashMap<String, Integer> zaliczenia = new LinkedHashMap<>();   

        zaliczenia.put("Matma", 5);
        zaliczenia.put("Polski", 3);
        zaliczenia.put("Informatyka", 6);

        student.setOceny(oceny);
        student.setPrzedmioty(przedmioty);
        student.setZaliczenia(zaliczenia);
        System.out.println(student.toString()); 
    }
}