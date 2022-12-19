
/**
  �����̸�: �念��
  ��¥: 0121
  ���� : �������ϱ�5

*/
import java.util.Scanner;

 class PrintGrade00
{

	//�������ϱ�
	private int getTotal(int lang ,int eng,int  math){//50 70 60

		return lang + eng + math;
	}


   //��ձ��ϱ� 
	private double getAvg(int total, int num){//210  3
          //����� ���ؼ� �Ҽ����ڸ� 2�ڸ�����...
		  double   result = total / (double)num; //82.235642
		  result = (int)(result*100) / 100.0;

		return  result;
		
	}

	//��ޱ��ϱ� 
	private char getGrade(double avg){
		if(avg >= 90) return 'A';
		else if(avg >=80) return 'B';
		else if(avg >=70) return 'C';
		else if(avg >=60) return 'D';
		else return 'F';
	}

    //����ǥ��  ����ϴ� �޼ҵ� 
	public void printGrade(String name, int lang, int eng, int math){ //
		int total = this.getTotal(lang, eng, math);
		double avg= this.getAvg(total, 3);
		char grade = this.getGrade(avg);

		System.out.println("�̸� : "+name);
		System.out.println("���� : " + total + "\n������� : "+ avg +"\n���� : "+grade + "\n");	
	}
}



////////////////////////////////////////////////////////////////////////////////////////
class CalculateGrade05{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
        PrintGrade00 one = new PrintGrade00();
		while(true){
			System.out.println("------------------------------------");
			System.out.println("  1. ����ǥ	2. ����");
			System.out.println("------------------------------------");
			System.out.print("���� >> ");
			int cho = sc.nextInt(); // 1 �Է��ϰ� ����

			System.out.println();

			if(cho == 1){

				sc.nextLine(); //

				System.out.print("�̸� �Է� : ");
				String name = sc.nextLine();

				System.out.print("���� ���� �Է� : ");
				int lang = sc.nextInt();

				System.out.print("���� ���� �Է� : ");
				int math = sc.nextInt();

				System.out.print("���� ���� �Է� : ");
				int eng = sc.nextInt();

				System.out.println("------------------------------------");
				one.printGrade(name, lang, eng, math);

				
			}else if(cho == 2){
				break;
			}
		}
	}
}