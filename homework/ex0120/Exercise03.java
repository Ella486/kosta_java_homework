/**
  본인이름: 이명진
  날짜: 22.1.20
  주제 : p.134 3번문제 코딩 - for문을 이용해서 1~100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하라.
*/


class Exercise03{

	public static void main(String[] args) {
		int sum=0;
		for (int a=1; a<=100; a++){
			if(a%3==0){
				sum += a;
			}
		}
		System.out.print("3의 배수의 합 :" + sum);

	}
}
