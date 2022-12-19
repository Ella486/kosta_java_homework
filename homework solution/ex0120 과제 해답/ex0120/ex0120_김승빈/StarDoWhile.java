

/**
 ÀÌ¸§: ±è½Âºó
 ³¯Â¥: 22.01.20
 ÁÖÁ¦: º°Âï±â do-while
 */
public class StarDoWhile {

    public static void main(String[] args) {
        int i = 1;
        do {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        } while (i <= 5);
        System.out.println("========");

        i = 1;
        do {
            int j = 0;
            while (j <= (5 - i)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        } while (i <= 5);


        System.out.println("========");

        i = 1;
        do {
            int j = 1;
            while (j <= (5 - i)) {
                System.out.print(" ");
                j++;
            }

            j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        } while (i <= 5);
        System.out.println("========");




        i = 1;
        do {
            int j = 1;
            while (j < i) {
                System.out.print(" ");
                j++;
            }
            j = 0;
            while (j <= (5 - i)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        } while (i <= 5);
    }

}
