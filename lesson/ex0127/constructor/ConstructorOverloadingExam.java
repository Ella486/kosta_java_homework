class Puppy3{
	/*String Ÿ�� ���� ���� ����
		int Ÿ�� ���� ���� ����*/
	String str; //null
	int i;//0
		
	/*�μ��� ���� �������ۼ�
		String Ÿ�� ���������� "�޸�" �Ҵ�
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
		�������� ���
	*/		
	Puppy3(){
		str = "�޸�"; //(this. ���� ����)
		System.out.println("puplic Puppy3()ȣ��Ǿ����ϴ�");
		System.out.println("�������� str" + this.str +", i = " + i);
		
	}
	
	/*String Ÿ���� �μ� 1���� �޴� �������ۼ�
		String Ÿ�� ���������� �μ� �Ҵ�
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
		�������� ���
	*/		
	Puppy3(String str){//true��
		this.str= str;//���� this.�� �ʼ� ������ �������� �̸��� ���Ƽ�
		System.out.println("puplic Puppy3()ȣ��Ǿ����ϴ�");
		System.out.println("�������� str" + this.str +", i = " + i);

	}	
	
	/*String Ÿ���� �μ� 2���� �޴� �������ۼ�
		�μ�2���� �ϳ��� String���� �����
		String Ÿ���� �μ� 1���� �޴� �����ڿ��� �μ��� �ָ� ȣ��
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
	*/		
	public Puppy3(String s , String s2){//"Java","Hi"
		this(s+s2); //String �Ѱ� �޴� ������ ȣ��
		System.out.println("puplic Puppy3(String s, String s2)ȣ��Ǿ����ϴ�");
		
	}		
	
	
	/*boolean Ÿ���� �μ� 1���� �޴� �������ۼ�
		�μ��� "��"�� �ٿ� �ϳ��� String���� �����
		String Ÿ���� �μ� 1���� �޴� �����ڿ��� �μ��� �ָ� ȣ��
		"puplic Puppy3()ȣ��Ǿ����ϴ�"  ���
	*/					
	public Puppy3(boolean b){
		this(b+"��");// String �Ѱ� �޴� ������ ȣ��
		System.out.println("puplic Puppy3(boolean b)ȣ��Ǿ����ϴ�");
	}
	
	
	/*char Ÿ���� �μ� 1���� �޴� �������ۼ�
			�μ��� ���� �����ڸ� ȣ���ϰ�
			�μ��� ���� data�� intŸ�� ���������� �Ҵ�	
			"puplic Puppy3()ȣ��Ǿ����ϴ�"���
			int�� �����������
	*/			
	public Puppy3(char ch){	
		this();//�μ� ���� ������ ȣ��(�⺻������)
		this.i = ch;
		System.out.println("puplic Puppy3(char ch)ȣ��Ǿ����ϴ�");
		System.out.println("��������" + this.i);

	}
	
	
	/*�޼ҵ� printMemberVariable
	���� ����
	���������� ���
	*/	
	public void printMemberVariable(){

		System.out.println("�������� str = " + str);
		System.out.println("�������� i = "+ i + "\n\n");
	}

	
}// Ŭ���� ��

class ConstructorOverloadingExam{
		//���θ޼ҵ忡��
		public static void main(String [] args){
			Puppy3 p = new Puppy3();//�μ����� ������ ȣ��
			//Puppy3 Ŭ������ �� �����ڸ� �ѹ��� �̿��� ��ü 5�� ����
			
			System.out.println("============2.=========================" );
			Puppy3 p2 = new Puppy3("Java"); //String �޴� ������ ȣ��

			System.out.println("============3.=========================" );
			Puppy3 p3 = new Puppy3("Java", "Hi"); //String 2�� �޴� ������ ȣ��

			System.out.println("============4.=========================" );
			Puppy3 p4 = new Puppy3(true); //boolean �޴� ������ ȣ���

			System.out.println("============5.=========================" );
			Puppy3 p5 = new Puppy3('A'); //char �޴� ������ ȣ���

			System.out.println("===========�ּҰ� ���=================" );
			System.out.println("p =" + p);
			System.out.println("p2 =" + p2);
			System.out.println("p3 =" + p3);
			System.out.println("p4 =" + p4);
			System.out.println("p5 =" + p5);
			
		//�� ��ü�� printMemberVariable�޼ҵ带 �ѹ��� ȣ��
			System.out.println("===========�� ��ü�� �޼ҵ� ȣ��=================" );
			p.printMemberVariable();
			p2.printMemberVariable();
			p3.printMemberVariable();
			p4.printMemberVariable();
			p5.printMemberVariable();


	} //���� ��
} //Ŭ���� ��