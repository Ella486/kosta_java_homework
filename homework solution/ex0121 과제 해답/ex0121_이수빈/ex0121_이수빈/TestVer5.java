/**
  �����̸�: �̼���
  ��¥: 2022.01.21
  ���� : �������ϱ�Ver5
*/

import java.util.Scanner;

public class TestVer5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean menu = true;

		while (menu) {
			System.out.println("====================");
			System.out.println("1.����ǥ���ϱ� | 2.����");
			System.out.println("====================");
			System.out.print("����> ");

			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				System.out.println("1���� �����߽��ϴ�.");

				System.out.print("�̸�> ");
				String name = sc.nextLine();

				System.out.print("��������>  ");
				int kor = Integer.parseInt(sc.nextLine());

				System.out.print("��������> ");
				int eng = Integer.parseInt(sc.nextLine());

				System.out.print("��������> ");
				int math = Integer.parseInt(sc.nextLine());


				
				printAll(name, kor, eng, math);
				
				break;

			case 2:
				menu = false;
				System.out.println("���α׷��� �����մϴ�.");
				break;

			default:
				System.out.println("�޴��� 1~2 ���ڸ� ���ð����մϴ�.");
				break;

			}
		}
	}

	private static int totalScore(int kor, int eng, int math) {

		int total = kor + eng + math;

		return total;
	}

	private  double average(int total, int subject) {

		double avg =  (total / (double)subject);

		return avg;
	}
	
	private static char gradeScope(double avg) {
		
		char grade = ' ';

		switch((int)(avg/10)) {
			case 10:
			case 9: grade = 'A';
			break;

			case 8: grade = 'B';
			break;

			case 7: grade = 'C';
			break;

			case 6: grade = 'D';
			break;

			default : grade = 'F';
			

		}	

		return grade;

	}
	
	////////////////////////////////////////////////////////////////
	public  void printAll(String name, int kor, int eng, int math) {
		
		int count = 3;
		
		System.out.println(name + "�� ������ ������ �����ϴ�.");
		
		int totalS = totalScore(kor, eng, math);
		System.out.println("����> " + totalS);
		
		double average = average(totalS, count);
		System.out.println("���> " + average);
		
		char grade = gradeScope(average);
		System.out.println("���> " + grade);
	
		
	}
	

}
