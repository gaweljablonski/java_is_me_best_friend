package com.gaweljablonski;

public class Main {

    public static void main(String[] args) {
        Garnek garnek = new Garnek(10, 7 , "niebieski");

        System.out.println(garnek.srednica);
        System.out.println(garnek.wysokosc);
        System.out.println(garnek.kolor);
        System.out.println(garnek.gotuj());
    }

}
