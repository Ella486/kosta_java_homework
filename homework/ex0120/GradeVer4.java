2/**
  �����̸�: �̸���
  ��¥: 22.1.20
  ���� : �������α׷�Ver4 
*/
import java.util.Scanner;

class GradeVer4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		do {
            System.out.println("================");
            System.out.println("1.����ǥ | 2.����");
            System.out.println("================");
            System.out.print("> ");

            int command = Integer.parseInt(sc.nextLine()); //String�� int������ ��ȯ
            if (command == 1) {
                System.out.print("�̸��� �Է��ϼ���.> ");
                String name = sc.nextLine();

                System.out.print("����,����,���� ������ �� ĭ���� �����Ͽ� �Է��ϼ���.ex)55 60 70> ");
                int kor = sc.nextInt();
                int	eng = sc.nextInt();
                int math = sc.nextInt();
                sc.nextLine();

                int total = kor + eng + math;
                double avg = (int) ((total / 3.0) * 100) / 100.0;

                char grade;
                if (avg >= 90) grade = 'A';
                else if (avg >= 80) grade = 'B';
                else if (avg >= 70) grade = 'C';
                else if (avg >= 60) grade = 'D';
                else grade = 'F';

                System.out.println("=== " + name + " ���� ����ǥ ===");
                System.out.println("��������: " + kor);
                System.out.println("��������: " + eng);
                System.out.println("��������: " + math);
                System.out.println("��   ��: " + total);
                System.out.println("��   ��: " + avg);
                System.out.println("��   ��: " + grade);
            } else if (command == 2) {
                break; //�ݺ����������´�
            } else {
                System.out.println("����� �Է��ϼ���.");
            }
        } while (true);

        
		System.out.println("�ȳ��� ������.");
	}
}
