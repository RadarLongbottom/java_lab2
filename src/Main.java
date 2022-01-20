import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int[] zad1(int pierwsze) {
        var tab = new int[pierwsze + 1];
        var x = 0;
        for (int a = 40; a >= pierwsze; a--) {
            tab[x] = a;
            x++;
        }
        for (int a = 0; a < tab.length; a++) {
            System.out.println(tab[a] + ",");
        }
        return tab;
    }
    public static String[] zad2(){
        Scanner scan = new Scanner(System.in);
        String[] tab1 = new String[6];

    for (int k = 0; k < tab1.length; k++)
    {
        tab1[k] = scan.nextLine();
    }
    for (int k = tab1.length -1; k >= 0; k--){
        System.out.println(tab1[k]);
    }
    return tab1;
    }

    public static void zad3(String name){
        System.out.println("Imię: " + name );
    }
    public static void zad3(String name, String surname){
        System.out.println("Imię: " + name + " Nazwisko: " + surname);
    }
    public static void zad3(String name, String surname, int age){
        System.out.println("Imię: " + name + " Nazwisko: " + surname + " Wiek: " + age);
    }
    public static int zad4(int A, int B){
        int wynik = A + B;
        System.out.println(wynik);
        return wynik;
    }
    public static int zad4(int A, int B, int C){
        int wynik = A + B + C;
        System.out.println(wynik);
        return wynik;
    }


    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */
        System.out.println("Zadanie 1");
        var tab = zad1(20);

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */
        System.out.println("Zadanie 2");
        System.out.println("Wprowadź 6 wartości do tablicy: ");
        zad2();

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */
        System.out.println("Zadanie 3");
        zad3("Aleksander ");
        zad3("Aleksander", "Skierka");
        zad3("Aleksander", "Skierka", 21);

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
        System.out.println("Zadanie 4");
        int zmiennaA = zad4(5, 7);
        int zmiennaB = zad4(5, 14, 22);
        int wynik = zmiennaA + zmiennaB;
        System.out.println(wynik);
    }

}