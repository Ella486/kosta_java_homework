/**
  �����̸�: �̸���
  ��¥: 22.1.21
  ���� : ��Ģ����Ver2
*/

import java.util.Scanner;

public class CalculateVer02 {


	public static void main(String[] args) {

		boolean run = true; // ���º���(true�̸� �ݺ����� ����, false�� �Ǹ� �ݺ����� ��������)


		Scanner sc = new Scanner(System.in); // Ű�����Է¹ޱ⸦ ���� �غ�!

		while(run) { // run�� true�� ���� �ݺ��ض�.
			
			int a;
			int b;

			System.out.print("a :");
			a = sc.nextInt(); 

			System.out.print("b :");
			b = sc.nextInt();

			System.out.println("---------------------------------");
			System.out.println("1.���ϱ� | 2.���� | 3.���ϱ� | 4. ������ | 9.����");
			System.out.println("---------------------------------");
			System.out.print("����> ");

			int menuNum = sc.nextInt();

		switch(menuNum){ // byte, short, char, int �� ��� - -- String ��� 1.7version ����
			case 1:
				System.out.println("���ϱ�>"+ (a+b)); 
				break;
			case 2:
				System.out.println("����>" + (a-b)); 
				break;
			case 3:
				System.out.println("���ϱ�>" + (a*b)); 
				break;
			case 4:
				System.out.println("������>" + (a/b)); 
				break;
			case 9:
				run = false; // �ݺ����� ����������.
				break;
			default: System.out.println("�޴��� 1,2,3,4,9 ���ڸ� �����մϴ�.");
		}
		System.out.println();

	} //while�� ��

	System.out.println("���α׷� ����");

  }//����

}// Ŭ���� ��