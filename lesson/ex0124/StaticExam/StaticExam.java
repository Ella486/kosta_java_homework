class Test{

	int a;
	static int b;
	
	public void aa(){// non-static �޼ҵ�
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
	public static void cc(){//static �޼ҵ� �ȿ����� static�� ���� ����, this ��� �Ұ�

		//System.out.println(a);
		//System.out.println(this.a); 

		System.out.println(b);
		//System.out.println(this.b);
		System.out.println(Test.b); // static�� Ŭ�����̸�.����

		//�޼ҵ� ȣ��
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

		System.out.println("**static �ɹ��ʵ� *********************");
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();

		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);

		System.out.println("**non-static ���� a �� ���� ��---------------");
		System.out.println("t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		System.out.println("t3.a = " + t3.a);

		//������
		t1.a = 100;

		System.out.println("**non-static ���� a �� ���� ��---------------");
		System.out.println("t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		System.out.println("t3.a = " + t3.a);

		System.out.println("---------------------------");
		System.out.println("**static ���� b �� ���� ��---------------");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);

		//staic ���� ������
		//t1.b = 50;  or  Test.b = 30; �� �߿� �ϳ��� �Ἥ ����ϸ� ��
		Test.b = 30;

		System.out.println("**non-static ���� b �� ���� ��---------------");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);

		System.out.println("*************************************************");

		//int i = 100, j = 50;
		//i=j  //���� Ÿ���� ������ �� ���� ������   
		t1 = t2; // t2�� �ּҰ��� t1�� ������

		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);

		t1.a = 4;

		System.out.println("t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		System.out.println("t3.a = " + t3.a);


	}
}
