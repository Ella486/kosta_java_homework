/**
  �����̸�: �̸���
  ��¥: 22.1.28
  ���� : 6�� Ŭ���� Ȯ�ι���  19�� ��
*/

public class Account {

	static final int MIN_BALANCE = 0; //����� static �ٿ�����
	static final int MAX_BALANCE = 1000000;
	private int balance;


	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance){
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE){
			this.balance = balance;
		}	 
	}
}
