/**
  본인이름: 이명진
  날짜: 22.1.21
  주제 : 사칙연산Ver2
*/

import java.util.Scanner;

public class CalculateVer02 {


	public static void main(String[] args) {

		boolean run = true; // 상태변수(true이면 반복문을 돌고, false가 되면 반복문을 빠져나옴)


		Scanner sc = new Scanner(System.in); // 키보드입력받기를 위한 준비!

		while(run) { // run이 true일 동안 반복해라.
			
			int a;
			int b;

			System.out.print("a :");
			a = sc.nextInt(); 

			System.out.print("b :");
			b = sc.nextInt();

			System.out.println("---------------------------------");
			System.out.println("1.더하기 | 2.빼기 | 3.곱하기 | 4. 나누기 | 9.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");

			int menuNum = sc.nextInt();

		switch(menuNum){ // byte, short, char, int 만 허용 - -- String 허용 1.7version 가능
			case 1:
				System.out.println("더하기>"+ (a+b)); 
				break;
			case 2:
				System.out.println("빼기>" + (a-b)); 
				break;
			case 3:
				System.out.println("곱하기>" + (a*b)); 
				break;
			case 4:
				System.out.println("나누기>" + (a/b)); 
				break;
			case 9:
				run = false; // 반복문을 빠져나간다.
				break;
			default: System.out.println("메뉴는 1,2,3,4,9 숫자만 가능합니다.");
		}
		System.out.println();

	} //while문 끝

	System.out.println("프로그램 종료");

  }//메인

}// 클래스 끝