//UsingMethod.java
class UsingMethodExam{
     //아래와 같은 메소드를 작성하세요.
   
     /*Method이름 :  methodExam03_01
     자기자신만 접근가능
     ReturnType : 정수
     Parameter : 정수 1개
	(구현부에서)하는 일 : 
	methodExam03_01이 호출되었습니다. 출력
	인수로 받은 정수 출력 
	정수*2 리턴. */
	private int methodExam03_01(int a){//3

		System.out.println("methodExam03_01이 호출되었습니다.");
		System.out.println("인수의 값(지역변수): " + a );

		return a*2;

	}
	
	 
	 /*Method이름 :  methodExam03_02
     어디서나 아무나 접근가능
     Return String
     Parameter : String 1개, 정수 1개
	(구현부에서)하는 일 : 
		methodExam03_02가 호출되었습니다. 출력
		인수로 받은 String 에 바보를 붙여서 출력
		두번째인수로 들어온 값을 methodExam03_01로 넣어 주며 methodExam03_01을 호출하고 리턴하는 값을 출력
		인수로 받은 String 에 바보를 붙여서 리턴
	*/
	public String methodExam03_02(String str , int i){//"뭐먹지?", 3

		System.out.println("methodExam03_02이 호출되었습니다.");
		System.out.println( str + "바보");
		/**UsingMethodExam a = new UsingMethodExam();
		int result = a.methodExam03_01(i); */

		int result = this.methodExam03_01(i);//3
		
		System.out.println("리턴값: " + result);

		return str +"바보";

	}
			
	
	 /*Method이름 :  methodExam03_03
     같은 package에서 아무나 접근 가능
     ReturnType : 리턴안함
     Parameter : 정수 1개와 String 1개
     (구현부에서)하는 일 : 
		methodExam03_03이 호출되었습니다. 출력
		인수로 받은 정수 1개와 String 1개를 넘겨주며
		methodExam03_02호출
	*/	
	void methodExam03_03(int i, String s){//3, "뭐먹지?"

		System.out.println("methodExam03_03이 호출되었습니다.");
		
		//String re = methodExam03_02(s,i); //같은 클래스 안에서 호출시 this. 사용하지만 this. 은 생략 가능함.
		methodExam03_02(s,i); //현재클래스 내의 다른 메소드 호출하고 결과값은 저장 안한다. ★ 질문!(s,i) 이거가 (i,s)로 바뀌면 왜 안되는지
		
	}
	
     
     /*Method이름 :  methodExam03_04
     상속관계라면 어디서나 접근 가능
     ReturnType : 실수(부동소수형)
     Parameter : 첫번째 인수(정수),두번째 인수(실수), 세번째인수(정수)
	(구현부에서)하는 일 : 
		methodExam03_04가 호출되었습니다. 출력
		인수로 들어온 값을 이용해 
		MakeMethodExam02객체의 methodExam02_04메소드 호출하고
		method02_04가 리턴하는 값을 리턴
	*/	
	protected double methodExam03_04(int i, double j, int k){//4, 2.5, 8
	
		System.out.println("methodExam03_04이 호출되었습니다.");
		MakeMethodExam02 me = new MakeMethodExam02();
		double result = me.methodExam02_04(i, j, k);
		
		System.out.println("호출결과 : " + result);
		return result ;


	}
} // UsingMethodExam 끝
////////////////////////////////////////////////
public class UsingMethod{
		//메인메소드에서
		//UsingMethodExam의 호출가능한 메소드들을 호출하고
		// 리턴하는 값 있다면 출력
		
	public static void main(String [] args){
		UsingMethodExam ue = new UsingMethodExam();
		System.out.println("ue: " + ue);//주소값

		//메소드 호출해보자
		//ue.methodExam03_01(4); //private 제한자는 같은 클래스내에서만 접근이 가능하다.
		String re = ue.methodExam03_02("배고프다.", 3);
		System.out.println("리턴결과: " + re );

		System.out.println("==========================================");
		ue.methodExam03_03(3, "뭐 먹지?");

		System.out.println("==========================================");
		double result = ue.methodExam03_04(4, 2.5 , 8) ;
		System.out.println("결과 : " + result);


	}//프로그램 종료!
	
}

  
