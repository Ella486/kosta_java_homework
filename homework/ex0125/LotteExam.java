/**
  �����̸�: �̸���
  ��¥: 22.1.25
  ���� : �ζ����α׷�
*/

class LotteExam {
	
	public static void main(String[] args) {

		int[] lotto = new int [6]; // 6���� ������ ����
	

		for (int i=0; i<lotto.length ;i++ ){

			lotto[i] = (int)(Math.random()*45)+1;

			System.out.print(lotto[i] + "\t");
		}

		/**for (int i=0 ; i<lotto.length ; i++){
			System.out.print(lotto[i] + "\t");
		}*/
	
	}

	//�ߺ�üũ�ϴ� �޼ҵ�
	/**public void isCheckLottoNumber(){
		
		boolean num = false;

			for (int j=0 ; j<i ;j++ ){
				if (lotto[i] == lotto[j]){
				
					num = true;
					System.out.println("�ߺ���" + lotto[i]);

				}

			}

			if (num == true){
			
				i--;
				continue;

			}*/

	

	}

	

}//Ŭ���� ��
