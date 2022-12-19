/**
  본인이름: 이명진
  날짜: 22.1.20
  주제 : p.134 4번문제 코딩 - while문과 Math.random()메소드 이용하기
*/


class Exercise04{

	public static void main(String[] args){

	System.out.println("-----주사위 눈의 합----------" );

		while(true) {
			int i= (int)(Math.random()*6) + 1; // 주사위 1 ~ 6
			int j= (int)(Math.random()*6) + 1; // 주사위 1 ~ 6
			System.out.println("(" + i + "," + j + ")" );
			if((i+j) ==5){
				break;
			}

		}
	}
}
