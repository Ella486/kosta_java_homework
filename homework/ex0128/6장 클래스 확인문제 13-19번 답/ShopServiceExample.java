/**
  본인이름: 이명진
  날짜: 22.1.28
  주제 : 6장 클래스 확인문제  18번 답
*/

class ShopServiceExample {

	public static void main(String[] args) {

		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		if(obj1 == obj2){
			System.out.println("같은 ShopService 객체 입니다.");
		}else{
			System.out.println("다른 ShopService 객체 입니다.");
		}
	}
}
