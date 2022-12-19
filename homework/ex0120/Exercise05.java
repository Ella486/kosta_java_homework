/**
  본인이름: 이명진
  날짜: 22.1.20
  주제 : p.134 5번문제 코딩 - 중첩for문 이용하기 방정식 4x+5y=60의 모든 해를 구해서 (x,y) 형태로 출력하기 (단, x와 y는 10이하의 자연수)
*/

class Exercise05 {

	public static void main(String[] args) {

		System.out.println("----------방정식 4x+5y=60의 모든 해를 구해기-------------");

		for(int x = 1; x<=10; x++){
			for(int y = 1; y<=10; y++){
				if((4*x + 5*y) == 60){
					System.out.println("(" + x + "," + y + ")");

				}
			}
		}

	
	}
}
