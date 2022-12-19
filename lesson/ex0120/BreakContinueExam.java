class BreakContinueExam{
	public static void main(String[] args){ 
		for(int i=1; i<=5 ; i++){
			//if(i=3)continue;
			//if(i=3)break;
			if(i>3)continue;
		System.out.print(i + "\t");
	}

	System.out.println("\n\n------------------------");

	a:for(int i=1; i<=5 ; i++){
		b:for(int j=1; j<=5 ; j++){
			//if(i==3)break;
			//if(j==3)break;

			//if(i==3)continue;
			//if(j==3)continue;

			if(i==3)break a;
		System.out.print(j + "\t");
	}
	System.out.println();
   }
 }
}