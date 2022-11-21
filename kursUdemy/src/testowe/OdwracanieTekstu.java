package testowe;

import java.util.Scanner;

public class OdwracanieTekstu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        char[] arr = text.toCharArray();


        //your code goes here

        char[] rewers = new char[arr.length];

        int j = 0;

        for(int i = arr.length-1; i +1 > 0; i--){
            rewers[i] = arr[j];
//            System.out.println("jaja");
            j++;
        }

        System.out.print(rewers);

    }
}
