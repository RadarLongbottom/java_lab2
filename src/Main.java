public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        for (int x = 0; x <= 20; x++) {
            if (x % 3 == 0)
                continue;
            System.out.println(x + " ");
        }
        System.out.println();
        for (int x = 0; x <= 45; x++) {
            if (x == 17)
                break;
            System.out.println(x + " ");
        }
        System.out.println();
        for (int x = 0; x <= 60; x++) {
            if (x == 25)
                return;
            System.out.println(x + " ");
        }

    }
}
