class Test{

	int a;
	static int b;
	
	public void aa(){// non-static 메소드
		System.out.println(a);
		System.out.println(this.a); 

		System.out.println(b);
		System.out.println(this.b); 

	}
	public void bb(){

		aa();
		this.aa();

		dd();
		this.dd();

		Test.dd();

	}
	public static void cc(){//static 메소드 안에서는 static만 접근 가능, this 사용 불가

		//System.out.println(a);
		//System.out.println(this.a); 

		System.out.println(b);
		//System.out.println(this.b);
		System.out.println(Test.b); // static은 클래스이름.변수

		//메소드 호출
		//aa();
		//this.aa();

		dd();
		//this.dd();

		Test.dd();

	}
	public static void dd(){
		

	}
}
/////////////////////////////////////////////////
class StaticExam {
	public static void main(String[] args) {

		System.out.println("**static 맴버필드 *********************");
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();

		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);

		System.out.println("**non-static 변수 a 값 변경 전---------------");
		System.out.println("t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		System.out.println("t3.a = " + t3.a);

		//값변경
		t1.a = 100;

		System.out.println("**non-static 변수 a 값 변경 후---------------");
		System.out.println("t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		System.out.println("t3.a = " + t3.a);

		System.out.println("---------------------------");
		System.out.println("**static 변수 b 값 변경 전---------------");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);

		//staic 변수 값변경
		//t1.b = 50;  or  Test.b = 30; 둘 중에 하나로 써서 사용하면 됨
		Test.b = 30;

		System.out.println("**non-static 변수 b 값 변경 후---------------");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);

		System.out.println("*************************************************");

		//int i = 100, j = 50;
		//i=j  //변수 타입이 같으면 저 식이 성립됨   
		t1 = t2; // t2의 주소값을 t1에 넣으라

		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);

		t1.a = 4;

		System.out.println("t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		System.out.println("t3.a = " + t3.a);


	}
}
