/**
  본인이름: 이명진
  날짜: 22.1.20
  주제 : p.134 7번문제 코딩 - while문과 Scanner를 이용해서 예금, 출금, 조회, 종료 기능이 나오도록 만들기
*/
import java.util.Scanner;

class Exercise07 {

	public static void main(String[] args) {
		boolean run = true; // 상태변수(true이면 반복문을 돌고, false가 되면 반복문을 빠져나옴)

		int balance = 0; // 잔액(잔고)

		Scanner sc = new Scanner(System.in); // 키보드입력받기를 위한 준비!

		while(run) { // run이 true일 동안 반복해라.
		System.out.println("---------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("---------------------------------");
		System.out.print("선택> ");

		int menuNum = sc.nextInt();

		switch(menuNum){ // byte, short, char, int 만 허용 - -- String 허용 1.7version 가능
			case 1:
				System.out.print("예금액>"); // 예금할 금액을 입력받아 balance에 누적한다.
				balance += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액>"); // 출금할 금액을 입력받아 balance에 빼기한다.
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.print("잔고>"); // 잔액을 출력한다.
				System.out.println(balance);
				break;
			case 4:
				run = false; // 반복문을 빠져나간다.
				break;
			default: System.out.println("메뉴는 1 ~ 4 숫자만 가능합니다.");
		}
		System.out.println();

	} //while문 끝

	System.out.println("프로그램 종료");

  }//메인

}// 클래스 끝