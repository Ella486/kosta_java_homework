package ex0207.sample02;
/**
�����̸�: �̸���
��¥: 22.02.07
���� :Employee MVC ���� �����
*/

public class FullTime extends Employee{
	
	private int salary;
	private int bonus;
	
	public FullTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int salary,
			int bonus) {
		super();
		setEmpNo(empNo);
		seteName(eName);
		setJob(job);
		setHiredate(hiredate);
		setDeptName(deptName);
		setSalary(salary);
		setBonus(bonus);
	}


	public void message() {
		System.out.println(this.geteName()+"����� ������ �Դϴ�.");
	}
	
	
	
	@Override
	public String toString() {
		return getEmpNo() + "\t|" + geteName() + "\t|" + getJob() + "\t|" + getMgr() + "\t|"
				+ getHiredate() + "\t|" + getDeptName() + "\t|" + getSalary() + "\t|" + getBonus();
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
	

}
