class Puppy3{
	/*String 타입 전역 변수 선언
		int 타입 전역 변수 선언*/
	String str; //null
	int i;//0
		
	/*인수가 없는 생성자작성
		String 타입 전역변수에 "메리" 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/		
	Puppy3(){
		str = "메리"; //(this. 생략 가능)
		System.out.println("puplic Puppy3()호출되었습니다");
		System.out.println("전역변수 str" + this.str +", i = " + i);
		
	}
	
	/*String 타입의 인수 1개를 받는 생성자작성
		String 타입 전역변수에 인수 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/		
	Puppy3(String str){//true쫑
		this.str= str;//여기 this.는 필수 변수랑 전역변수 이름이 같아서
		System.out.println("puplic Puppy3()호출되었습니다");
		System.out.println("전역변수 str" + this.str +", i = " + i);

	}	
	
	/*String 타입의 인수 2개를 받는 생성자작성
		인수2개를 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"출력
	*/		
	public Puppy3(String s , String s2){//"Java","Hi"
		this(s+s2); //String 한개 받는 생성자 호출
		System.out.println("puplic Puppy3(String s, String s2)호출되었습니다");
		
	}		
	
	
	/*boolean 타입의 인수 1개를 받는 생성자작성
		인수를 "쫑"과 붙여 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"  출력
	*/					
	public Puppy3(boolean b){
		this(b+"쫑");// String 한개 받는 생성자 호출
		System.out.println("puplic Puppy3(boolean b)호출되었습니다");
	}
	
	
	/*char 타입의 인수 1개를 받는 생성자작성
			인수가 없는 생성자를 호출하고
			인수로 받은 data를 int타입 전역변수에 할당	
			"puplic Puppy3()호출되었습니다"출력
			int형 전역변수출력
	*/			
	public Puppy3(char ch){	
		this();//인수 없는 생성자 호출(기본생성자)
		this.i = ch;
		System.out.println("puplic Puppy3(char ch)호출되었습니다");
		System.out.println("전역변수" + this.i);

	}
	
	
	/*메소드 printMemberVariable
	리턴 없슴
	전역변수를 출력
	*/	
	public void printMemberVariable(){

		System.out.println("전역변수 str = " + str);
		System.out.println("전역변수 i = "+ i + "\n\n");
	}

	
}// 클래스 끝

class ConstructorOverloadingExam{
		//메인메소드에서
		public static void main(String [] args){
			Puppy3 p = new Puppy3();//인수없는 생성자 호출
			//Puppy3 클래스의 각 생성자를 한번씩 이용해 객체 5개 생성
			
			System.out.println("============2.=========================" );
			Puppy3 p2 = new Puppy3("Java"); //String 받는 생성자 호출

			System.out.println("============3.=========================" );
			Puppy3 p3 = new Puppy3("Java", "Hi"); //String 2개 받는 생성자 호출

			System.out.println("============4.=========================" );
			Puppy3 p4 = new Puppy3(true); //boolean 받는 생성자 호출됨

			System.out.println("============5.=========================" );
			Puppy3 p5 = new Puppy3('A'); //char 받는 생성자 호출됨

			System.out.println("===========주소값 출력=================" );
			System.out.println("p =" + p);
			System.out.println("p2 =" + p2);
			System.out.println("p3 =" + p3);
			System.out.println("p4 =" + p4);
			System.out.println("p5 =" + p5);
			
		//각 객체의 printMemberVariable메소드를 한번씩 호출
			System.out.println("===========각 객체의 메소드 호출=================" );
			p.printMemberVariable();
			p2.printMemberVariable();
			p3.printMemberVariable();
			p4.printMemberVariable();
			p5.printMemberVariable();


	} //메인 끝
} //클래스 끝