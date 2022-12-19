/**
  본인이름: 이수빈
  날짜: 2022.01.21
  주제 : 사칙연산Ver2
*/

import java.util.Scanner;

public class CalculatorVer2 {

	public static void main(String[] args) {

		boolean menu = true;

		Calculator c = new Calculator();

		Scanner sc = new Scanner(System.in);

		while (menu) {
			System.out.println("==========================================");
			System.out.println("1.더하기 | 2.빼기 | 3.곱하기 | 4.나누기 | 9.종료");
			System.out.println("==========================================");
			System.out.print("선택> ");

			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				c.printAll("+");
				break;

			case 2:
				c.printAll("-");
				break;

			case 3:
				c.printAll("*");
				break;

			case 4:
				c.printAll("/");
				break;

			case 9:
				menu = false;
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				System.out.println("메뉴는 1~4, 9 숫자만 선택가능합니다.");
				

			}

			}
		}

	}

	class Calculator {

		public int calculate(int num1, int num2, String operator) {

			int result = 0;

			switch (operator) {
			case "+":
				result = num1 + num2;
				System.out.println("연산결과 : " + result);
				break;

			case "-":
				result = num1 - num2;
				System.out.println("연산결과 : " + result);
				break;

			case "*":
				result = num1 * num2;
				System.out.println("연산결과 : " + result);
				break;

			case "/":
				result = num1 / num2;
				System.out.println("연산결과 : " + result);
				break;

			default:
				System.out.println("연산기호가 잘못되었습니다.");
			}
			return result;
		}

		public void printAll(String s) {

			Scanner sc = new Scanner(System.in);

			System.out.print("첫번째 정수> ");
			int n1 = Integer.parseInt(sc.nextLine());

			System.out.print("두번째 정수> ");
			int n2 = Integer.parseInt(sc.nextLine());

			calculate(n1, n2, s);

		}

	
}