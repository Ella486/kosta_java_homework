/**
  �����̸�: �̸���
  ��¥: 22.1.20
  ���� : p.134 5������ �ڵ� - ��øfor�� �̿��ϱ� ������ 4x+5y=60�� ��� �ظ� ���ؼ� (x,y) ���·� ����ϱ� (��, x�� y�� 10������ �ڿ���)
*/

class Exercise05 {

	public static void main(String[] args) {

		System.out.println("----------������ 4x+5y=60�� ��� �ظ� ���ر�-------------");

		for(int x = 1; x<=10; x++){
			for(int y = 1; y<=10; y++){
				if((4*x + 5*y) == 60){
					System.out.println("(" + x + "," + y + ")");

				}
			}
		}

	
	}
}
