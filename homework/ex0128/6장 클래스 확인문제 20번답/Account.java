/**
  본인이름: 이명진
  날짜: 22.1.28
  주제 : 6장 클래스 확인문제 20번 답
*/

class  Account{

	
	private String ano;
	private String owner;
	private int balance;

	public Account(String ano, String owner, int balance){

		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno(){ 
		return ano;
	}
	public void setAno(String ano){ 
		this.ano = ano;
	}
	public String getOwner(){
		return owner;
	}
	public void setOwner(String owner){
		this.owner = owner;
	}
	public int getBalance(){
		return balance;
	}
	public void setBalance(int balance){
		this.balance = balance;
	}
}
