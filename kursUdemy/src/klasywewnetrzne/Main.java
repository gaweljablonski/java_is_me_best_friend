package klasywewnetrzne;

public class Main 
{

    public static void main(String[] args) 
    {
        KontoBankowe kontoBankowe = new KontoBankowe(1000);
        
        System.out.println(kontoBankowe.getStanKonta());
        
        kontoBankowe.utworzKonto(5);
        
        System.out.println(kontoBankowe.getStanKonta());
        
    }
    
}

class KontoBankowe
{

    public KontoBankowe(double stanKonta) 
    {
        this.stanKonta = stanKonta;
    }
    
    private double stanKonta;
    
    double getStanKonta()
    {
        return this.stanKonta;
    }
    
    void utworzKonto(final double stopa)
    {
        class Odsetki
        {

            public Odsetki(double stopaProcentowa) 
            {
                this.stopaProcentowa = stopaProcentowa;
                zmienStanKonta();
            }
            void zmienStanKonta()
            {
                double odsetki = (stanKonta * stopa) / 100;
                stanKonta += odsetki;
            }

            private double stopaProcentowa;
        }        
        
        Odsetki odsetki = new Odsetki(stopa);
        
    }    

}