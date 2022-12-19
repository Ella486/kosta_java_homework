
class Car{
		public String carname;
		public int cost;
		
		protected void printAttributes(){
			System.out.println("carname="+carname+"\tcost="+cost + "\t");
		}
}
//////////////////////////////////////////////////////////////////////////
//Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성	
	//각 클래스에 인수를 받지않는 생성자 작성
	//각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당
class EfSonata extends Car{ //EfSonata is a Car 
	
	EfSonata(){
		carname = "EfSonata"; //this. 생략 가능
		this.cost = 2000;
	
	}
}

class Excel extends Car{
	int a = 100; //EfSonata의 맴버필드

	Excel(){
		this. carname = "Excel"; 
		super.cost = 1000; //상속관계라서 super로 쓸수 있음. super는 자신의 부모의 멤버필드에 접근하는 지정예약어

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
	//메인메소드에서 
	public static void main(String[] args) {
		//Car, EfSonata, Excel, Canival 네개의 객체를 생성
		Car car = new Car();
		EfSonata ef = new EfSonata();
		Excel ex = new Excel();
		Carnival ca = new Carnival();

		System.out. println("====================================================");
		System.out. println("car = " + car);
		System.out. println("ef = " + ef);
		System.out. println("ex = " + ex);
		System.out. println("ca = " + ca);
		// 각 클래스에서 Car calss에있는 printAttributes()메소드를 호출할수있다.
		car.printAttributes();
		ef.printAttributes();
		ex.printAttributes();
		ca.printAttributes();

	}//메인 끝
					
}

