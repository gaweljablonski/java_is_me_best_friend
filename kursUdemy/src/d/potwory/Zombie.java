package d.potwory;

public class Zombie extends Potwor{
    public Zombie(){
        System.out.println("TO jest domyślny konstruktor z klasy Zombie");
    }

    public Zombie(double predkoscChodzenia, double HP){
        super(predkoscChodzenia, HP);
    }
}
