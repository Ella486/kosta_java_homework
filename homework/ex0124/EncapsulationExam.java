/**
  �����̸�: �̸���
  ��¥: 22.1.24
  ���� : ���������α׷�
*/

import java.util.Scanner;

class EncapsulationExam{

		public static int w = 52; //������  //
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
				String inputPwd;
				inputPwd = sc.next();
				getSearchWeight(inputPwd);
				break;

			case 2:
				System.out.println("��й�ȣ�� �Է��ϼ���"); 
				
				int inputWeight;
				inputPwd = sc.next();


				if(inputPwd.equals(pwd)){

					//w = input_weight;
					System.out.println("������ �����Ը� �Է��ϼ���"); 
					inputWeight = sc.nextInt();
					setChangeWeight(inputWeight);
					System.out.println("������ �����Դ� "+ w+"�Դϴ�.");

				}else{

					isCheckPwd(inputPwd);

				}
				break;

			case 3:

				System.out.println("���� ��й�ȣ�� �Է��ϼ���");
				inputPwd = sc.next();

				if(inputPwd.equals(pwd)){

					System.out.println("������ ��й�ȣ�� �Է��ϼ���"); 
					inputPwd = sc.next();
					setChangePwd(inputPwd);

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
			//��й�ȣ ����
			static boolean setChangePwd(String inputPwd){
				pwd = inputPwd;
				System.out.println("��й�ȣ�� "+ pwd + "�� ���� �Ǿ����ϴ�.");
				return false;
			}

			//��й�ȣ üũ
			static boolean isCheckPwd(String inputPwd){
				if(inputPwd.equals(pwd)){
					return true;

				}else{

					System.out.println("��й�ȣ�� ����ġ �մϴ�.");
					return false;

				}
			}

			//������ �˻�
			static boolean getSearchWeight(String inputPwd) {

			//System.out.println("�Է°� :" + inputPwd +"/" + pwd);

			//boolean result = true;

				if(inputPwd.equals(pwd)){ 
					System.out.println("�����Դ� "+ w);
					return true;

				}else{
					System.out.println("��й�ȣ�� ����ġ�մϴ�.");
					return false;
				}

			} 
		//������ ����
		static boolean setChangeWeight(int inputWeight) {

			//System.out.println("�Է°� :" + inputPwd +"/" + pwd);

			 w = inputWeight;
			return false;
		} 

}// Class ��.
