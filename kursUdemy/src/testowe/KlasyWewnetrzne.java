package testowe;


public class KlasyWewnetrzne {
    public static void main(String[] args) {


        Konto kontoBankowe = new Konto(1000);

        System.out.println(kontoBankowe.getStanKonta());

        kontoBankowe.start(400);

        System.out.println(kontoBankowe.getStanKonta());

    }
}

class Konto {

    public Konto(double stanKonta){
        this.stanKonta = stanKonta;

    }

    private double stanKonta;

    public double getStanKonta() {
        return this.stanKonta;
    }

    public void setStanKonta(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    void start (double stopa){
        Odsetki odsetki = new Odsetki(stopa);

        odsetki.zmienStanKonta(stopa);
    }

    class Odsetki{

        public Odsetki (double stopaProcentowa){
            this.stopaProcentowa = stopaProcentowa;
        }

        void zmienStanKonta (double stopa){

            double odeetki = (stanKonta * stopa) / 100;
            stanKonta += odeetki;

        }


        private double stopaProcentowa;

    }
}
