class ArrayExam{
	
	//��int,double,char,boolean ,String type���� �� 5���� �����ϴ�  �迭�� �����ϼ���
	int [] intArr = new int [5];//0
	double [] doubleArr = new double [5];//0.0
	char [] charArr = new char [5];//u0000
	boolean [] booleanArr = new boolean [5];//false
	String [] stringArr = new String [5];//null

		
		
	//�޼ҵ� : printArrayValue01	
	//���� �迭�鿡 �ڵ����� �ʱ�ȭ �Ȱ��� ����ϼ���
	public void printArrayValue01(){

		/**System.out.println("*************�ʱ�ȭ�� �� ��� **********************");
		for(int i=0 ; i< intArr.length ; i++){
		System.out.println(intArr[i]);
		System.out.println(doubleArr[i]);
		System.out.println(charArr[i]);
		System.out.println(booleanArr[i]);
		System.out.println(stringArr[i]);
		}*/
		System.out.println("************intArr �ּҰ� = " + intArr);
		for(int i=0 ; i< intArr.length ; i++){
			System.out.println("intArr["+i+"] = " + intArr[i]);
		}
		System.out.println("*****������ for int *********");
		for(int v : intArr){
			System.out.println(v);
		}

		System.out.println();

		System.out.println("************doubleArr �ּҰ� = " + doubleArr);
		for(int i=0 ; i< doubleArr.length ; i++){
			System.out.println("doubleArr["+i+"] = " + doubleArr[i]);
		}
		System.out.println("*****������ for double *********");
		for(double v : doubleArr ){
			System.out.println(v);
		}
		System.out.println();
		
		System.out.println("************charArr �ּҰ� = " + charArr);
		for(int i=0 ; i< charArr.length ; i++){
			System.out.println("charArr["+i+"] = " + charArr[i]);
		}
		System.out.println("*****������ for char *********");
		for(char v : charArr){
			System.out.println(v);
		}
		System.out.println();

		System.out.println("************booleanArr �ּҰ� = " + booleanArr);
		for(int i=0 ; i< booleanArr.length ; i++){
			System.out.println("booleanArr["+i+"] = " + booleanArr[i]);
		}
		System.out.println("*****������ for boolean *********");
		for(boolean  v : booleanArr){
			System.out.println(v);
		}
		System.out.println();

		System.out.println("************stringArr �ּҰ� = " + stringArr);
		for(int i=0 ; i< stringArr.length ; i++){
			System.out.println("stringArr["+i+"] = " + stringArr[i]);
		}
		System.out.println("*****������ for String *********");
		for( String v : stringArr){
			System.out.println(v);
		}
		System.out.println();
		

	}
	//�޼ҵ� : printArrayValue02	
	//���� 5���� �迭���� ���� ������ ������ data�� �Ҵ��ϼ���. (������)
	public void printArrayValue02(){
		
				
		for(int i=0 ; i< intArr.length ; i++){
			intArr[i] = i*10;
			doubleArr[i] = i*0.5;
			charArr[i] = (char)('A' + i);

			if(i%2==0)booleanArr[i] = true;

			stringArr[i] = "A" +i;

		}


	}

	
	//�޼ҵ� : printArrayValue03	
	//���Ӱ� �Ҵ�Ȱ��� ����ϼ���
	public void printArrayValue03(){

		this.printArrayValue01();

		System.out.println('\n');
	}

	
	//���θ޼ҵ忡��
	//ArrayExam�� �޼ҵ���� ������� ȣ���ϼ���.

	

	public static void main(String args []){
		ArrayExam ae= new ArrayExam();
		ae.printArrayValue01();
		ae.printArrayValue02();
		ae.printArrayValue03();
	}
}