package com.gaweljablonski;

public class Main {

    public static void main(String[] args) {


//        int zmienna = 10;
//        int[] tab = new int[15];
//
//        for(int i = 0; i < tab.length; i++){
//
//            tab[i] = zmienna;
//            System.out.println();
//            System.out.println(zmienna);
//
//            System.out.println(tab[i] + " to jest część tablicy");
//            zmienna += 10;
//        }
//
//        for(int j = 1; j <= 10; j++) {
//
//            for (int i = 1; i <= 10; i++) {
//
//                System.out.print(i * j + " ");
//
//            }
//            System.out.println();
//        }
//

        int[] liczby = {1, 2, 3, 4, 5, 6};

        int suma = 0;

        for(int i = 0; i < liczby.length; i++){
            suma = suma + liczby[i];

        }
        System.out.println(suma);

    }

}