/**
  �����̸�: �̸���
  ��¥: 22.1.20
  ���� : �������α׷�Ver4 - �̸�,����,����,���� ������ Ű���� �Է��� �޾Ƽ� ����ǥ�� ����Ѵ�.
*/
import java.util.Scanner; 

class GradeVer04{
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);

		String name;
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		char grade;
		boolean run = true;

		while(run){
			System.out.println("------------�޴�------------");
            System.out.println("   1. ����ǥ     2. ����     ");
            System.out.println("---------------------------");
            System.out.print("�޴� ���� >  ");
            int menuNum = Integer.parseInt(sc.nextLine());
            if(menuNum==1){
				System.out.print("�̸���:");
				name = sc.nextLine();

				System.out.print("��������:");
				kor =Integer.parseInt( sc.nextLine() ); // ���ڿ� ---> ���ڷκ���

				System.out.print("��������:");
				eng =Integer.parseInt( sc.nextLine() );

				System.out.print("��������:");
				math =Integer.parseInt( sc.nextLine() );

				sum = kor + eng + math;
				avg = (int) ((sum / 3.0) * 100) / 100.0;// �Ҽ��� ��°�ڸ�����

	
				if (avg >= 90){
					grade = 'A';
				}else if (avg >= 80){
					grade = 'B';
				}else if (avg >= 70){
					grade = 'C';
				}else if (avg >= 60){
					grade = 'D';
				}else {
					grade = 'F';
				}

				System.out.println("------------����ǥ--------------");
				System.out.println("��    ��: " + name);
				System.out.println("��������: " + kor);
				System.out.println("��������: " + eng);
				System.out.println("��������: " + math);
				System.out.println("��    ��: " + sum);
				System.out.println("��    ��: " + avg); 
				System.out.println("��    ��: " + grade);
			
				System.out.println("------�޴��� ���ư��ϴ�-------");

			}else if(menuNum==2){
				run = false;
			}else {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}
		System.out.println("** ���α׷��� ����Ǿ����ϴ�. **");
	}
}