/**
  본인이름: 이명진
  날짜: 22.1.24
  주제 : 몸무게프로그램
*/

import java.util.Scanner;

class EncapsulationExam{

		public static int w = 52; //몸무게  //
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
				String inputPwd;
				inputPwd = sc.next();
				getSearchWeight(inputPwd);
				break;

			case 2:
				System.out.println("비밀번호를 입력하세요"); 
				
				int inputWeight;
				inputPwd = sc.next();


				if(inputPwd.equals(pwd)){

					//w = input_weight;
					System.out.println("변경할 몸무게를 입력하세요"); 
					inputWeight = sc.nextInt();
					setChangeWeight(inputWeight);
					System.out.println("변경한 몸무게는 "+ w+"입니다.");

				}else{

					isCheckPwd(inputPwd);

				}
				break;

			case 3:

				System.out.println("기존 비밀번호를 입력하세요");
				inputPwd = sc.next();

				if(inputPwd.equals(pwd)){

					System.out.println("변경할 비밀번호를 입력하세요"); 
					inputPwd = sc.next();
					setChangePwd(inputPwd);

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
			//비밀번호 변경
			static boolean setChangePwd(String inputPwd){
				pwd = inputPwd;
				System.out.println("비밀번호가 "+ pwd + "로 번경 되었습니다.");
				return false;
			}

			//비밀번호 체크
			static boolean isCheckPwd(String inputPwd){
				if(inputPwd.equals(pwd)){
					return true;

				}else{

					System.out.println("비밀번호가 불일치 합니다.");
					return false;

				}
			}

			//몸무게 검색
			static boolean getSearchWeight(String inputPwd) {

			//System.out.println("입력값 :" + inputPwd +"/" + pwd);

			//boolean result = true;

				if(inputPwd.equals(pwd)){ 
					System.out.println("몸무게는 "+ w);
					return true;

				}else{
					System.out.println("비밀번호가 불일치합니다.");
					return false;
				}

			} 
		//몸무게 변경
		static boolean setChangeWeight(int inputWeight) {

			//System.out.println("입력값 :" + inputPwd +"/" + pwd);

			 w = inputWeight;
			return false;
		} 

}// Class 끝.
