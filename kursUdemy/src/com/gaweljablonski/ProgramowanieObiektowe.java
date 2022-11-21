package com.gaweljablonski;

public class ProgramowanieObiektowe {
    public static void main(String[] args) {

//        KontoBankowe oszczednosciowe =  new KontoBankowe();
//
//        oszczednosciowe.wplac(100);
//
//        oszczednosciowe.wyplac(120);
//
//        int pokarzSaldo = oszczednosciowe.getSaldo();
//
//        System.out.println(pokarzSaldo);

        Butelka[] butelka = new Butelka[10];

        for(int i = 0; i < 10; i++){
            butelka[i] = new Butelka(i + 2.5);
        }
        for (int i = 0; i < 10; i++){
            System.out.println(butelka[i].getPojemnosc() + "  Butelka " + (i + 0));
        }
        butelka[4].wlejDoPelna();

        System.out.println();
        butelka[0].wlej(7.4);
        System.out.println(butelka[4].getIleMaLitrow());
        butelka[4].przelej(5.5,butelka[3]);


//        butelka[2].wlejDoPelna();
//        butelka[3].wylejWszystko();

        for (int i = 0; i < 10; i++) {

            
            System.out.println("Pojemność: " + butelka[i].getPojemnosc() + "; ile ma litrów: " + butelka[i].getIleMaLitrow() + "  Butelka " + (i + 0));
        }
    }

}
