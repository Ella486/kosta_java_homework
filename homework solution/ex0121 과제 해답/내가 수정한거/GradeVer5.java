/**
  �����̸�: �̸���
  ��¥: 22.1.20
  ���� : �������α׷�Ver5 
*/
import java.util.Scanner;

class GradeVer5_01 {

	/**1)����, ����, ���� ������ �μ��޾� ������ ���Ͽ�
      ������ �����ϴ� �޼ҵ� �ۼ�
      (���������� private)*/

	private int gradeVer4_01(int kor, int eng, int math){//80, 90, 100
		
		int sum = kor + eng + math;
		
		System.out.println("������ ����: " + sum);

		return sum;

	}

	/**2) ������ �����(int) �� �μ��ι޾� ����� ���Ͽ�
      ����� �����ϴ� �޼ҵ� �ۼ� 
      (���������� private)*/

	private double gradeVer4_02(int sum, int i){//i�� �����
		// ����� ���ؼ� �Ҽ����ڸ� 2�ڸ�����......

		double result  = sum / (double)i ;
		result = (int)(result*100)/100.0;

		System.out.println("���: " + result);

		return result;                                      

	}

	/**3) ����� �μ��� �޾� ����� ���Ͽ� ����� �������ִ�
       �޼ҵ� �ۼ��Ѵ�(���������� private)*/

	private char gradeVer4_03(double avg){

		char grade;

                if (avg >= 90) grade = 'A';
                else if (avg >= 80) grade = 'B';
                else if (avg >= 70) grade = 'C';
                else if (avg >= 60) grade = 'D';
                else grade = 'F';

		System.out.println("���: " + grade);

		return grade;


	}
	
	/*4) �̸�, ����, ����, ���� ������ �μ��� �޾�
      ���� , ��� ,��� �� ���Ͽ� �� ����� ȭ�鿡 ����ϴ�
      �޼ҵ带 �����ϼ���.
      (���������� public,
       ������ ��� , ����� �̹� ������� 1) , 2) ,3) �޼ҵ带 ȣ��
       �Ͽ� �� ����� ���� ���´�)*/
	//����ǥ�� ����ϴ� �޼ҵ�
	public void printGradeVer5_01(String name, int kor, int eng, int math) {

		int sum = this.gradeVer4_01(kor,eng,math);
		System.out.println("����: " + sum);

		double avg = this.gradeVer4_02(sum, 3);
		System.out.println("���: " + avg);

		char grade = this.gradeVer4_03(avg);
		System.out.println("���: " + grade);

	}
}
//////////////////////////////////////////////////////////////
class GradeVer5 {
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

