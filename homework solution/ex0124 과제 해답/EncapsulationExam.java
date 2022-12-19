/**
 
*/

import java.util.Scanner;

class EncapsulationExam{
	private  int weight = 62;
	private String password = "1234";
	//몸무게 검색
	private void getWeight(String password){//2222
		if(isRightPassword(password)){//일치한다면   //this.isRightPassword(password) --- > this. 이 생략되어있음
			System.out.println("현재 몸무게 : " + this.weight + "kg");
		}else{
			System.out.println("비밀번호가 일치하지 않습니다");
		}
	}

	//몸무게 변경
	private void setWeight(int weight, String password){
		if(this.isRightPassword(password)){
			this.weight = weight;
			System.out.println("몸무게가 변경되었습니다");
		}else{
			System.out.println("비밀번호가 일치하지 않아 몸무게 변경할수 없습니다.");
		}
	}
	//비밀번호 변경
	private void setPassword(String password, String newPassword){
		if(this.isRightPassword(password)){
			this.password = newPassword; //비번을 새로운 것을 변경한다.
			System.out.println("비밀번호가 변경되었습니다");
		}else{
			System.out.println("비밀번호가 일치하지 않아 비번 변경 할수 없습니다.");
		}
	}

   /**
      비밀번호 체크
	    리턴값이 true이면 일치, false이면 불일치
   */
	private boolean isRightPassword(String password){//2222
		
 
         /*if(this.password.equals(password)){
             return true;
		 }else{
            return false;
		 }*/


		return this.password.equals(password);//equals는 리턴값이 boolean형이다.
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in); 
		EncapsulationExam cap = new EncapsulationExam(); //객체가 생성되는 시점에 전역필드가 초기화된다, 명시적초기화된다.

		String password=null;// 지역변수는 초기화를 해준다.

		while(true){
			System.out.println("1. 몸무게 검색  2. 몸무게 변경  3. 비밀번호 변경  4. 종료");
			switch(sc.nextInt()){
				case 1://몸무게검색
					System.out.print("비밀번호 입력> ");
					password = sc.next();
					cap.getWeight(password);
					break;
				case 2://몸무게 변경
					System.out.print("비밀번호 입력> ");
					password = sc.next();
					System.out.print("몸무게 입력> ");
					int weight = sc.nextInt();
					cap.setWeight(weight, password);
					break; //switch문 빠져나가라.

				case 3: // 비밀번호 변경
					System.out.print("기존 비밀번호 입력> ");
					password = sc.next();
					System.out.print("변경할 비밀번호 입력> ");
					String newPassword = sc.next();
					cap.setPassword(password, newPassword);
					break;

				case 4: // 비밀번호 체크
					System.out.println("시스템을 종료합니다");
					System.exit(1); //프로그램 종료
					
				default:
					System.out.println("메뉴는 1 ~ 4 사이만 입력해주세요.");

			}
			System.out.println();
		} 
		
	}
}