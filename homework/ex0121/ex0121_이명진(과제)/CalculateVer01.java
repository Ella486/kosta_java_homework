/**
  본인이름: 이명진
  날짜: 22.1.21
  주제 : 사칙연산Ver1
*/


import java.util.*;

class Calculate 
{
	int x, y;
	int result;
	char ch;

	// 입력받을 메소드
	void input() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.print("임의의 연산자 입력(+ - * /) : ");
		char ch = sc.next().charAt(0);

	}

	// 두 정수와 연산자를 입력받아 값을 계산하는 메소드
	int cal() {
	
		result = 0;	

		if(ch == '+') {
			result = x + y;
		}
		else if(ch == '-') {
			result = x - y;
		}
		else if(ch == '*') {
			result = x * y;
		}
		else if(ch == '/') {
			result = x / y;
		}else {
			System.out.print("연산기호가 잘못되었습니다.");
		}

		return result;

	}

	// 결과 출력 메소드
	void showResult(int s) {
		
		System.out.printf(">> %d %c %d = %d\n", x, ch, y, s);

	}

}


public class CalculateVer01 {

	public static void main(String[] args) {

		Calculate c = new Calculate();
		

		// 안내 메세지 출력
		c.input();

		// 계산 결과
		int t = c.cal();

		// 결과 출력
		c.showResult(t);



	}
}




