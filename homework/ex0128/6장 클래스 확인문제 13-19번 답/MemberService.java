/**
  본인이름: 이명진
  날짜: 22.1.28
  주제 : 6장 클래스 확인문제  15번 답
*/

public class MemberService {

	boolean login (String id, String password){
		if (id.equals("hong") && password.equals("12345")){
			return true;
		}else {
			return false;
		}
	}

	void logout (String id){
		System.out.println("로그아웃 되었습니다.");
	}

	
}
