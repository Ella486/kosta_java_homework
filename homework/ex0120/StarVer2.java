/**
  본인이름: 이명진
  날짜: 22.1.20
  주제 : while ,do-while을 이용해서 별찍기 
*/


class StarVer2 {

	public static void main(String[] args) {

	int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= i) {
                System.out.print("★");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("*******************************");

        i = 1;
        while (i <= 5) {
            int j = 0;
            while (j <= (5 - i)) {
                System.out.print("★");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("*********************************");

        int a = 0;
            while (a < 5) {
                int b = 1;
                while (b < 5 - a) {
                    System.out.print("");
                    b++;
                }
                int c = 0;
                while (c < a + 1) {
                    System.out.print("★");
                    c++;
                }
                System.out.println();
                a++;
		}
		System.out.println("*********************************");

		i = 1;
        while (i <= 5) {
            int j = 1;
            while (j < i) {
                System.out.print("  ");
                j++;
            }
            j = 0;
            while (j <= (5 - i)) {
                System.out.print("★");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
