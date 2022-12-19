class IfExam01{
	// 실행을 위해 반드시 필요한 메인메소드 작성
	public static void main(String [] args){
		//정수형 변수를 선언하고 임의의 값으로 초기화한다.
		int no = 3431;

		//선언된 변수의 값이 짝수이면 "짝수입니다." 홀수이면 "홀수입니다" 출력
 
		if(no%2==0){
			System.out.println( no + "는 짝수입니다.");  
		}else{
			System.out.println( no + "는 홀수입니다.");  
		}
            System.out.println( "*************************");

		if(no%7==0){
			System.out.println( no + "는 7의 배수입니다.");  
		}else{
			System.out.println( no + "는 7의 배수 아니다.");  
		}
		System.out.println( "*************************");

     //난수발생
		double nansu = Math.random() ; //Math.random() 이 메소드는 0.0과 1.0 사이에 속하는 double 타입의 난수 하나를 리턴함
		System.out.println( "nansu=" + nansu); // 0.0 <= Math.random() <1.0

		no = (int)(nansu*5)+1; //1~5    
		System.out.println("no =" + no);
		//start부터 시작하는 n개의 정수 중에서 임의의 정수 하나를 얻기 위한 연산식
		// int num = (int)(Math.random() * n) + start;  n = 경우의 수, start는 최소값


}


   }