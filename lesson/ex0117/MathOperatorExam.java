class MathOperatorExam{
     //실행을 위해서 반드시 필요한 메인메소드
	public static void main(String []args){
		int i=5; // 변수선언과 값 할당
		int j=2;  // 변수선언과 값 할당
		System.out.println("i+j="+(i+j)); //i+j= 52
		System.out.println("i-j="+(i-j)); //i-j=3
		System.out.println("i*j="+(i*j)); //i*j=10
		System.out.println("i/j="+(i/j)); //i/j=2
		System.out.println("i%j="+(i%j)); //i%j=2

		System.out.println("i="+i); //i=5
		
		int k=i++; //선대입 후증가
		System.out.println("k="+k); //k=5
		System.out.println("i="+i);  //i=6
		
		int p=++i;  //선증가 후대입
		System.out.println("p="+p); // p=71
		System.out.println("i="+i);  //i=7

		int x=19 + 4 * 3 / 2 - 10 * 2 + 4;  

		System.out.println("19+4*3/2-10*2+4="+x); //9
	}	
}