package ex0207.sample02;
/**
�����̸�: �̸���
��¥: 22.02.07
���� :Employee MVC ���� �����
*/

public class PartTime extends Employee{
	private int timePay;
	
	public PartTime() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int timePay) {
		setEmpNo(empNo);
		seteName(eName);
		setJob(job);
		setHiredate(hiredate);
		setDeptName(deptName);
		setTimePay(timePay);
	}



	public void message() {
		System.out.println(geteName()+"����� �������� �Դϴ�.");
	}

	@Override
	public String toString() {
		return getEmpNo() + "\t|" + geteName() + "\t|" + getJob() + "\t|" + getMgr() + "\t|"
				+ getHiredate() + "\t|" + getDeptName() + "\t|" + getTimePay();
	}

	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}

	
	
}
