/**
  본인이름: 이명진
  날짜: 22.1.25
  주제 : 로또프로그램
*/

class LotteExam {
	
	public static void main(String[] args) {

		int[] lotto = new int [6]; // 6개의 데이터 공간
	

		for (int i=0; i<lotto.length ;i++ ){

			lotto[i] = (int)(Math.random()*45)+1;

			System.out.print(lotto[i] + "\t");
		}

		/**for (int i=0 ; i<lotto.length ; i++){
			System.out.print(lotto[i] + "\t");
		}*/
	
	}

	//중복체크하는 메소드
	/**public void isCheckLottoNumber(){
		
		boolean num = false;

			for (int j=0 ; j<i ;j++ ){
				if (lotto[i] == lotto[j]){
				
					num = true;
					System.out.println("중복됨" + lotto[i]);

				}

			}

			if (num == true){
			
				i--;
				continue;

			}*/

	

	}

	

}//클래스 끝
