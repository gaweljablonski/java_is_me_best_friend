package d.potwory;

import javax.print.DocFlavor;

public class Szkielet extends Potwor{

    String typBroni;
    public Szkielet(){
        System.out.println("TO jest domyślny konstruktor z klasy Szkielet");
    }

    public Szkielet(double predkoscChodzenia, double HP){
        super(predkoscChodzenia, HP);
    }
    public Szkielet(double predkoscChodzenia, double HP, String typBroni){
        super(predkoscChodzenia, HP);
        this.typBroni = typBroni;
        System.out.println("TO NIE jest domyślny konstruktor z klasy Szkielet");
    }
    public String getTypBroni(){
        return typBroni;
    }

}
