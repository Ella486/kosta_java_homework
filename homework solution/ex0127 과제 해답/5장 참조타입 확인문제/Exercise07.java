/**
  본인이름: 이명진
  날짜: 22.1.27
  주제 : 5장 참조타입 7번문제
*/

class Exercise07{

	public static void main(String[] args) {

		int max = 0;
		int[] array = {1,5,3,8,2};

		for (int i=0 ; i< array.length ; i++){
			if(max < array[i]){
				max = array[i];
			}

		}

		System.out.println("max: " + max);
	}
}
