class ArrayExam{
	
	//각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요
	int [] intArr = new int [5];//0
	double [] doubleArr = new double [5];//0.0
	char [] charArr = new char [5];//u0000
	boolean [] booleanArr = new boolean [5];//false
	String [] stringArr = new String [5];//null

		
		
	//메소드 : printArrayValue01	
	//위의 배열들에 자동으로 초기화 된값을 출력하세요
	public void printArrayValue01(){

		/**System.out.println("*************초기화된 값 출력 **********************");
		for(int i=0 ; i< intArr.length ; i++){
		System.out.println(intArr[i]);
		System.out.println(doubleArr[i]);
		System.out.println(charArr[i]);
		System.out.println(booleanArr[i]);
		System.out.println(stringArr[i]);
		}*/
		System.out.println("************intArr 주소값 = " + intArr);
		for(int i=0 ; i< intArr.length ; i++){
			System.out.println("intArr["+i+"] = " + intArr[i]);
		}
		System.out.println("*****개선된 for int *********");
		for(int v : intArr){
			System.out.println(v);
		}

		System.out.println();

		System.out.println("************doubleArr 주소값 = " + doubleArr);
		for(int i=0 ; i< doubleArr.length ; i++){
			System.out.println("doubleArr["+i+"] = " + doubleArr[i]);
		}
		System.out.println("*****개선된 for double *********");
		for(double v : doubleArr ){
			System.out.println(v);
		}
		System.out.println();
		
		System.out.println("************charArr 주소값 = " + charArr);
		for(int i=0 ; i< charArr.length ; i++){
			System.out.println("charArr["+i+"] = " + charArr[i]);
		}
		System.out.println("*****개선된 for char *********");
		for(char v : charArr){
			System.out.println(v);
		}
		System.out.println();

		System.out.println("************booleanArr 주소값 = " + booleanArr);
		for(int i=0 ; i< booleanArr.length ; i++){
			System.out.println("booleanArr["+i+"] = " + booleanArr[i]);
		}
		System.out.println("*****개선된 for boolean *********");
		for(boolean  v : booleanArr){
			System.out.println(v);
		}
		System.out.println();

		System.out.println("************stringArr 주소값 = " + stringArr);
		for(int i=0 ; i< stringArr.length ; i++){
			System.out.println("stringArr["+i+"] = " + stringArr[i]);
		}
		System.out.println("*****개선된 for String *********");
		for( String v : stringArr){
			System.out.println(v);
		}
		System.out.println();
		

	}
	//메소드 : printArrayValue02	
	//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요. (값변경)
	public void printArrayValue02(){
		
				
		for(int i=0 ; i< intArr.length ; i++){
			intArr[i] = i*10;
			doubleArr[i] = i*0.5;
			charArr[i] = (char)('A' + i);

			if(i%2==0)booleanArr[i] = true;

			stringArr[i] = "A" +i;

		}


	}

	
	//메소드 : printArrayValue03	
	//새롭게 할당된값을 출력하세요
	public void printArrayValue03(){

		this.printArrayValue01();

		System.out.println('\n');
	}

	
	//메인메소드에서
	//ArrayExam의 메소드들을 순서대로 호출하세요.

	

	public static void main(String args []){
		ArrayExam ae= new ArrayExam();
		ae.printArrayValue01();
		ae.printArrayValue02();
		ae.printArrayValue03();
	}
}