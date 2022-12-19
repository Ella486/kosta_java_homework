
/**
  본인이름: 장영지
  날짜: 0121
  주제 : 사칙연산02

*/
import java.util.Scanner;
class Operator02
{
	public void plus (int a, int b){
		System.out.println(a+b);
	}
	public void minus(int a, int b){
		System.out.println(a-b);
	}
	public void multiple(int a, int b){
		System.out.println(a*b);
	}
	public void divison(int a, int b){
		System.out.println(a/b);
	}
}

///////////////////////////////////////////////////////
class OperatorExam02{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("---------------------------------------------");
			System.out.println(" 1.더하기 2.뺴기 3.곱하기 4.나누기 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택 >> ");

			int cho = sc.nextInt();
			Operator02 one = new Operator02();

			if(cho == 5)
			  break;
			else {
				System.out.print("두개의 정수 입력 : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				System.out.print(" = ");
				if(cho == 1) one.plus(a, b);		
				else if(cho == 2) one.minus(a, b);	
				else if(cho == 3) one.multiple(a, b);	
				else if(cho == 4) one.divison(a, b);	 
				else
                   System.out.print(cho + "는 메뉴 입력 오류입니다.");
			}
			
		}//반복문끝
	}//메인끝
}