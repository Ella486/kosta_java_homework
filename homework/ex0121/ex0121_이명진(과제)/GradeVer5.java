/**
  �����̸�: �̸���
  ��¥: 22.1.20
  ���� : �������α׷�Ver5 
*/


class GradeVer5 {

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

		double avg = (int) ((sum / 3.0) * 100) / 100.0;   // double result  = sum / (double)i ;
														  //  result = (int)(result*100)/100.0;

		System.out.println("���: " + avg);

		return avg;                                       // return result;

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

	public static void main(String[] args) {

		GradeVer5 ue = new GradeVer5();
		System.out.println("ue: " + ue);

		int sum = ue.gradeVer4_01(80,90,100);
		System.out.println("����: " + sum);

		double avg = ue.gradeVer4_02(270,3);
		System.out.println("���: " + avg);

		char grade = ue.gradeVer4_03(90);
		System.out.println("���: " + grade);

	}

}




