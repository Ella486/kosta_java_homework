/**
  �����̸�: �̸���
  ��¥: 22.1.20
  ���� : p.134 7������ �ڵ� - while���� Scanner�� �̿��ؼ� ����, ���, ��ȸ, ���� ����� �������� �����
*/
import java.util.Scanner;

class Exercise07 {

	public static void main(String[] args) {
		boolean run = true; // ���º���(true�̸� �ݺ����� ����, false�� �Ǹ� �ݺ����� ��������)

		int balance = 0; // �ܾ�(�ܰ�)

		Scanner sc = new Scanner(System.in); // Ű�����Է¹ޱ⸦ ���� �غ�!

		while(run) { // run�� true�� ���� �ݺ��ض�.
		System.out.println("---------------------------------");
		System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
		System.out.println("---------------------------------");
		System.out.print("����> ");

		int menuNum = sc.nextInt();

		switch(menuNum){ // byte, short, char, int �� ��� - -- String ��� 1.7version ����
			case 1:
				System.out.print("���ݾ�>"); // ������ �ݾ��� �Է¹޾� balance�� �����Ѵ�.
				balance += sc.nextInt();
				break;
			case 2:
				System.out.print("��ݾ�>"); // ����� �ݾ��� �Է¹޾� balance�� �����Ѵ�.
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.print("�ܰ�>"); // �ܾ��� ����Ѵ�.
				System.out.println(balance);
				break;
			case 4:
				run = false; // �ݺ����� ����������.
				break;
			default: System.out.println("�޴��� 1 ~ 4 ���ڸ� �����մϴ�.");
		}
		System.out.println();

	} //while�� ��

	System.out.println("���α׷� ����");

  }//����

}// Ŭ���� ��