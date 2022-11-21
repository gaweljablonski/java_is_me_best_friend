package com.gaweljablonski;

public class Garnek {
    final int  srednica;
    final int wysokosc;
    String kolor;

    public Garnek(int srednica, int wysokosc, String kolor){
        this.srednica = srednica;
        this.wysokosc = wysokosc;
        this.kolor = kolor;
    }

    public String gotuj(){ return "Gotowanie w trakcie";}
}
