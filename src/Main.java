import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
        System.out.println("Zadanie 1");
        System.out.println("a) ");
        System.out.println("Podaj 5 gatunków zwierząt: ");
        Scanner scan = new Scanner(System.in);
        List<String> zwierzeta = new ArrayList<>();
        for (int z = 0; z < 5; z++) {
            zwierzeta.add(scan.nextLine());
        }
        System.out.println(zwierzeta);

        System.out.println("b) ");
        for(String zmienna : zwierzeta){
            System.out.println(zmienna + ", ");
        }

        System.out.println("b) ");
        zwierzeta.remove(4);
        zwierzeta.remove(3);
        System.out.println(zwierzeta);
        System.out.println("Proszę podać 3 zwierzęta, które nie pojawiły się wcześniej na liście: ");
        zwierzeta.add(scan.nextLine());
        zwierzeta.add(scan.nextLine());
        zwierzeta.add(scan.nextLine());
        System.out.println(zwierzeta);

        System.out.println("c) ");
        Collections.sort(zwierzeta, Collections.reverseOrder());
        for (String zmienna : zwierzeta){
            System.out.println(zmienna + ", ");
        }

         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */
        System.out.println("Zadanie 2");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Proszę podać 10 liczb (mogą się powtarzać): ");
        Set<Integer> liczba = new TreeSet<>();
        for(int j = 0; j < 10; j++){
            liczba.add(scan2.nextInt());
        }
        List<Integer> sortedList = new ArrayList<>(liczba);
        Collections.sort(sortedList);
        System.out.println(sortedList);
        System.out.println(liczba);
        for (Integer y: liczba) {
            System.out.println(y + ", ");
        }

    }

}
