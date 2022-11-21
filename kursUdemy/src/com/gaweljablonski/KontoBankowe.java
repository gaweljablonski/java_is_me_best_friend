package com.gaweljablonski;
public class KontoBankowe{
    private int saldo;

    public KontoBankowe(){
        saldo = 1000;
    }



    int getSaldo(){
        return saldo;
    }

    private boolean setSaldo(int saldo){
        this.saldo = saldo;
        return true;
    }

    boolean wyplac(int ile){

        if(saldo > ile){
            setSaldo(saldo - ile);
        }else {
            return false;
        }
        return true;
    }
    boolean wplac(int ile){
        setSaldo(saldo + ile);
        return true;
    }
}
