class WhileExam01{
	public static void main(String [] args){
    //1. 1 ~ 100���� ���ٷ� ����ϱ�
		System.out.println("//1. 1 ~ 100���� ���ٷ� ����ϱ�");
		int a = 1;
		while (a <=100){
			System.out.print(a +"\t");
				 a++;
		}


	//2. 1 ~100���� ����ϵ� 5�� ����� ����ϱ�
		System.out.println("\n\n2. 1 ~100���� ����ϵ� 5�� ����� ����ϱ�");
		int b = 1;
		while (b <=100){
             if(b%5==0) System.out.print( b + "\t"); 

			   b++;
	     }


	//3. 1 ~100������ ���� ����ϱ� 
		System.out.println("\n\n3. 1 ~100������ ���� ����ϱ� ");

		int sum = 0;
		int c = 1;
		while( c<=100 ) { 
		   sum += c; //sum = sum +c;
		   c++;
		}
		System.out.print( "����:" + sum );

		
	//4. A ~ Z���� ���
		System.out.println("\n\nA ~ Z���� ��� ");
		int d = 1;
		while (d<=26){
			System.out.print((char)('A'+ d)+"\t");
			d++;
		}


	//5. 1~ 100������ 3�� ����� �� ����ϱ�
		System.out.println("\n\n5. 1~ 100������ 3�� ����� �� ����ϱ� ");
		sum = 0;
		int e = 1;
		while (e<=100){
			if(e%3==0) sum += e; 
			  e++;
		}
		 System.out.print("3�� ����� ��:" + sum);

		
	//6. 1 ~ 100 ����� 10�� 10���� ����ϱ� (for���ȿ� ���ǹ�����ϱ� , ����for�� �ȵ�)
		System.out.println("\n\n6. 1 ~ 100 ����� 10�� 10���� ����ϱ� "); 
		int f =1;
		while(f<=100){
			System.out.print(f  + "\t");
			if(f%10==0) System.out.println();
			f++;
		}


	//7. 100 ~ 1���� �Ųٷ� ����ϱ� ( 100 99 98,.... 1 )
		System.out.println("\n\n7. 100 ~ 1���� �Ųٷ� ����ϱ� ");
		int i =100;
		while (i>=1){
			System.out.print( i--  + "\t");
		}
		
	}

}