 class MakeMethodExam02{
	

/*	
	Method�̸� : methodExam02_01
	�ڱ��ڽŸ� ���ٰ���
	Return Type : ����
	Parameter : ����2��	
	(�����ο���)�ϴ��� : �μ��� ����(����) �ΰ��� ������ ���� ����ϰ�
		�������� ���� 3�� ����̸� "3�� ���"���
		�������� �� ����
*/
	private int methodExam02_01(int i, int j){
		int sum = i + j;
		System.out.println("�������� ��: " + sum);

		if(sum%3 ==0)
		System.out.println("3�� ���");

		return sum;

	}

/*	Method�̸� : methodExam02_02
	��𼭳� �ƹ��� ����
	Return Type : String
	Parameter : String	
	(�����ο���)�ϴ��� : �μ��� ����(����) String�� �ٺ��� �ٿ��� ���
			     �μ��� ���� (����)String�� �ٺ��� �ٿ��� ����
*/
	public String methodExam02_02 (String aa) {//������

		System.out.println(aa + "�ٺ�" );
		return aa + "�ٺ�" ;
	}
/*	
	Method�̸� : methodExam02_03
	���� package���� �ƹ��� ���ٰ���
	Return Type : ���Ͼ���
	Parameter : ����1�� �� String 1��	
	(�����ο���)�ϴ��� : �μ��� ���� ������ String�� (�ϳ��� String����) �ٿ��� ���
		�μ��� ���������� 4�� ������ 1���, �ƴ϶�� 0���
*/
	void methodExam02_03 (int b, String cc) {// 42, "�̻Ѵ�~"

		System.out.println(b + cc);

		if(b%4 ==0)
			System.out.println(1);
		else
			System.out.println(0);

	}
/*	
	Method�̸� : methodExam02_04
	��Ӱ����� ��𼭳� ���ٰ���
	Return Type : �Ǽ�(�ε��Ҽ���)
	Parameter :ù��°�μ�(����),�ι�° �μ�(�Ǽ�),����° �μ�(����)	
	(�����ο���)�ϴ��� : ù��° �μ� ���ϱ� �ι�°�μ� ���� ����°�μ� ��� ���
			     ���� ����� ����
*/
	protected double methodExam02_04 (int a, double b, int c ) {//7. 5.5, 8
		double result = a*b-c; // ���� ���� �ȴ�� a*b-c; �ᵵ ��
		System.out.println("������: " + result);

		return result;
	}



	public static void main(String [] args){
      MakeMethodExam02 mme = new MakeMethodExam02();
		int k=mme.methodExam02_01(33, 22);
		System.out.println(k);

       	String s=mme.methodExam02_02("������");
		System.out.println(s);

       		mme.methodExam02_03(42, "�̻Ѵ�~");

       		//double d=mme.methodExam02_04(7, 5.5, 8);
			//System.out.println(d);

		System.out.println(mme.methodExam02_04(7, 5.5, 8));
	}	
} //Ŭ���� ��