class DoubleWhlieExam01{
	public static void main(String [] args){
//1. 1 ~ 100을 출력하는데 10행 10열로 출력하기 (while문안에 while문 이용하기 ) 
		System.out.println( "1. 1~100을 출력하는데 10행 10열로 출력하기");
		int a=0;
		  while (a<10){
			  int b=1;
			  while (b<=10){
					System.out.print( b+ (a*10) + "\t");
					b++;
			  }
			  System.out.println();
			  a++;
		  }


		System.out.println( "1. 1~100을 출력하는데 10행 10열로 출력하기");
		int c=0;
		  while (c<100){
			  int d=1;
			  while (d<=10){
					System.out.print( (c+d) + "\t");
					d++;
			  }
			  System.out.println();
			  c+=10;
		  }

	   /*
	      1  2 3 ....10
		  11 12 13 ... 20
		  21.....      30
		  ..

		  91 ..........100
	   */

	    //2.  구구단출력하기 (9행 8열)
		System.out.println( "2.  구구단출력하기 (9행 8열)");
	     /*
		     2*1=2  3*1 =3   4*1=4 ....... 9*1=9
			 2*2=4  3*2 =6   4*2=8 ....... 9*2=18
			 2*3=6  3*3 =9   4*3=12 ....... 9*3=27
			 ...

			 2*9=18  3*9 =27   4*9=36 ....... 9*9=81

		 */
		 e=1;
		 while(e<=9){ // 9행
			 int f=2;
			 while(f<=9){
					System.out.print( );




				}

		 }


	}

}