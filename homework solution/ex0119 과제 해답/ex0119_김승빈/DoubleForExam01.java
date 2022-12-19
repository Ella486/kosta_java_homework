/**
  이름: 김승빈
  날짜: 22.01.19
  주제: For 연습문제 2
*/
class DoubleForExam01 {

	public static void main(String... args) {
		// 1. 1~100을 출력하는데 10행 10열로 출력 (for문 2개)
		for (int i = 0; i <= 9; i++) {
			for (int j = 1; j <= 10; j++){
				System.out.print((i * 10) + j + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("========================");

		// 2. 구구단
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + ", ");
			}
			System.out.println();
		}
	}

}