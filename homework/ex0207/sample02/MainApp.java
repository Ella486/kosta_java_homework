package ex0207.sample02;
/**
�����̸�: �̸���
��¥: 22.02.07
���� :Employee MVC ���� �����
*/

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FullTime [] full = new FullTime[3];
		PartTime [] part = new PartTime[2];

		System.out.println("****************Emp ����**********");
		full[0] = new FullTime(10, "���缮", "���׿��",0 , "2013-05-01", "���ѵ���",8500,200);
		full[1] = new FullTime(20, "�ڸ��", "����",10, "2013-06-20", "���ѵ���",7500,100);
		full[2] = new FullTime(30, "������", "������",10 , "2013-06-22", "���ѵ���",6000,0);
		part[0] = new PartTime(40, "��ȫö", "������",20 , "2014-05-01", "���ѵ���",20000);
		part[1] = new PartTime(50, "����", "����",30 , "2014-05-02", "���ѵ���",25000);
		System.out.println(full[0].toString());
		System.out.println(full[1].toString());
		System.out.println(full[2].toString());
		System.out.println(part[0].toString());
		System.out.println(part[1].toString());

		System.out.println("************Message**********");
		full[0].message();
		full[1].message();
		full[2].message();
		part[0].message();
		part[1].message();
		
		
		
		
	}

}






