/**
  �����̸�: �̸���
  ��¥: 22.1.20
  ���� : �������α׷�Ver3 - �̸�,����,����,���� ������ Ű���� �Է��� �޾Ƽ� ����ǥ�� ����Ѵ�.
*/
import java.util.Scanner; 

class GradeVer3{
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸���:");
		String name = sc.nextLine();

		System.out.print("��������:");
		int kor =Integer.parseInt( sc.nextLine() ); // ���ڿ� ---> ���ڷκ���

		System.out.print("��������:");
		int eng =Integer.parseInt( sc.nextLine() );

		System.out.print("��������:");
		int math =Integer.parseInt( sc.nextLine() );

		int total = kor + eng + math;
		double avg = (int) ((total / 3.0) * 100) / 100.0;// �Ҽ��� ��°�ڸ�����

	
		char grade;
		if (avg >= 90) grade = 'A';
		else if (avg >= 80) grade = 'B';
		else if (avg >= 70) grade = 'C';
		else if (avg >= 60) grade = 'D';
		else grade = 'F';

		System.out.println("--------------------------");
		System.out.println("��    ��: " + name);
		System.out.println("��������: " + kor);
		System.out.println("��������: " + eng);
		System.out.println("��������: " + math);
		System.out.println("��    ��: " + total);
		System.out.println("��    ��: " + avg); 
		System.out.println("��    ��: " + grade);
			
		System.out.println("------End--------");

	}
}