
class Test{
	private static Test instance = new Test();

	//외부에서 객체생성 막음.
	private Test(){}

	/**
	현재 객체를 리턴해주는 메소드를 제공!
	*/
	public static Test getInstance(){
		Test t = new Test();
		return instance;
	}
}

/////////////////////////////////
class PrivateConstructorEaxm{

	public static void main(String[] args) {
		//new Test(); // 외부에서 객체 생성 안됨
		
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		Test t3 = Test.getInstance();

		System.out.println("t1 =" + t1);
		System.out.println("t2 =" + t2);
		System.out.println("t3 =" + t3);
				
	}
}
