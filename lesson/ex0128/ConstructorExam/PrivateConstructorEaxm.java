
class Test{
	private static Test instance = new Test();

	//�ܺο��� ��ü���� ����.
	private Test(){}

	/**
	���� ��ü�� �������ִ� �޼ҵ带 ����!
	*/
	public static Test getInstance(){
		Test t = new Test();
		return instance;
	}
}

/////////////////////////////////
class PrivateConstructorEaxm{

	public static void main(String[] args) {
		//new Test(); // �ܺο��� ��ü ���� �ȵ�
		
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		Test t3 = Test.getInstance();

		System.out.println("t1 =" + t1);
		System.out.println("t2 =" + t2);
		System.out.println("t3 =" + t3);
				
	}
}
