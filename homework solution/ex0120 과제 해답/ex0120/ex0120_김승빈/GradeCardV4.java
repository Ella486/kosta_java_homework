

import java.util.Scanner;

/**
 �̸�: ��º�
 ��¥: 22.01.20
 ����: ����ǥ V4
 1. ����ǥ 2. ���� �޴����
 1�� �Է��ϸ� �̸�, ����, ����, ���� ������ Ű���� �Է��� �޾� ����ǥ�� ��� -> �ٽ� �޴��� ���
 2�� �Է��ϸ� ���α׷� ����
 */
public class GradeCardV4 {

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
                int korean = sc.nextInt();
                int	english = sc.nextInt();
                int math = sc.nextInt();
                sc.nextLine();

                int totalGrade = korean + english + math;
                double average = (int) ((totalGrade / 3.0) * 100) / 100.0;

                char grades;
                if (average >= 90) grades = 'A';
                else if (average >= 80) grades = 'B';
                else if (average >= 70) grades = 'C';
                else if (average >= 60) grades = 'D';
                else grades = 'F';

                System.out.println("=== " + name + " ���� ����ǥ ===");
                System.out.println("��������: " + korean);
                System.out.println("��������: " + english);
                System.out.println("��������: " + math);
                System.out.println("��   ��: " + totalGrade);
                System.out.println("��   ��: " + average);
                System.out.println("��   ��: " + grades);
            } else if (command == 2) {
                break; //�ݺ����������´�
            } else {
                System.out.println("����� �Է��ϼ���.");
            }
        } while (true);

        sc.close();
        System.out.println("�ȳ��� ������.");
    }

}
