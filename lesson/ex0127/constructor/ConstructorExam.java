
//ConstructorExam.java
class Puppy{
		//String,int  타입 전역 변수 선언(member 변수선언)
		String s;
		int i ;
		
		/*	메소드 printPuppyName작성
			인수없음, 리턴안함
			"public void printPuppyName() 호출되었습니다!"출력
			전역변수를 출력
		*/	
		 public void printPuppyName(){
			System.out.println("public void printPuppyName() 호출되었습니다!");
			System.out.println("this.s = " + this.s);
			System.out.println("this.i = "+ this.i);
		}
		
		
		/*인수가 없는 생성자 작성
			"생성자 public Puppy() 호출되었습니다!"출력
			printPuppyName메소드 호출
				전역변수 String에"메리" 할당(대입하라)
			전역변수 int에 -98998 할당(대입하라)
		*/
		public Puppy(){
			System.out.println("생성자 public Puppy() 호출되었습니다!");
			this.printPuppyName(); //this. 생략 가능
			this.s = "메리";
			this.i = -98998 ;

		}
		
}//클래스 끝
/////////////////////////////////////////////
class ConstructorExam{
	//메인메소드에서
	public static void main(String [] agrs){
		//Puppy객체 생성
		Puppy p = new Puppy();//전역필드를 초기화 하고 생성자를 호출한다.
		System.out.println("---------------------------------------------");
		//Puppy객체의 printPuppyName메소드 호출
		p.printPuppyName();
	}//메인끝
}//클래스 끝
			
