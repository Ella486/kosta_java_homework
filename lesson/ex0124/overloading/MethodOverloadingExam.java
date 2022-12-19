//MethodOverloadingExam.java
class OverloadedMethod{
	private int i; //전역변수  -----> 객체가 생성될때는 초기값이 0 이됨
       
	public void  setOverload(int i){
		this.i = i;  // 인수로 전달된 i의 값을 전역변수 i에 저장한다.
	}
	
	public int getOverload(){
		return i; // 전역변수 i의 값

	}
	
	//setOverload를 Overloading하세요. 리턴도 하세요.
	public int setOverload(){

		System.out.println("setOverload() 메소드 호출됨.....");

		return 10;


	}
	
	//setOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	String setOverload(String s){

		System.out.println("setOverload(String s) 메소드 호출됨....." );

		return s + "바보";


	}

	
	//setOverload를 또 또Overloading 하세요. 리턴 안해요
	private void setOverload(char ch){

		System.out.println("setOverload(char ch) 메소드 호출됨....." );

	
	}



	//getOverload를 Overloading하세요. 리턴도 하세요.

	public int getOverload(int a){
		
		System.out.println("getOverload(int a) 메소드 호출됨....." );

		return a*10;

	}
	
	//getOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	protected boolean getOverload(int a , int b){
		
		System.out.println("getOverload(int a , int b) 메소드 호출됨.....");

		return true;

	}

	//getOverload를 또 또Overloading 하세요. 리턴 안해요
	 void getOverload(short sh){
		
		System.out.println("getOverload(short sh) 메소드 호출됨....." );

	}
		
	
}
///////////////////////////////////////////////////////////////////////
class  MethodOverloadingExam{
       
	public static void main(String [] agr){
		//OverloadedMethod객체에서 호출가능한  메소드들을 한번씩 호출하세요.
		OverloadedMethod om= new OverloadedMethod();
		//int re = om.setloadedMethod();
		//System.out.println("결과: " + re);

		//om.setOverload("안녕");

		//om.setOverload('A'); //int i = 'A';

		om.getOverload((short)2 );
	}   


}

