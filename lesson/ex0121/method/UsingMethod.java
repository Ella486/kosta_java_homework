//UsingMethod.java
class UsingMethodExam{
     //�Ʒ��� ���� �޼ҵ带 �ۼ��ϼ���.
   
     /*Method�̸� :  methodExam03_01
     �ڱ��ڽŸ� ���ٰ���
     ReturnType : ����
     Parameter : ���� 1��
	(�����ο���)�ϴ� �� : 
	methodExam03_01�� ȣ��Ǿ����ϴ�. ���
	�μ��� ���� ���� ��� 
	����*2 ����. */
	private int methodExam03_01(int a){//3

		System.out.println("methodExam03_01�� ȣ��Ǿ����ϴ�.");
		System.out.println("�μ��� ��(��������): " + a );

		return a*2;

	}
	
	 
	 /*Method�̸� :  methodExam03_02
     ��𼭳� �ƹ��� ���ٰ���
     Return String
     Parameter : String 1��, ���� 1��
	(�����ο���)�ϴ� �� : 
		methodExam03_02�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� String �� �ٺ��� �ٿ��� ���
		�ι�°�μ��� ���� ���� methodExam03_01�� �־� �ָ� methodExam03_01�� ȣ���ϰ� �����ϴ� ���� ���
		�μ��� ���� String �� �ٺ��� �ٿ��� ����
	*/
	public String methodExam03_02(String str , int i){//"������?", 3

		System.out.println("methodExam03_02�� ȣ��Ǿ����ϴ�.");
		System.out.println( str + "�ٺ�");
		/**UsingMethodExam a = new UsingMethodExam();
		int result = a.methodExam03_01(i); */

		int result = this.methodExam03_01(i);//3
		
		System.out.println("���ϰ�: " + result);

		return str +"�ٺ�";

	}
			
	
	 /*Method�̸� :  methodExam03_03
     ���� package���� �ƹ��� ���� ����
     ReturnType : ���Ͼ���
     Parameter : ���� 1���� String 1��
     (�����ο���)�ϴ� �� : 
		methodExam03_03�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� ���� 1���� String 1���� �Ѱ��ָ�
		methodExam03_02ȣ��
	*/	
	void methodExam03_03(int i, String s){//3, "������?"

		System.out.println("methodExam03_03�� ȣ��Ǿ����ϴ�.");
		
		//String re = methodExam03_02(s,i); //���� Ŭ���� �ȿ��� ȣ��� this. ��������� this. �� ���� ������.
		methodExam03_02(s,i); //����Ŭ���� ���� �ٸ� �޼ҵ� ȣ���ϰ� ������� ���� ���Ѵ�. �� ����!(s,i) �̰Ű� (i,s)�� �ٲ�� �� �ȵǴ���
		
	}
	
     
     /*Method�̸� :  methodExam03_04
     ��Ӱ����� ��𼭳� ���� ����
     ReturnType : �Ǽ�(�ε��Ҽ���)
     Parameter : ù��° �μ�(����),�ι�° �μ�(�Ǽ�), ����°�μ�(����)
	(�����ο���)�ϴ� �� : 
		methodExam03_04�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� ���� �̿��� 
		MakeMethodExam02��ü�� methodExam02_04�޼ҵ� ȣ���ϰ�
		method02_04�� �����ϴ� ���� ����
	*/	
	protected double methodExam03_04(int i, double j, int k){//4, 2.5, 8
	
		System.out.println("methodExam03_04�� ȣ��Ǿ����ϴ�.");
		MakeMethodExam02 me = new MakeMethodExam02();
		double result = me.methodExam02_04(i, j, k);
		
		System.out.println("ȣ���� : " + result);
		return result ;


	}
} // UsingMethodExam ��
////////////////////////////////////////////////
public class UsingMethod{
		//���θ޼ҵ忡��
		//UsingMethodExam�� ȣ�Ⱑ���� �޼ҵ���� ȣ���ϰ�
		// �����ϴ� �� �ִٸ� ���
		
	public static void main(String [] args){
		UsingMethodExam ue = new UsingMethodExam();
		System.out.println("ue: " + ue);//�ּҰ�

		//�޼ҵ� ȣ���غ���
		//ue.methodExam03_01(4); //private �����ڴ� ���� Ŭ������������ ������ �����ϴ�.
		String re = ue.methodExam03_02("�������.", 3);
		System.out.println("���ϰ��: " + re );

		System.out.println("==========================================");
		ue.methodExam03_03(3, "�� ����?");

		System.out.println("==========================================");
		double result = ue.methodExam03_04(4, 2.5 , 8) ;
		System.out.println("��� : " + result);


	}//���α׷� ����!
	
}

  
