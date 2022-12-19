class WhileExam01{
	public static void main(String [] args){
    //1. 1 ~ 100까지 한줄로 출력하기
		System.out.println("//1. 1 ~ 100까지 한줄로 출력하기");
		int a = 1;
		while (a <=100){
			System.out.print(a +"\t");
				 a++;
		}


	//2. 1 ~100까지 출력하되 5의 배수만 출력하기
		System.out.println("\n\n2. 1 ~100까지 출력하되 5의 배수만 출력하기");
		int b = 1;
		while (b <=100){
             if(b%5==0) System.out.print( b + "\t"); 

			   b++;
	     }


	//3. 1 ~100까지의 합을 출력하기 
		System.out.println("\n\n3. 1 ~100까지의 합을 출력하기 ");

		int sum = 0;
		int c = 1;
		while( c<=100 ) { 
		   sum += c; //sum = sum +c;
		   c++;
		}
		System.out.print( "총합:" + sum );

		
	//4. A ~ Z까지 출력
		System.out.println("\n\nA ~ Z까지 출력 ");
		int d = 1;
		while (d<=26){
			System.out.print((char)('A'+ d)+"\t");
			d++;
		}


	//5. 1~ 100사이의 3의 배수의 합 출력하기
		System.out.println("\n\n5. 1~ 100사이의 3의 배수의 합 출력하기 ");
		sum = 0;
		int e = 1;
		while (e<=100){
			if(e%3==0) sum += e; 
			  e++;
		}
		 System.out.print("3의 배수의 합:" + sum);

		
	//6. 1 ~ 100 출력을 10행 10열로 출력하기 (for문안에 조건문사용하기 , 이중for문 안됨)
		System.out.println("\n\n6. 1 ~ 100 출력을 10행 10열로 출력하기 "); 
		int f =1;
		while(f<=100){
			System.out.print(f  + "\t");
			if(f%10==0) System.out.println();
			f++;
		}


	//7. 100 ~ 1까지 거꾸로 출력하기 ( 100 99 98,.... 1 )
		System.out.println("\n\n7. 100 ~ 1까지 거꾸로 출력하기 ");
		int i =100;
		while (i>=1){
			System.out.print( i--  + "\t");
		}
		
	}

}