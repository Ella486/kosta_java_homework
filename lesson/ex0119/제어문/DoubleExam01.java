class DoubleExam01{
	public static void main(String [] args){
		// 1. 1~100�� ����ϴµ� 10�� 10���� ����ϱ� ( for���ȿ� for�� �̿��ϱ�)
		/*
			1 2 3 ....10
			11 12 13 ....20
			21.......     30
			...

			91 .....      100
			*/
			for(int i=0; i<10; i++){
				//System.out.print(i);
				for(int j=1; j<11; j++){
					System.out.print((i*10)+j+"\t");
				}
				System.out.println();
			}

		// 2. ����������ϱ�
		   /*
		       2*1=2   3*1=3  4*1=4  ...... 9*1=9
			   2*2=4   3*2=6  4*2=8  ...... 9*2=9
			   2*3=6   3*3=6  4*3=12 ...... 9*3=27

			   ...

			   2*9=18  3*9=27 4*9=36 ...... 9*9= 81

			   */
		System.out.println("==2.������ ����ϱ�===================");
		
		for (int i = 1; i<10 ; i++ ){
			for(int j = 2; j<10; j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}

	}//main ��

}// Ŭ���� ��