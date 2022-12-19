/**
  본인이름: 이명진
  날짜: 22.1.28
  주제 : 6장 클래스 확인문제  19번 답
*/

public class Account {

	static final int MIN_BALANCE = 0; //상수라서 static 붙여야함
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
