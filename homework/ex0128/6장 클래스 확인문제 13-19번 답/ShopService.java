/**
  본인이름: 이명진
  날짜: 22.1.28
  주제 : 6장 클래스 확인문제  18번 답
*/


class ShopService {

	private static ShopService singleton = new ShopService();

	private ShopService(){}

	static ShopService getInstance(){
		return singleton;
	}
}
