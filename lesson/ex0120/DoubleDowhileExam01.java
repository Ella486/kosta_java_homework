class DoubleDowhileExam01
{
	public static void main(String[] args) {
		//1. 1 ~ 100�� ����ϴµ� 10�� 10���� ����ϱ� (for���ȿ� for�� �̿��ϱ� ) 
		System.out.println( "1. 1~100�� ����ϴµ� 10�� 10���� ����ϱ�");


	   /*
	      1  2 3 ....10
		  11 12 13 ... 20
		  21.....      30
		  ..

		  91 ..........100
	   */
	   int i =0;
	   do{
		   int j=1;
		   do{
				System.out.print((j+i*10) + "\t ");
				j++;
			}while(j<=10);
			System.out.println();
			i++;
	   }while(i<10);

	   //2.  ����������ϱ� (9�� 8��)
	     /*
		     2*1=2  3*1 =3   4*1=4 ....... 9*1=9
			 2*2=4  3*2 =6   4*2=8 ....... 9*2=18
			 2*3=6  3*3 =9   4*3=12 ....... 9*3=27
			 ...

			 2*9=18  3*9 =27   4*9=36 ....... 9*9=81

		 */
		System.out.println( "2.  ����������ϱ�");
		int a=1;
		 do{
		   int b=2;
		   do{
				System.out.print(b+"*"+a+"="+(a*b)+"\t");
				b++;
			}while(b<=9);
				System.out.println();
				a++;
	   }while(a<=9);

	}
}
