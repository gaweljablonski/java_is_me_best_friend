package com.gaweljablonski;

public class Butelka {
    private double ileMaLitrow = 0;
    private double pojemnosc;

    public Butelka(double pojemnosc){
        this.pojemnosc = pojemnosc;
    }

    public Butelka() {

    }

    void ButelkaIleLitrow (double ileMaLitrow){
        this.ileMaLitrow = ileMaLitrow;
    }
    double getPojemnosc(){
        return pojemnosc;
    }
    double getIleMaLitrow(){
        return ileMaLitrow;
    }
    boolean wlej(double ilosc){
        if(this.ileMaLitrow < this.pojemnosc) {
            this.ileMaLitrow = this.ileMaLitrow + (ilosc);
            if(this.ileMaLitrow > this.pojemnosc){
                this.ileMaLitrow = this.ileMaLitrow - (this.ileMaLitrow - this.pojemnosc);
            }
        }else if (this.ileMaLitrow == this.pojemnosc){

        }else {
            return false;
        }
        return true;
    }
    boolean wylej(double ilosc){
        if (ilosc <= ileMaLitrow){
            this.ileMaLitrow -= ilosc;
        }else {
            return false;
        }
        return true;
    }
    void przelej (double ile, Butelka gdzie){
        if (this.wylej(ile)){
            gdzie.wlej(ile);
//            if((this.wlej(ile) - this.wlej(ile)) > 0){
//                System.out.println("lolololol");
//            }
        }else System.out.println("za mało");
    }



    boolean wlejDoPelna(){
        if(this.ileMaLitrow < this.pojemnosc){


            this.ileMaLitrow = this.pojemnosc - this.ileMaLitrow;

        }else {
            return false;
        }
        return true;
    }
    boolean wylejWszystko(){
        if (this.ileMaLitrow > 0){
            this.ileMaLitrow -= this.ileMaLitrow;
        }else {
            return false;
        }
        return true;
    }



}
