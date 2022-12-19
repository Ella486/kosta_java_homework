//MethodOverloadingExam.java
class OverloadedMethod{
	private int i; //��������  -----> ��ü�� �����ɶ��� �ʱⰪ�� 0 �̵�
       
	public void  setOverload(int i){
		this.i = i;  // �μ��� ���޵� i�� ���� �������� i�� �����Ѵ�.
	}
	
	public int getOverload(){
		return i; // �������� i�� ��

	}
	
	//setOverload�� Overloading�ϼ���. ���ϵ� �ϼ���.
	public int setOverload(){

		System.out.println("setOverload() �޼ҵ� ȣ���.....");

		return 10;


	}
	
	//setOverload�� �� Overloading �ϼ���. �� �ٸ� ������ ���� �ϼ���.
	String setOverload(String s){

		System.out.println("setOverload(String s) �޼ҵ� ȣ���....." );

		return s + "�ٺ�";


	}

	
	//setOverload�� �� ��Overloading �ϼ���. ���� ���ؿ�
	private void setOverload(char ch){

		System.out.println("setOverload(char ch) �޼ҵ� ȣ���....." );

	
	}



	//getOverload�� Overloading�ϼ���. ���ϵ� �ϼ���.

	public int getOverload(int a){
		
		System.out.println("getOverload(int a) �޼ҵ� ȣ���....." );

		return a*10;

	}
	
	//getOverload�� �� Overloading �ϼ���. �� �ٸ� ������ ���� �ϼ���.
	protected boolean getOverload(int a , int b){
		
		System.out.println("getOverload(int a , int b) �޼ҵ� ȣ���.....");

		return true;

	}

	//getOverload�� �� ��Overloading �ϼ���. ���� ���ؿ�
	 void getOverload(short sh){
		
		System.out.println("getOverload(short sh) �޼ҵ� ȣ���....." );

	}
		
	
}
///////////////////////////////////////////////////////////////////////
class  MethodOverloadingExam{
       
	public static void main(String [] agr){
		//OverloadedMethod��ü���� ȣ�Ⱑ����  �޼ҵ���� �ѹ��� ȣ���ϼ���.
		OverloadedMethod om= new OverloadedMethod();
		//int re = om.setloadedMethod();
		//System.out.println("���: " + re);

		//om.setOverload("�ȳ�");

		//om.setOverload('A'); //int i = 'A';

		om.getOverload((short)2 );
	}   


}

