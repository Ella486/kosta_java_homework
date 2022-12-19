class CarCenter{
	public void engineer(Car cd){ // Car객체가 전달된다.   ef주소 , ca주소 , ex주소
		System.out.println("cd주소 : " + cd);

		if(cd instanceof Excel){
			//부모타입으로는 자식부분을 접근할 수 없다! 다형성의 단점
			//만약, 접근을 하고 싶다면, ObjectDownCasting을 한다.
			//System.out.println("cd.a주소 : " + cd.a);
			Excel ex2 = (Excel)cd; //캐스팅 필요
			System.out.println("ex2주소 : " + ex2);
			System.out.println("ex2.a : " + ex2.a + "\n");
		}

		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원" + "\n");
		
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

		System.out.println("ex주소= "+ ex);
		System.out.println("ex.a= "+ ex.a);
		cc.engineer(ex);//
		
		
	
	}
}
