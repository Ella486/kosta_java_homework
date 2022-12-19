/**
  본인이름: 이명진
  날짜: 22.1.27
  주제 : 5장 참조타입 8번문제
*/

class Exercise08 {

	public static void main(String[] args) {
		int [][] array = {
			
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}

		};

		int sum = 0;
		double avg = 0.0;

		int count = 0;

		for (int i =0;i< array.length ; i++ ){
			for (int j=0 ; j<array[i].length; j++){
				
				sum += array[i][j]; //총점
				count++; //과목수 체크 ( count += 1 와 count++ 은 같은 말)
		
			}
		}
		avg = (double) sum/count;

		System.out.println("sum : " + sum); //881
		System.out.println("avg: " + avg ); //88.1
	}
}
