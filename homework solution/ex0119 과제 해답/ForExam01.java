class ForExam01{
   public static void main(String [] args){
       //1. 1 ~ 100���� ���ٷ� ����ϱ�
	   int i;
	    System.out.println("1. 1 ~ 100���� ���ٷ� ����ϱ�==============");
	   for(i=1; i<=100 ; i++ ){ //i=1, ,2, 3,4, ,5 ..... 101�Ǹ� �ݺ��� �׸��Ѵ�.
          System.out.print(i +"\t");
	   }

        System.out.println("\ni = " + i);

      
	   //2. 1 ~100���� ����ϵ� 5�� ����� ����ϱ�
	   System.out.println("\n\n2. 1 ~100���� ����ϵ� 5�� ����� ����ϱ�==============");
	   for( i=1; i <= 100 ; i++){ // i=i+5  -->  i+=5
            if(i%5==0)System.out.print(i +"\t");
	   }
	   
	   //3. 1 ~100������ ���� ����ϱ� 
	   System.out.println("\n\n3. 1 ~100������ ���� ����ϱ� ==============");
	   int sum=0;
	   for( i=1; i <= 100 ; i++){
            sum+=i; // sum=sum+i
	   }
	   System.out.println("���� : " + sum);

	   //4. A ~ Z���� ���
	   System.out.println("\n\n4. A ~ Z���� ��� ==============");
       for(i=0; i<26 ; i++){
          System.out.print((char)('A'+i)+"\t");
	   }

	    System.out.println("\n\n4. A ~ Z���� ��� ==============");
        for(i=65; i<=90 ; i++){
            System.out.print((char)(i)+"\t");
		}

		System.out.println("\n\n4. A ~ Z���� ��� ==============");
        for(char ch='A'; ch <= 'Z' ; ch++){
            System.out.print(ch +" , " + (int)ch  + "\t");
		}

	   //5. 1~ 100������ 3�� ����� �� ����ϱ�
	   System.out.println("\n\n5. 1~ 100������ 3�� ����� �� ����ϱ�==============");
	   sum=0;
	   for(i=1 ; i <= 100 ; i++){
          if(i%3==0) sum+=i;
	   }
	   System.out.println("3�� ����� �� : " + sum);

	   //6. 1 ~ 100 ����� 10�� 10���� ����ϱ� (for���ȿ� ���ǹ�����ϱ� , ����for�� �ȵ�)
       System.out.println("\n\n6. 1 ~ 100 ����� 10�� 10���� ����ϱ�==============");
	   for(i=1; i<=100 ; i++ ){ //i=1, ,2, 3,4, ,5 ..... 101�Ǹ� �ݺ��� �׸��Ѵ�.
          System.out.print(i +"\t");
		  if(i%10==0)System.out.println();
	   }


	   //7. 100 ~ 1���� �Ųٷ� ����ϱ� ( 100 99 98,.... 1 )
	   System.out.println("\n\n7. 100 ~ 1���� �Ųٷ� ����ϱ� ( 100 99 98,.... 1 )==============");
	   for(i=100 ; i >= 1 ; i--){
           System.out.print(i+"\t");
	   }

   }
}