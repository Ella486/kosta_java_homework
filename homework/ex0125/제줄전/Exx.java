class  Exx{

	public static void main(String[] args) {

		int[] lotto = new int [6]; // 6���� ������ ����

		for (int i=0; i<lotto.length ;i++ ){

			lotto[i] = (int)(Math.random()*45)+1;//0~44 �ζ� ����, +1 : 45������ �ζǼ��� 

			//�ߺ�üũ
			boolean isDuplicated = false;

			for (int j=0 ; j<i ;j++ ){
				if (lotto[i] == lotto[j]){
					//�ߺ��� => ������
					isDuplicated = true;
					System.out.println("�ߺ���" + lotto[i]);

				}

			}

			if (isDuplicated == true){
				//������
				i--;
				continue;//  �ߺ��� ���� �����ϰ�, ���ǽ� ���� �ٽ� �ϰ�, �� ��¹� �������� ��������.

			}

		}
		//���
		for (int i=0 ; i<lotto.length ; i++){
			System.out.print(" " + lotto[i]);
		}
		
	
	}//main
}//class
