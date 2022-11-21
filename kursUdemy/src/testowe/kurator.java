package testowe;

import java.util.Scanner;

public class kurator {

    /*
    algorytm szuka największej liczby z 10 podanych z kuratoryjnego 2020r
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        boolean kontunuowac = true;
        Scanner scanner = new Scanner(System.in);


        while (kontunuowac){
            if (a == 10){
                System.out.println(b);
                kontunuowac = false;
            }else {
                System.out.println("wprowadź c");
                int c = scanner.nextInt();
                a++;
                if (c>b){
                    b = c;

                }else {
                    continue;
                }

            }

        }

    }
}
