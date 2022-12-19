/**
  본인이름: 이명진
  날짜: 22.1.20
  주제 : p.134 6번문제 코딩 - for문 이용해서 삼각형 모양 출력하기
*/

class Exercise06 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
