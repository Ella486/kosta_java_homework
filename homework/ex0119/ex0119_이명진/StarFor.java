class StarFor{
  public static void main(String [] args){
  
	for(int i=1; i<=5; i++){
		for(int j=0;j<i; j++){
			System.out.print("★");
		}
		System.out.println("");
	}
	System.out.println("*********************");
	 //System.out.println();
	for(int i=0; i<5; i++){
		for(int j=5;j>i; j--){
			System.out.print("★");
		}
		System.out.println("");
	}
	System.out.println("*********************");
	//System.out.println();

    for(int i=1; i<=5; i++){
		for(int j=5;j>0; j--){
			if(j>i){
				System.out.print("  ");
			}else{
				System.out.print("★");
			}
		}
		System.out.println();
	}
	System.out.println("*********************");
	//System.out.println();
	for(int i=1; i<=5; i++){
		for(int j=1;j<=5; j++){
			if(j>=i){
				System.out.print("★");
			}else{
				System.out.print("  ");
			}

		}
		System.out.println();
	}
	/*System.out.print("*********************");
	for(int a=1; a<=5; a++){//5행
		for(int b=a;b<5; b++){//공백
			System.out.print("  ");
		}
		for(int c=1;c<=a; c++){//공백
			System.out.print("★");
			
		}

	}
	System.out.println();
  */

  }//메인메소드끝
}//클래스 끝