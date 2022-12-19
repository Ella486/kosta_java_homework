class ForExam01{
	public static void main(String [] args){
		// 1. 1~100 까지 한줄로 출력하기

		int i;
		System.out.println( "1. 1~100 까지 한줄로 출력하기===========================");
		for( i=1 ; i<=100 ; i++ ){  //i=1, 2, 3,......,101이 되면 반복을 그만한다.
			System.out.print( i + "\t");

		}
    

		// 2.  1~100까지 출력하되 5의 배수만 출력하기
		System.out.println( "\n\n2.  1~100까지 출력하되 5의 배수만 출력하기===================" );
		for( i=1 ; i<=20 ; i++ ){ // i=i+5 ----> i+=5
			if(i%5==0)
				System.out.print( i + "\t");

		}


		// 3. 1~100까지의 합을 출력하기
		System.out.println( "\n\n3. 1~100까지의 합을 출력하기===================" );
		
		int sum = 0;
        for( i = 1 ; i <= 100 ; i++ ){
			sum += i;
		}

			System.out.print("총합:" + sum);


		// 4. A~Z까지 출력
        System.out.println( "\n\n4. A~Z까지 출력===================" );
		for( i = 1; i <= 26; i++ ){
			System.out.print((char)('A'+ i) + "\t");
		}

        System.out.println( "\n\n4. A~Z까지 출력===================" );
		for( i = 65; i <= 90; i++ ){
			System.out.print((char)(i) + "\t");
		}

		System.out.println( "\n\n4. A~Z까지 출력===================" );
		for( char ch='A'; ch <= 'Z' ; ch++){
			System.out.print(ch + "\t");
		}

		// 5. 1~100까지의 3의 배수의 합을 출력하기
        System.out.println( "\n\n5. 1~100까지의 3의 배수의 합을 출력하기===================" );

		sum = 0;
		for (i= 1; i<=100 ; i++){
			if(i%3 == 0){
				sum = sum + i;
				}    
			}
			System.out.print("3의 배수의 합 :" + sum);
			
		// 6. 1~100 출력을 10행 10열로 출력하기 ( for문에 조건문 사용하기, 이중for문 사용 안됨)
		System.out.println( "\n\n6. 1~100 출력을 10행 10열로 출력하기===================" );

		for (i=1; i<=100; i++){ //i= 1,2,3,4,........101되면 반복을 그만한다.
			if (i%10 == 0){
				System.out.println(i+" ");
				
			}else{
				System.out.print(i+" ");
			}
		}
			// 7. 100~1까지 거꾸로 출력하기 (100 99 98,....,1)
		System.out.println( "7. 100~1까지 거꾸로 출력하기 (100 99 98,....,1)===================" );
		for (i=100; i>0; i--){
			System.out.print(i + "\t");
		}
	}
		
	
	
}// 클래스 끝
