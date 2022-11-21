package testowe;

public class Statycznosc {
    public static void main(String[] args) {
        Klient a = new Klient("Marek");
        Klient b = new Klient("Jarek");
        Klient c = new Klient("Seba");



        System.out.println(a.imie + " " + a.id);
        System.out.println(b.imie + " " + b.id);
        System.out.println(c.imie + " " + c.id);
    }
}
class Klient{

    Klient (String imie){
        this.imie = imie;
        id = nastepneId;
        nastepneId++;

    }
    String imie;
    int id;
    static int nastepneId = 1;
}

