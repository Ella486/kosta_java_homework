package ex0208.abstract_final;
/**
�����̸�: �̸���
��¥: 22.02.08
���� : Abstract,Final �ǽ�����
*/

//Error �� �����ϰ� ������ �ּ����� ó���ϼ���.

final class FinalClassExam{
 final int i = -999999; 
}


abstract class AbstractClassExam{
    abstract String abstractMethodExam(int i,String s);    
	final int finalMethodExam(int i, int j){ 
        return i+j;
    }
}


class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
	/** int finalMethodExam(int i, int j){ // finalMethodExam �޼ҵ� �տ� final�� �����Ƿ� ������(�������̵�) �� �� ����.
		return i*j;
	}*/
	
}

//class Sample02 extends FinalClassExam{  } //FinalClassExam Ŭ���� �տ� final�� �����Ƿ� ��� �� �� ����.


/**AbstractClassExam Ŭ���� �տ� abstract�� �پ����Ƿ� ��� �޴� Sample03 Ŭ������ abstract�޼ҵ带 �������ؾ�������
������ ���� �ʾ����Ƿ� �տ� abstract�� �ٿ��ش�.*/
 class Sample03 extends AbstractClassExam{
	@Override
	 String abstractMethodExam(int i,String s){
		 return s+i;
	 }
	 //abstract String abstractMethodExam(int i,String s); //Sample03 Ŭ���� �ȿ� �̹� �����ǵ� �޼ҵ尡 ������.

	void sampleMethod03(){
		System.out.println("void sampleMethod03() ȣ�� ��");
	}
}

class AbstractFinalClassTest{
    public static void main(String args[]){
		//AbstractClassExam ace = new AbstractClassExam(); //abstract Ŭ������ new �����ڷ� ���� ������ ȣ�� �Ұ�
		FinalClassExam fce = new FinalClassExam();
		//fce.i=100000; //i�� FinalClassExam�� final �ʵ�� �����Ǿ��� ������ �� ������ �Ұ�
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}
