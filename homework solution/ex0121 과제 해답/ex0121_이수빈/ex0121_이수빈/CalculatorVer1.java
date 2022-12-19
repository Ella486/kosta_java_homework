/**
  본인이름: 이수빈
  날짜: 2022.01.21
  주제 : 사칙연산Ver1
*/


import java.util.Scanner;

class CalculatorVer1 {
	public static void main(String []args) {
		Calculator c = new Calculator();	
		c.printAll();

	}
}
///////////////////////////////////////////////////////////////////
class Calculator {

	public int calculate(int num1, int num2, String operator){

		int result = 0;

		switch(operator) {
			case "+": result = num1 + num2;
				System.out.println("연산결과 : " + result);
			break;

			case "-": result = num1 - num2;
				System.out.println("연산결과 : " + result);
			break;

			case "*": result = num1 * num2;
				System.out.println("연산결과 : " + result);
			break;

			case "/": result = num1 / num2;
				System.out.println("연산결과 : " + result);
			break;
	
			default : System.out.println("연산기호가 잘못되었습니다.");
		}
		return result;
	}



  //키보드 입력
	public void printAll() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수> ");
		int n1 = Integer.parseInt(sc.nextLine());

		System.out.print("연산기호> ");
		String s = sc.nextLine();

		System.out.print("두번째 정수> ");
		int n2 = Integer.parseInt(sc.nextLine());

		calculate(n1, n2, s); //this. 생략한 같은 클래스내의 메소드 호출
		
	}

}