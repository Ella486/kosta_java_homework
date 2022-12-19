/**
 
*/

import java.util.Scanner;

class EncapsulationExam{
	private  int weight = 62;
	private String password = "1234";
	//������ �˻�
	private void getWeight(String password){//2222
		if(isRightPassword(password)){//��ġ�Ѵٸ�   //this.isRightPassword(password) --- > this. �� �����Ǿ�����
			System.out.println("���� ������ : " + this.weight + "kg");
		}else{
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
		}
	}

	//������ ����
	private void setWeight(int weight, String password){
		if(this.isRightPassword(password)){
			this.weight = weight;
			System.out.println("�����԰� ����Ǿ����ϴ�");
		}else{
			System.out.println("��й�ȣ�� ��ġ���� �ʾ� ������ �����Ҽ� �����ϴ�.");
		}
	}
	//��й�ȣ ����
	private void setPassword(String password, String newPassword){
		if(this.isRightPassword(password)){
			this.password = newPassword; //����� ���ο� ���� �����Ѵ�.
			System.out.println("��й�ȣ�� ����Ǿ����ϴ�");
		}else{
			System.out.println("��й�ȣ�� ��ġ���� �ʾ� ��� ���� �Ҽ� �����ϴ�.");
		}
	}

   /**
      ��й�ȣ üũ
	    ���ϰ��� true�̸� ��ġ, false�̸� ����ġ
   */
	private boolean isRightPassword(String password){//2222
		
 
         /*if(this.password.equals(password)){
             return true;
		 }else{
            return false;
		 }*/


		return this.password.equals(password);//equals�� ���ϰ��� boolean���̴�.
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in); 
		EncapsulationExam cap = new EncapsulationExam(); //��ü�� �����Ǵ� ������ �����ʵ尡 �ʱ�ȭ�ȴ�, ������ʱ�ȭ�ȴ�.

		String password=null;// ���������� �ʱ�ȭ�� ���ش�.

		while(true){
			System.out.println("1. ������ �˻�  2. ������ ����  3. ��й�ȣ ����  4. ����");
			switch(sc.nextInt()){
				case 1://�����԰˻�
					System.out.print("��й�ȣ �Է�> ");
					password = sc.next();
					cap.getWeight(password);
					break;
				case 2://������ ����
					System.out.print("��й�ȣ �Է�> ");
					password = sc.next();
					System.out.print("������ �Է�> ");
					int weight = sc.nextInt();
					cap.setWeight(weight, password);
					break; //switch�� ����������.

				case 3: // ��й�ȣ ����
					System.out.print("���� ��й�ȣ �Է�> ");
					password = sc.next();
					System.out.print("������ ��й�ȣ �Է�> ");
					String newPassword = sc.next();
					cap.setPassword(password, newPassword);
					break;

				case 4: // ��й�ȣ üũ
					System.out.println("�ý����� �����մϴ�");
					System.exit(1); //���α׷� ����
					
				default:
					System.out.println("�޴��� 1 ~ 4 ���̸� �Է����ּ���.");

			}
			System.out.println();
		} 
		
	}
}