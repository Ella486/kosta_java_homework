/**
  �����̸�: �̸���
  ��¥: 22.1.24
  ���� : ���������α׷�
*/

import java.util.Scanner;

class EncapsulationExam_01{

		public static int w = 52; //������
		public static String pwd = "1234";//��й�ȣ

	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);

		while(true) { 
			
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.������ �˻� | 2.������ ���� | 3. ��й�ȣ ���� | 4. ����");
			System.out.println("-----------------------------------------------------------");
			System.out.print("����> ");
			
			int menuNum = sc.nextInt();

			switch(menuNum){ // byte, short, char, int �� ��� - -- String ��� 1.7version ����

			case 1:
				System.out.println("��й�ȣ�� �Է��ϼ���");
				String input_pwd;
				input_pwd = sc.next();
				getSearchWeight(input_pwd);
				break;

			case 2:
				System.out.println("��й�ȣ�� �Է��ϼ���"); 
				
				int input_weight;
				input_pwd = sc.next();


				if(input_pwd.equals(pwd)){

					//w = input_weight;
					System.out.println("������ �����Ը� �Է��ϼ���"); 
					input_weight = sc.nextInt();
					setChangeWeight(input_weight);
					System.out.println("������ �����Դ� "+ w+"�Դϴ�.");

				}else{

					isCheckPwd(input_pwd);

				}
				break;

			case 3:

				System.out.println("���� ��й�ȣ�� �Է��ϼ���");
				input_pwd = sc.next();

				if(input_pwd.equals(pwd)){

					System.out.println("������ ��й�ȣ�� �Է��ϼ���"); 
					input_pwd = sc.next();
					getChangePwd(input_pwd);

				}else{

					System.out.println("��й�ȣ�� ����ġ �մϴ�.");

				}

				break;

			case 4:
				System.out.println("�����մϴ�"); 
				System.exit(0);
				break;
			
			default: System.out.println("�޴��� 1,2,3,4 ���ڸ� �����մϴ�.");
		}
		
		



		}//while


	} //main ��.

			static boolean getChangePwd(String input_pwd){
				pwd = input_pwd;
				System.out.println("��й�ȣ�� "+ pwd + "�� ���� �Ǿ����ϴ�.");
				return false;
			}


			static boolean isCheckPwd(String input_pwd){
				if(input_pwd.equals(pwd)){
					return true;

				}else{

					System.out.println("��й�ȣ�� ����ġ �մϴ�.");
					return false;

				}
			}


			static boolean getSearchWeight(String input_pwd) {

			//System.out.println("�Է°� :" + input_pwd +"/" + pwd);

			//boolean result = true;

				if(input_pwd.equals(pwd)){ 
					System.out.println("�����Դ� "+ w);
					return true;

				}else{
					System.out.println("��й�ȣ�� ����ġ�մϴ�.");
					return false;
				}

			} 

		static boolean setChangeWeight(int input_weight) {

			//System.out.println("�Է°� :" + input_pwd +"/" + pwd);

			 w = input_weight;
			return false;
		} 

}// Class ��.
