package sda.zadaniadom;

public class sortowanie_babelkowe {

    public static void main(String[] args) {
        int[] tab = {6,7,3,4,8,9,0,1,2};

        int i, j, temp, f;

        System.out.println("Zawratosc tablicy: " );

        for(i = 0; i < tab.length; i++) System.out.println(tab[i] + " ");
        System.out.println();

        for(i = 0; i < tab.length - 1; i++){
            for(j = 0; j < tab.length - 1; j++){
                if(tab[j] > tab[j + 1]){
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Posortowania tablica: ");
        for(i = 0; i < tab.length; i++) System.out.println(tab[i] + " ");
    }
}
