package ex0214.map.exam;

public class Student extends Person {
	// 필드
	private int kor;
	private int eng;
	private int math;
	private int sum; // 총점

	// 생성자
	public Student() {}
	public Student(String id, String name, int age, int kor, int eng, int math) {
		super(id, name, age);
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		// 총점
		this.sum = kor + eng + math;
	}

	// 수정할때 사용함..
	public Student(String id, String name, int kor, int eng, int math) {
		super(id, name);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// get, set
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" , kor=");
		builder.append(kor);
		builder.append(", eng=");
		builder.append(eng);
		builder.append(", math=");
		builder.append(math);
		builder.append(", sum=");
		builder.append(sum);
		builder.append("");
		return builder.toString();
	}

	

}
