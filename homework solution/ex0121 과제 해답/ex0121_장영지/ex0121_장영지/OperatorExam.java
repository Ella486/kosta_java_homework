
/**
  본인이름: 장영지
  날짜: 0121
  주제 : 사칙연산 v1

*/
import java.util.Scanner;
class Operator
{
	public void result(int a, int b, String op){
		/*if(op.equals("+")) System.out.println(a+b);
		else if(op.equals("-")) System.out.println(a-b);
		else if(op.equals("*")) System.out.println(a*b);
		else if(op.equals("/")) System.out.println(a/b);
		else if(op.equals("%")) System.out.println(a/b);
		else System.out.println("연산기호가 잘못되었습니다..");*/

		switch(op){
            case "+" : System.out.println(a+" + " + b +"  = " + (a+b));break;
			case "-" : System.out.println(a+" - " + b +"  = " + (a-b));break;
			case "*" : System.out.println(a+" * " + b +"  = " + (a*b));break;
			case "/" : System.out.println(a+" / " + b +"  = " + (a/b));break;
			default : System.out.println("연산기호가 잘못되었습니다..");
		}
	}
}

////////////////////////////////////////////////////////
class OperatorExam{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("두개의 정수 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();

		System.out.print("연산기호 입력 : ");
		String op = sc.nextLine();

		Operator one = new Operator();
		one.result(a,b,op);
		
	}
}