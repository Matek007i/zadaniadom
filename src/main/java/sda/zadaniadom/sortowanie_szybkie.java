package sda.zadaniadom;

import java.io.Console;

public class sortowanie_szybkie {

    public static int tablica[];
    public static int ile_liczb;

    public static void main(int tablica[], int x, int y) {
        int i, j, v, temp;

        i = x;
        j = y;

        v = tablica[(x + y) / 2];
        do {
            while (tablica[i] < v)
                i++;
            while (v < tablica[j])
                j--;
            if (i <= j) {
                temp = tablica[i];
                tablica[i] = tablica[j];
                tablica[j] = temp;
                i++;
                j--;
            }
        }
        while (i <= j);
        if (x < j)
            main(tablica, x, j);
        if (i < y)
            main(tablica, i, y);
    }

    public static void main(String[] args) {
        int i, liczba;

        System.out.println("Ile liczb chcesz posortowac.");
        ile_liczb = Integer.parseInt("?");
        tablica = new int[ile_liczb];
        for(i = 0;  i<ile_liczb; i++){
            tablica[i] = Integer.parseInt("Wprowadz liczbe #" + (i+1));
            }
        System.out.println("Tablica przed sortowaniem:");
        for(i = 0; i <ile_liczb; i++)
            System.out.println(tablica[i]);
        main(tablica,0,ile_liczb-1);
        System.out.println("Tablica po posortowaniu: ");
        for(i = 0; i < ile_liczb; i++)
            System.out.println(tablica[i]);
    }
}
