class CarCenter{
	public void engineer(Car cd){ // Car��ü�� ���޵ȴ�.   ef�ּ� , ca�ּ� , ex�ּ�
		System.out.println("cd�ּ� : " + cd);

		if(cd instanceof Excel){
			//�θ�Ÿ�����δ� �ڽĺκ��� ������ �� ����! �������� ����
			//����, ������ �ϰ� �ʹٸ�, ObjectDownCasting�� �Ѵ�.
			//System.out.println("cd.a�ּ� : " + cd.a);
			Excel ex2 = (Excel)cd; //ĳ���� �ʿ�
			System.out.println("ex2�ּ� : " + ex2);
			System.out.println("ex2.a : " + ex2.a + "\n");
		}

		System.out.print(cd.carname+" �����Ϸ�!\t");
		System.out.println("û�����"+cd.cost+" ��" + "\n");
		
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();
		EfSonata ef=new EfSonata();
		Carnival ca=new Carnival();
		Excel ex=new Excel();
		
		Car c= new Car();
		System.out.println("==================================");
		
		cc.engineer(c);//

		cc.engineer(ef);//

		cc.engineer(ca);//

		System.out.println("ex�ּ�= "+ ex);
		System.out.println("ex.a= "+ ex.a);
		cc.engineer(ex);//
		
		
	
	}
}
