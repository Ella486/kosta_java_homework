
/**
  �����̸�: �念��
  ��¥: 0121
  ���� : ��Ģ����02

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
			System.out.println(" 1.���ϱ� 2.���� 3.���ϱ� 4.������ 5.����");
			System.out.println("---------------------------------------------");
			System.out.print("���� >> ");

			int cho = sc.nextInt();
			Operator02 one = new Operator02();

			if(cho == 5)
			  break;
			else {
				System.out.print("�ΰ��� ���� �Է� : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				System.out.print(" = ");
				if(cho == 1) one.plus(a, b);		
				else if(cho == 2) one.minus(a, b);	
				else if(cho == 3) one.multiple(a, b);	
				else if(cho == 4) one.divison(a, b);	 
				else
                   System.out.print(cho + "�� �޴� �Է� �����Դϴ�.");
			}
			
		}//�ݺ�����
	}//���γ�
}