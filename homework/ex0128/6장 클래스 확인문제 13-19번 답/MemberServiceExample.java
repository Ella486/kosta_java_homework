/**
  본인이름: 이명진
  날짜: 22.1.28
  주제 : 6장 클래스 확인문제  15번 답
*/

class MemberServiceExample {

	public static void main(String[] args) {

		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");

		if(result){
			System.out.println("로그인 되었습니다");
			memberService.logout("hong");
		}else{
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
