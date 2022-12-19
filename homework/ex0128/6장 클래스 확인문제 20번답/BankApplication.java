/**
  본인이름: 이명진
  날짜: 22.1.28
  주제 : 6장 클래스 확인문제 20번 답
*/
import java.util.Scanner;

class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run){
			System.out.println("---------------------------------------------------------");
			System.out.println(" 1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택>");

			int selectNO = scanner.nextInt();

			if (selectNO == 1){
				createAccount(); //메소드의 static이 붙어있고 같은 클래스 안에 있어서 객체생성 없이 메소드이름(); 호출 가능
			}else if(selectNO == 2){
				accountList();
			}else if(selectNO == 3){
				deposite();
			}else if(selectNO == 4){
				withdraw();
			}else if(selectNO == 5){
				run = false;
			}
		}//while문 끝
		System.out.print("프로그램 종료");
	}//메인끝

	//계좌생성하기
	private static void createAccount(){
		//작성위치
		System.out.println("----------");
		System.out.println(" 계좌생성 ");
		System.out.println("----------");

		System.out.print("계좌번호: ");
			String ano = scanner.next();

		System.out.print("계좌주: ");
			String owner = scanner.next();

		System.out.print("초기입금액: ");
			int balance = scanner.nextInt();

		Account account = new Account(ano, owner, balance);

		for (int i =0 ; i< accountArray.length ; i++ ){
			if(accountArray[i] == null){
				accountArray[i] = account;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}	
	}

	//계좌목록보기
	private static void accountList(){
		//작성위치
		System.out.println("----------");
		System.out.println(" 계좌목록 ");
		System.out.println("----------");

		for (int i =0 ; i< accountArray.length ; i++ ){
			Account account = accountArray[i];

			if(account != null){
				System.out.print(account.getAno() + "\t"); 
				System.out.print(account.getOwner() + "\t");
				System.out.print(account.getBalance() + "\t");
				System.out.println();
			}
		}
	}

	//예금하기
	private static void deposite(){
		//작성위치
		System.out.println("----------");
		System.out.println(" 예금 ");
		System.out.println("----------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();

		System.out.print("예금액: ");
		int balance = scanner.nextInt();

		Account account = findAccount(ano);

		if(account == null){
			System.out.println("결과: 계좌가 존재하지 않습니다.");
			return;
		}

		account.setBalance(account.getBalance() + balance);
		System.out.println("결과: 예금이 성공되었습니다.");
	}

	//출금하기
	private static void withdraw(){
		//작성위치
		System.out.println("----------");
		System.out.println(" 출금 ");
		System.out.println("----------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();

		System.out.print("출금액: ");
		int balance = scanner.nextInt();

		Account account = findAccount(ano);

		if(account == null){
			System.out.println("결과: 계좌가 존재하지 않습니다.");
			return;
		}

		if(account.getBalance() < balance){
			System.out.println("예금액보다 많은 금액을 출금할 수 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - balance);
		System.out.println("결과: 출금이 성공되었습니다.");
	}

	//배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano){
		//작성위치
		Account account = null;
		for(int i =0; i< accountArray.length; i++){
			if(accountArray[i] != null){
				if(accountArray[i].getAno().equals(ano)){
				account = accountArray[i];
				break;
				}
			}
		}
		return account;
	}
	
}//클래스 끝
