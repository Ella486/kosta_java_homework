class StaticInitExam {
	public static void main(String[] args) 
	{
		System.out.println("** 메인 시작합니다...**");
		//기능


		System.out.println("**메인 End..**");
	}


	static{
		//필요기능(환경세팅, 데이터초기화 및 로딩, DB연결, 점검해야하는 일들.......)
		System.out.println("메인보다 먼저 호출됩니다........");

	}

}
