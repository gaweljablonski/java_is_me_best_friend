package testowe;

public class Main {

    /* funkcja przyjmująca jako parametr dowolny napis.
     * Na wyjściu funkcji zwracany jest łańcuch, w którym
     * wszystkie małe litery zostają zamienione na duże.
     * Pozostałe znaki nie są zmienione.

     *
     */
    public static String upperCase(String napis)
    {
        String wynik=""; // zmienna wynikowa, w której trzymany będzie gotowy napis
        char znak;    // zmienna przechowująca pojedyncze znaki ze zmiennej napis
        int kod_ascii;// tutaj będziemy przechowywać kod ASCII danego znaku
        for (int i = 0 ; i < napis.length() ; i++)
        {
            znak = napis.charAt(i);  // pobieramy literę na zadanej pozycji i
            // małe litery w kodzie ASCII mają numery od 97 do 122
            // sprawdzamy zatem, czy kod ASCII naszej wybranej litery jest w tym przedziale
            // w tym celu najpierw należy rzutować typ char na typ int
            kod_ascii = (int) znak; // tutaj możemy również rzutować niejawnie
            System.out.println(kod_ascii);
            // różnica w kodzie ASCII pomiędzy małą a wielką literą to 32
            // aby więc zmienić małą literę na wielką należy od jej kodu ASCII
            // odjąć 32.
            if (kod_ascii >=97 && kod_ascii <=122)
            {
                kod_ascii = kod_ascii - 32;
                znak = (char)kod_ascii; // tym razem rzutujemy int na znak char
                // a więc sprawdzamy jaki znak z tablicy ASCII odpowiada danej liczbie
            }
            wynik = wynik + znak; // znak char zostaje doklejony do napisu wynikowego
        }

        return wynik;
    }

    public static void main(String[] args) {

        String przykladowy_napis = "ala ma 2 koty i psa";
        przykladowy_napis = upperCase(przykladowy_napis);
        System.out.println(przykladowy_napis);
    }
}