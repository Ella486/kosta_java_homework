/**
  이름: 김승빈
  날짜: 22.01.19
  주제: 별찍기
*/
class Star {

	public static void main(String... args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============");

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= (5 - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (5 - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}