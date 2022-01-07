import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        System.out.println("Zad. 1");
        int i = 1000;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj dwie ostatnie cyfry numeru twojego indeksu: ");
        int x = scan.nextInt();

        System.out.println("\n");
        do {
            System.out.println("i: " +i);
        } while (--i % x  > 0);
        System.out.println("Liczba " +i+" jest podzielna przez " + x);
        System.out.println();



        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        System.out.println("Zad. 2");
        System.out.println("a)");
        int[] tablica = {5, 15, 26, 35, 48};

        int licznik = 0;
        while (licznik < tablica.length) {
            System.out.println(tablica[licznik] + " ");
            licznik++;}
        System.out.println();

        System.out.println("b)");
        double[] tab1 = {5, 15, 26, 35, 48};
        int licznikdouble = 0;
        while (licznikdouble < tab1.length){
            System.out.println(tab1[licznikdouble] + " ");
            licznikdouble++;}
        System.out.println();

        System.out.println("c)");
        String[] tab2 = new String[] {"Ala", "Marek"};
        int licznikstring = 2;
        while (licznikstring > tab2.length){
            System.out.println(tab2[licznikstring] + " ");
            --licznikstring;
        }



     /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        int t = 1;
        while (t <= 5) {
            System.out.println("a = " + t);         //pętla true
            t++;}

        int b = 6;
        while (b <= 5) {
            System.out.println(b);                  //pętla false
            b++;}



    }

}


