class  Exx{

	public static void main(String[] args) {

		int[] lotto = new int [6]; // 6개의 데이터 공간

		for (int i=0; i<lotto.length ;i++ ){

			lotto[i] = (int)(Math.random()*45)+1;//0~44 로또 숫자, +1 : 45번까지 로또숫자 

			//중복체크
			boolean isDuplicated = false;

			for (int j=0 ; j<i ;j++ ){
				if (lotto[i] == lotto[j]){
					//중복됨 => 재추점
					isDuplicated = true;
					System.out.println("중복됨" + lotto[i]);

				}

			}

			if (isDuplicated == true){
				//재추점
				i--;
				continue;//  중복된 수는 제외하고, 조건식 증감 다시 하고, 밑 출력문 공식으로 빠져나감.

			}

		}
		//출력
		for (int i=0 ; i<lotto.length ; i++){
			System.out.print(" " + lotto[i]);
		}
		
	
	}//main
}//class
