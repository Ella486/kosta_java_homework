class ForExam01{
	public static void main(String [] args){
		// 1. 1~100 ���� ���ٷ� ����ϱ�
		System.out.println( "1. 1~100 ���� ���ٷ� ����ϱ�===========================");
		for( int i=1 ; i<=100 ; i++ ){  //i=1, 2, 3,......,101�� �Ǹ� �ݺ��� �׸��Ѵ�.
			System.out.print( i + "\t");

		}
    

		// 2.  1~100���� ����ϵ� 5�� ����� ����ϱ�
		System.out.println( "\n\n2.  1~100���� ����ϵ� 5�� ����� ����ϱ�===================" );
		for( int i=1 ; i<=20 ; i++ ){
			System.out.print( (5*i) + "\t");

		}


		// 3. 1~100������ ���� ����ϱ�
		System.out.println( "\n\n3. 1~100������ ���� ����ϱ�===================" );
		
		int sum = 0;
		for( int i = 1 ; i <= 100 ; i++ ){
			sum += i;
		}

			System.out.print(sum);


		// 4. A~Z���� ���
		System.out.println( "\n\n4. A~Z���� ���===================" );
		for( char i = 'A'; i <= 'Z'; i++ ){
			System.out.print(i + "\t");
		}


		// 5. 1~100������ 3�� ����� ���� ����ϱ�
		System.out.println( "\n\n5. 1~100������ 3�� ����� ���� ����ϱ�===================" );

		//sum = 0;
		for (int i= 1; i<=100 ; i++){
			if(i%3 == 0){
				sum = sum + i;
			}    
		}
			System.out.print(sum);
			
		// 6. 1~100 ����� 10�� 10���� ����ϱ� ( for���� ���ǹ� ����ϱ�, ����for�� ��� �ȵ�)
		System.out.println( "\n\n6. 1~100 ����� 10�� 10���� ����ϱ�===================" );

		for (int i=1; i<=100; i++){
			if (i%10 == 0){
				System.out.println(i+" ");
				
			}else{
				System.out.print(i+" ");
			}
		}
			// 7. 100~1���� �Ųٷ� ����ϱ� (100 99 98,....,1)
		System.out.println( "7. 100~1���� �Ųٷ� ����ϱ� (100 99 98,....,1)===================" );

		for (int i=100; i>0; i--){
			System.out.print(i + "\t");
		}
	}
		
	
	
}// Ŭ���� ��
