package ex0214.map.exam;

public class Person {
	// 필드
	private String id;
	private String name;
	private int age;

	// 생성자
	public Person() {}
	public Person(String id, String name, int age) {
		this(id, name);
		this.age = age;
	}

	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// get, set
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(" ");
		return builder.toString();
	}

     

}
