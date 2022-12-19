class DoubleForExam01{
    public static void main(String [] args){
       //1. 1 ~ 100을 출력하는데 10행 10열로 출력하기 (for문안에 for문 이용하기 ) 
	   /*
	      1  2 3 ....10
		  11 12 13 ... 20
		  21.....      30
		  ..

		  91 ..........100
	   */
	   System.out.println("1. 1 ~ 100을 출력하는데 10행 10열로 출력하기 -----------");
	   int sum=0;
	   for(int i=1; i<=10 ; i++){ //10행
          for(int j=1; j<=10 ; j++){//10열
              System.out.print( ++sum  +"\t");
		  }
          System.out.println();
	   }

	    System.out.println("1. 1 ~ 100을 출력하는데 10행 10열로 출력하기 -----------");
        for(int i=0; i<100 ; i+=10){ //10행
          for(int j=1; j<=10 ; j++){//10열
              System.out.print( (i+j)  +"\t");
		  }
          System.out.println();
	   }

	   System.out.println("1. 1 ~ 100을 출력하는데 10행 10열로 출력하기 -----------");
	   for(int i=0; i<10 ; i++){ //10행   i = 1 2  3  4 5 6 ...
          for(int j=1; j<=10 ; j++){//10열
              System.out.print( (i*10)+j  +"\t");
		  }
          System.out.println();
	   }



	   //2.  구구단출력하기 (9행 8열)
	     /*
		     2*1=2  3*1 =3   4*1=4 ....... 9*1=9
			 2*2=4  3*2 =6   4*2=8 ....... 9*2=18
			 2*3=6  3*3 =9   4*3=12 ....... 9*3=27
			 ...

			 2*9=18  3*9 =27   4*9=36 ....... 9*9=81

		 */ 
       System.out.println("\n\n2.  구구단출력하기 (9행 8열)");
		for(int i=1; i<=9 ; i++){//9행
           for(int j=2; j <=9 ; j++){//8열
              System.out.print(j+" * " + i +" = " + (i*j)+"\t");
		   }
		   System.out.println();
		 }

         

	}

}