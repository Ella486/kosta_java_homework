
/**
  �����̸�: �念��
  ��¥: 0121
  ���� : ��Ģ���� v1

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
		else System.out.println("�����ȣ�� �߸��Ǿ����ϴ�..");*/

		switch(op){
            case "+" : System.out.println(a+" + " + b +"  = " + (a+b));break;
			case "-" : System.out.println(a+" - " + b +"  = " + (a-b));break;
			case "*" : System.out.println(a+" * " + b +"  = " + (a*b));break;
			case "/" : System.out.println(a+" / " + b +"  = " + (a/b));break;
			default : System.out.println("�����ȣ�� �߸��Ǿ����ϴ�..");
		}
	}
}

////////////////////////////////////////////////////////
class OperatorExam{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("�ΰ��� ���� �Է� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();

		System.out.print("�����ȣ �Է� : ");
		String op = sc.nextLine();

		Operator one = new Operator();
		one.result(a,b,op);
		
	}
}