
import java.util.Scanner;

/**
 �̸�: ��º�
 ��¥: 22.01.20
 ����: ����ǥ V3
 �̸�, ����, ����, ���� ������ Ű���� �Է��� �޾� ����ǥ�� ���
 */
public class GradeCardV3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�̸��� �Է��ϼ���.> ");
        String name = sc.nextLine();

        System.out.print("�������� .ex)45~100> ");
        int korean = sc.nextInt();

		 System.out.print("�������� .ex)45~100> ");
        int	english = sc.nextInt();

		 System.out.print("�������� .ex)45~100> ");
        int math = sc.nextInt();


        int totalGrade = korean + english + math;
        double average = (int) ((totalGrade / 3.0) * 100) / 100.0;

        char grades;
        if (average >= 90) grades = 'A';
        else if (average >= 80) grades = 'B';
        else if (average >= 70) grades = 'C';
        else if (average >= 60) grades = 'D';
        else grades = 'F';

        System.out.println("--------------------------");
        System.out.println("��    ��: " + name);
        System.out.println("��������: " + korean);
        System.out.println("��������: " + english);
        System.out.println("��������: " + math);
        System.out.println("��    ��: " + totalGrade);
        System.out.println("��    ��: " + average); // �Ҽ�2
        System.out.println("��    ��: " + grades);
        System.out.println("--------------------------");

        sc.close();
    }

}
