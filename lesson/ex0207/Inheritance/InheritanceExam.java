
class Car{
		public String carname;
		public int cost;
		
		protected void printAttributes(){
			System.out.println("carname="+carname+"\tcost="+cost + "\t");
		}
}
//////////////////////////////////////////////////////////////////////////
//Car�� ��ӹ޴� EfSonata, Excel, Carnival 3�� Ŭ���� �ۼ�	
	//�� Ŭ������ �μ��� �����ʴ� ������ �ۼ�
	//�� Ŭ������ �������� �����ο��� carname�� cost�� ������ �� �Ҵ�
class EfSonata extends Car{ //EfSonata is a Car 
	
	EfSonata(){
		carname = "EfSonata"; //this. ���� ����
		this.cost = 2000;
	
	}
}

class Excel extends Car{
	int a = 100; //EfSonata�� �ɹ��ʵ�

	Excel(){
		this. carname = "Excel"; 
		super.cost = 1000; //��Ӱ���� super�� ���� ����. super�� �ڽ��� �θ��� ����ʵ忡 �����ϴ� ���������

	}
}

class Carnival extends Car{
	Carnival(){
		carname = "Carnival"; 
		cost = 3000;
	}
}
	
///////////////////////////////////////////////////////////////////////////////
public class InheritanceExam{
	//���θ޼ҵ忡�� 
	public static void main(String[] args) {
		//Car, EfSonata, Excel, Canival �װ��� ��ü�� ����
		Car car = new Car();
		EfSonata ef = new EfSonata();
		Excel ex = new Excel();
		Carnival ca = new Carnival();

		System.out. println("====================================================");
		System.out. println("car = " + car);
		System.out. println("ef = " + ef);
		System.out. println("ex = " + ex);
		System.out. println("ca = " + ca);
		// �� Ŭ�������� Car calss���ִ� printAttributes()�޼ҵ带 ȣ���Ҽ��ִ�.
		car.printAttributes();
		ef.printAttributes();
		ex.printAttributes();
		ca.printAttributes();

	}//���� ��
					
}

