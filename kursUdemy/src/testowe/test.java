package testowe;


import java.util.Scanner;

public class test{


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        int sc = scanner.nextInt();
        System.out.println(Convert.toBinary(sc));
        */
        
        boolean toContinue = true;
        while (toContinue) {

            System.out.println("1. marek");
            System.out.println("2. break");

            System.out.print("choise: ");
            int choise = scanner.nextInt();
            switch (choise) {
                case 1 -> System.out.println(Convert.toMarek());
                case 2 -> toContinue = false;

            }
        }
    }
}


class Convert{
    static String toBinary(int x){
        String binary="";

        while (x > 0){
            binary = (x%2) + binary;
            x = x/2;
        }
        return binary;
    }
    static char[] toMarek(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("przed: ");
        String text = scanner.nextLine();
        char[] befor = text.toCharArray();


        char[] after = new char[befor.length];

        after = befor;


        for (int i = 0; i < befor.length; i++){
            String tmp = befor[i] +"";

            if (tmp.equals("m")){
                after[i] = 'a';
            }
            else if (tmp.equals("a")){
                after[i] = 'm';
            }
            else if (tmp.equals("A")){
                after[i] = 'M';
            }
            else if (tmp.equals("M")){
                after[i] = 'A';
            }


            else if (tmp.equals("r")){
                after[i] = 'y';
            }
            else if (tmp.equals("y")){
                after[i] = 'r';
            }
            else if (tmp.equals("R")){
                after[i] = 'Y';
            }
            else if (tmp.equals("Y")){
                after[i] = 'R';
            }


            else if (tmp.equals("n")){
                after[i] = 'o';
            }
            else if (tmp.equals("o")){
                after[i] = 'n';
            }
            else if (tmp.equals("N")){
                after[i] = 'O';
            }
            else if (tmp.equals("O")){
                after[i] = 'N';
            }


            else if (tmp.equals("k")){
                after[i] = 'i';
            }
            else if (tmp.equals("i")){
                after[i] = 'k';
            }
            else if (tmp.equals("K")){
                after[i] = 'I';
            }
            else if (tmp.equals("I")){
                after[i] = 'K';
            }


            else if (tmp.equals("s")){
                after[i] = 'z';
            }
            else if (tmp.equals("z")){
                after[i] = 's';
            }
            else if (tmp.equals("S")){
                after[i] = 'Z';
            }
            else if (tmp.equals("Z")){
                after[i] = 'S';
            }


            else if (tmp.equals("e")){
                after[i] = 'w';
            }
            else if (tmp.equals("w")){
                after[i] = 'e';
            }
            else if (tmp.equals("E")){
                after[i] = 'W';
            }
            else if (tmp.equals("W")){
                after[i] = 'E';
            }


            else if (tmp.equals("c")){
                after[i] = 'u';
            }
            else if (tmp.equals("u")){
                after[i] = 'c';
            }
            else if (tmp.equals("C")){
                after[i] = 'U';
            }
            else if (tmp.equals("U")){
                after[i] = 'C';
            }




        }
        System.out.print("po: ");
        return after;
    }
}
