/**
  �����̸�: �̸���
  ��¥: 22.1.20
  ���� : p.134 3������ �ڵ� - for���� �̿��ؼ� 1~100������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��϶�.
*/


class Exercise03{

	public static void main(String[] args) {
		int sum=0;
		for (int a=1; a<=100; a++){
			if(a%3==0){
				sum += a;
			}
		}
		System.out.print("3�� ����� �� :" + sum);

	}
}
