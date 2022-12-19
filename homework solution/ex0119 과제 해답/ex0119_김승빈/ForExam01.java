/**
  이름: 김승빈
  날짜: 22.01.19
  주제: For 연습문제 1
*/
class ForExam01 {

	public static void main(String... args) {
		int start = 1;
		int end = 100;

		// 1. 1~100까지 한줄로 출력
		for (int number = start; number <= end; number++) {
			System.out.print(number + " ");
		}
		System.out.println();
		System.out.println("===========================");

		// 2. 1~100까지 출력하는데, 5의 배수만 출력
		for (int number = start * 5; number <= end; number += 5) {
			System.out.print(number + " ");

		}
		System.out.println();
		System.out.println("===========================");

		// 3. 1~100까지 합을 출력
		int sum = 0;
		for (int number = start; number <= end; number++) {
			sum += number;
		}
		System.out.println("1~100까지의 합은 " + sum + "입니다.");
		System.out.println("===========================");

		// 4. A~Z까지 출력
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		System.out.println("===========================");

		// 5. 1~100 사이에 3의 배수의 합 출력하기?
		int sum2 = 0;
		for (int number = 3; number <= end; number += 3) {
			sum2 += number;
		}
		System.out.println("1~100까지의 3의 배수들의 합은 " + sum2 + "입니다.");
		System.out.println("===========================");

		// 6. 1~100 출력을 10행 10열로 출력 (for문 안에 조건문. 2중포문 x)
		for (int number = start; number <= end; number++) {
			System.out.print(number + " ");
			if (number % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("===========================");

		// 7. 100~1까지 거꾸로 출력
		for (int number = end; number >= start; number--) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

}