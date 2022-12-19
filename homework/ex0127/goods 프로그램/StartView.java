/**
  본인이름: 이명진
  날짜: 22.1.26
  주제 : 배열실습예제(상품 프로그램)
*/

class StartView {
	public static void main(String[] args) {

		String [] [] data = new String [][]{
			{"A1", "새우깡", "2500", "짜고 맛나다"}, //-----> Goods의 객체에 담기
			{"A2", "콘칩", "1500", "고소하다"},
			{"A3", "허니버터칩", "3500", "달고 짜고 맛나다"},
			{"A4", "감자깡", "1800", "감자의 맛"},
			{"A5", "고구마깡", "3000", "고구마의 맛"},

		};



		System.out.println("상품관리 프로그램 시작합니다.\n");
		new MenuView().printMenu(data);

		
	}
}
