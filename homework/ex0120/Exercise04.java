/**
  �����̸�: �̸���
  ��¥: 22.1.20
  ���� : p.134 4������ �ڵ� - while���� Math.random()�޼ҵ� �̿��ϱ�
*/


class Exercise04{

	public static void main(String[] args){

	System.out.println("-----�ֻ��� ���� ��----------" );

		while(true) {
			int i= (int)(Math.random()*6) + 1; // �ֻ��� 1 ~ 6
			int j= (int)(Math.random()*6) + 1; // �ֻ��� 1 ~ 6
			System.out.println("(" + i + "," + j + ")" );
			if((i+j) ==5){
				break;
			}

		}
	}
}
