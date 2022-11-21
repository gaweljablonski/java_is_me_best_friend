package instanceOf;

public class InstanceOf {
    public static void main(String[] args) {

        Osoba[] osoba = new Osoba[5];

        osoba[0] = new Pracownik("Gaweł", "Jabłońśki", 99999);
        osoba[1] = new Student("Gustaw", "Jabłoński");
        osoba[2] = new Pracownik("Paweł", "Placek", 4568);
        osoba[3] = new Student("Jacek", "Gacek");
        osoba[4] = new Pracownik("Marek", "Muchomorek", 4568);
//        osoba[0].pobierzOpis();
//        System.out.println();
//        osoba[1].pobierzOpis();

        for(int i = 0; i < osoba.length;i++ ){

            if(osoba[i] instanceof Student) {
                System.out.println();
                System.out.println("z pętli na dół".toUpperCase());
                osoba[i].pobierzOpis();
                System.out.println();
            }
            if (osoba[i] instanceof Pracownik){
                System.out.println();
                System.out.println("z rzutowania na dół");
                Pracownik tmp = (Pracownik)osoba[i];
                tmp.pobierzOpis();
                System.out.println();
            }

        }

    }
}
abstract class Osoba{
    String imie;
    String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    abstract void pobierzOpis();
}
class Pracownik extends Osoba{

    double wynagrodzenie;

    Pracownik(String imie,  String nazwisko, double wynagrodzenie){
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }


    @Override
    void pobierzOpis() {
        System.out.println("Jestem Pracownikiem");
        System.out.println("Imię: " + imie);
        System.out.println("Nawisko: " + nazwisko);
        System.out.println("Wynagrodzenie: " + wynagrodzenie);
    }
}


class Student extends Osoba{
    Student(String imie, String nazwisko){
        super(imie, nazwisko);
    }

    @Override
    void pobierzOpis() {
        System.out.println("Jestem Studentem");
        System.out.println("Imię: " + imie);
        System.out.println("Nawisko: " + nazwisko);
    }
}
