package ex0208.inheritanceExam03;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;//자동타입변환
		
		snowTire.run();
		tire.run();
	}
}
	
