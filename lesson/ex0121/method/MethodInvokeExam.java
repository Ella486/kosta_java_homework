class Methodinvoke01{
	//������ ���� �޼ҵ带 �ۼ��ϼ���.
	
	/*method �̸� : method01
	��𼭳� ������ ���ٰ���
	���� ����
	�μ��� ����2�� ����
	�μ��� ���� ���� 2���� ���ؼ� ����ϰ� ����*/
	public int method01(int i, int j){
	System.out.println("�� ������ ��: " + (i*j));

	return i*j;

	}
	
}

class Methodinvoke02{
	
	//method �̸� : method02
	//��𼭳� ������ ���ٰ���,��ü�� �������� �ʰ� ���ٰ���
	//���� ����
	//�μ��� ����2�� ����
	
	//�μ��� ���� ���� 2���� ���ؼ� ����ϰ� ���Ѽ� ����
	public static int method02 (int i, int j){
		System.out.println("�� �μ��� ��: " + (i+j));

	    return i+j;
	
//

	}
		
	
}

class MethodInvokeExam{
	public static void main(String []args){
		
		//Methodinvoke01�� method01 ȣ��
		Methodinvoke01 m = new Methodinvoke01();
		int re = m.method01(5,7);
		//int re = Methodinvoke01.(5,7);
        System.out.println("ȣ�� ���: " + re);

		System.out.println("------------------------------" );
		//Methodinvoke02�� method02 ȣ��
		
		re = Methodinvoke02.method02(8,6);
		System.out.println("ȣ�� ���: " + re);
		

	}
}

