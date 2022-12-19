/**
  본인이름: 이명진
  날짜: 22.1.24
  주제 : 몸무게프로그램
*/

import java.util.Scanner;

class EncapsulationExam_01{

		public static int w = 52; //몸무게
		public static String pwd = "1234";//비밀번호

	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);

		while(true) { 
			
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.몸무게 검색 | 2.몸무게 변경 | 3. 비밀번호 변경 | 4. 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택> ");
			
			int menuNum = sc.nextInt();

			switch(menuNum){ // byte, short, char, int 만 허용 - -- String 허용 1.7version 가능

			case 1:
				System.out.println("비밀번호를 입력하세요");
				String input_pwd;
				input_pwd = sc.next();
				getSearchWeight(input_pwd);
				break;

			case 2:
				System.out.println("비밀번호를 입력하세요"); 
				
				int input_weight;
				input_pwd = sc.next();


				if(input_pwd.equals(pwd)){

					//w = input_weight;
					System.out.println("변경할 몸무게를 입력하세요"); 
					input_weight = sc.nextInt();
					setChangeWeight(input_weight);
					System.out.println("변경한 몸무게는 "+ w+"입니다.");

				}else{

					isCheckPwd(input_pwd);

				}
				break;

			case 3:

				System.out.println("기존 비밀번호를 입력하세요");
				input_pwd = sc.next();

				if(input_pwd.equals(pwd)){

					System.out.println("변경할 비밀번호를 입력하세요"); 
					input_pwd = sc.next();
					getChangePwd(input_pwd);

				}else{

					System.out.println("비밀번호가 불일치 합니다.");

				}

				break;

			case 4:
				System.out.println("종료합니다"); 
				System.exit(0);
				break;
			
			default: System.out.println("메뉴는 1,2,3,4 숫자만 가능합니다.");
		}
		
		



		}//while


	} //main 끝.

			static boolean getChangePwd(String input_pwd){
				pwd = input_pwd;
				System.out.println("비밀번호가 "+ pwd + "로 번경 되었습니다.");
				return false;
			}


			static boolean isCheckPwd(String input_pwd){
				if(input_pwd.equals(pwd)){
					return true;

				}else{

					System.out.println("비밀번호가 불일치 합니다.");
					return false;

				}
			}


			static boolean getSearchWeight(String input_pwd) {

			//System.out.println("입력값 :" + input_pwd +"/" + pwd);

			//boolean result = true;

				if(input_pwd.equals(pwd)){ 
					System.out.println("몸무게는 "+ w);
					return true;

				}else{
					System.out.println("비밀번호가 불일치합니다.");
					return false;
				}

			} 

		static boolean setChangeWeight(int input_weight) {

			//System.out.println("입력값 :" + input_pwd +"/" + pwd);

			 w = input_weight;
			return false;
		} 

}// Class 끝.
