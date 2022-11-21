package d.potwory;



public class Potwor {




    private double predkoscChodzenia;
    private double HP;

    public double getPredkoscChodzenia() {
        return predkoscChodzenia;
    }
    public double getHP(){
        return HP;
    }

    public void setPredkoscChodzenia(double predkoscChodzenia) {
        this.predkoscChodzenia = predkoscChodzenia;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public void atakuj(){
        /*

         */

        System.out.println("To jest metoda atakuj z klasy Potwor");
    }
    public Potwor(){
        System.out.println("Domyślny komstruktor z klasy Potwor");
    }
    public Potwor(double predkoscChodzenia, double HP){
        this.predkoscChodzenia = predkoscChodzenia;
        this.HP = HP;
        System.out.println("NieDomyślny komstruktor z klasy Potwor");

    }
}
