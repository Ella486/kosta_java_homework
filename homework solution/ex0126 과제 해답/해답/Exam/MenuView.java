/**
  본인이름: 이명진
  날짜: 22.1.26
  주제 : 배열실습예제(상품 프로그램)
*/

import java.util.Scanner;
/**
	키보드 입력을 받아 각 기능을 호출해주는 객체
*/

class MenuView {
	private Scanner sc = new Scanner(System.in);
	private GoodsService service = new GoodsService();
	/**
	메뉴를 출력해줄 메소드
	*/

	public void printMenu( String [][] data){//메인에서 전달된 주소값
		//
		service.init(data);

		while (true){
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("1. 등록   2. 전체검색   3. 상품코드검색   4.상품이름검색   5. 수정하기   9.종류");
			System.out.println("--------------------------------------------------------------------------------");

			System.out.print("메뉴 선택> ");
				int menuChoice = Integer.parseInt(sc.nextLine());
				switch(menuChoice){
					case 1:// 키보드 입력 4개 받아서 하나의 Goods 만들어서 서비스의 inset 전달
						this.inputInsert();

					break;

					case 2:
						Goods [] goodsArr = service.selectAll();
						EndView.printSelectAll(goodsArr);

					break;

					case 3:
						this.inputSelect();

					break;

					case 4:
						this.inputSelect2();

					break;

					case 5:
						this.inputUpdate();
					break;

					case 9:
						System.out.println("다음에 또 이용해주세요. 프로그램 종료합니다");
						System.exit(0);//프로그램 종료

					break;

					default :
						System.out.println("메뉴는 1~4 or 9 입력해주세요");


				}//switch문 끝


		}//while문 끝
	
	}//메소드 끝
	////////////////////////////////////////////////////////////////////////
	/**
		등록을 위한 키보드 입력
	*/
	public void inputInsert(){// 키보드입력 4개 받아서 하나의 Goods 만들어서 서비스의 insert 전달
		System.out.print("상품코드>");
		String code = sc.nextLine();

		System.out.print("상품이름>");
		String name = sc.nextLine();

		System.out.print("상품가격>");
		int price = Integer.parseInt(sc.nextLine());

		System.out.print("상품설명>");
		String explain = sc.nextLine();

		Goods goods = new Goods(); //맴버필드 호출
		goods.setCode(code);
		goods.setName(name);
		goods.setPrice(price);
		goods.setExplain(explain);

		// 위 4개의 정보를 가지고 service로 이동
		int result = service.insert(goods);
		if(result==0){
			EndView.printMessage( code + "는 중복이므로 등록 할 수 없습니다.");
		}else if(result==-1){
			EndView.printMessage( "배열의 길이가 벗어나 더이상 등록 할 수 없습니다.");
		}else {
			EndView.printMessage( "등록되었습니다.");
		}
	

	}

	/**
		상품검색을 위한 키보드 입력
	*/
	public void inputSelect(){
		System.out.print("검색할 상품코드>");
		String code = sc.nextLine();

		Goods goods = service.selectByCode(code);//호출
		if(goods == null){
			EndView.printMessage(code + "는 없는 정보이므로 검색할 수 없습니다.");
		}else{
			EndView.printSelectByCode(goods);
		}

	}

	public void inputSelect2(){
		System.out.print("검색할 상품이름>");
		String name = sc.nextLine();

		Goods goods = service.selectByName(name);//호출
		if(goods == null){
			EndView.printMessage(name + "는 없는 정보이므로 검색할 수 없습니다.");
		}else{
			EndView.printSelectByName(goods);
		}

	}
	/**
		수정을 위한 키보드 입력
	*/
	public void inputUpdate(){
		//키보드입력 3개 받기
		System.out.print("수정하려는 상품코드 >");
		String code = sc.nextLine();

		System.out.print("변경할 상품가격 >");
		int price = Integer.parseInt(sc.nextLine());

		System.out.print("변경할 상품설명 >");
		String explain = sc.nextLine();


		Goods goods = new Goods(); //맴버필드 호출
		goods.setCode(code);
		goods.setPrice(price);
		goods.setExplain(explain);

		//생성된 goods를 가지고 서비스로 이동한다.(호출한다.)
		boolean result = service.update(goods);
		if(result){
			EndView.printMessage(code + " 에 해당하는 상품의 정보가 수정되었습니다.");
		}else{
			EndView.printMessage("수정되지 않았습니다");
		}
			

			
			
		
	}

}//클래스 끝
