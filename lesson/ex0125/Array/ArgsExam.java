class ArgsExam{

	public static void main(String[] args) // 배열이 전달된다.
	{
		System.out.println("args = " + args );//
		System.out.println("args.length = " + args.length );//

		//실행할 때 입력한 모든 값을 출력해본다.
		/*for(int i= 0; i< args.length ; i++){
			System.out.println("args[" + i +"] = " + args[i]);
		}*/
		
		//만약 2개의 숫자가 입력된다고 가정하고 두수의 합을 구한다.
		System.out.println("두수의 합:" + (args[0] + args[1]));

		// String -- > int 로 변환 : Integer.parseInt(문자열)/  int -----> String변환 : Integer.toString(숫자)
		int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println("두수의 합:" + sum );

		System.out.println("****프로그램 종료*****");
	}//메인 끝
}


/**
	실행할 때 사용자가 전달해야하는 값이 있다면 실행할 때 값을 전달 할 수 있다.
		java 파일이름 값 값 값 값......

		ex) java ArgsExam 안녕 졸지말자 20 40 true */