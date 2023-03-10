
class ArrayValue{
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)
	//데이터 타입 배열이름 [ ] = new 데이터타입 [ ]{값, 값, 값,......};
	//int [] arr = new int [10]; //0의 준하는 값으로 초기화
	int [] arr = new int []{1,2,3,4,5,6,7,8,9,10};


   /*printArrayvalue 메소드작성
       => 메소드 안에서 위에 선언된 배열방의 값을 출력한다.
   
	*/	
	public void printArrayvalue(){

		System.out.println("arr=" + arr);// 주소값 
		System.out.println("arr.length =" + arr.length);//배열 방의 크기
		System.out.println("arr[2]=" + arr[2]);// 2번지 방의 값이 출력

		System.out.println("*************배열방 값 출력 **********************");
		/**int len = arr.length;
		for(int i=0; i < len ; i++){ */
		for(int i=0; i < arr.length ; i++){
			System.out.println("arr["+i+"] =" + arr[i]);
		}

		System.out.println("-----개선된 for문 version 1.5이상 추가 ---------");
		/*
			for( 타입 변수 : 반복대상 ){ // 반복대상의 0번지부터 마지막번지까지 반복하면 데이터를 꺼내준다.
				System.out.println(변수);  // 각 배열방의 값이 나온다.  
			}
		*/
		for ( int arrValue : arr){

			System.out.println(arrValue);
		}
	}
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue에 있는 printArrayvalue메소드 호출
		 ArrayValue av = new ArrayValue();
		 av.printArrayvalue();

		 //new ArrayValue().printArrayvalue(); // 메소드가 하나만 있고 한번 쓰고 끝날때 사용
	}
}