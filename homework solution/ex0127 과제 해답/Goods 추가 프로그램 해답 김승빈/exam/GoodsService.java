public class GoodsService {

    private Goods[] goodsArray = new Goods[10];
    public static int count = 0; // 배열에 Goods 가 저장된 개수

    public GoodsService(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            goodsArray[i] = createGoods(data[i]);
            count++;
        }
    }

    /**
     * Goods 를 생성해 리턴
     *
     * @param row 하나의 데이터 행
     */
    private Goods createGoods(String[] row) {

        return new Goods(row[0], row[1],
                Integer.parseInt(row[2]), row[3]);
    }

    /**
     * 상품 등록하기
     *
     * @param goods 상품
     * @return 0: 상품코드 중복, 1: 등록 성공, -1: 배열 길이 초과
     */
    public int insert(Goods goods) {

        if (goodsArray.length == count) {
            return -1;
        }
        // 중복체크
        if (selectByCode(goods.getCode()) != null) {
            return 0;
        }
        goodsArray[count++] = goods;
        // 등록
        return 1;
    }

    /**
     * 모든 상품들을 반환
     *
     * @return 모든 상품목록들
     */
    public Goods[] selectAll() {

        return goodsArray;
    }

    /**
     * 상품 코드값으로 찾기
     *
     * @param code 상품의 코드
     * @return 코드에 해당하는 상품
     */
    public Goods selectByCode(String code) {

        for (int i = 0; i < count; i++) {
            Goods goods = goodsArray[i];
            if (goods.getCode().equals(code)) {
                return goods;
            }
        }
        return null;
    }

    /**
     * 상품 가격, 설명정보 수정
     *
     * @param goods 수정할 상품정보
     * @return false: 코드 중복, true: 수정 성공
     */
    public boolean update(Goods goods) {

        Goods foundGoods = selectByCode(goods.getCode());
        if (foundGoods == null) {
            return false;
        }
        foundGoods.setPrice(goods.getPrice());
        foundGoods.setExplain(goods.getExplain());
        return true;
    }


    /**
     * 항목을 오름차순 정렬
     *
     * @param by 정렬 기준이 될 필드명. 코드 or 이름 or 가격
     * @return 기준 필드로 오름차순 정렬된 배열. 기준이 잘못되었다면 null
     */
    public Goods[] selectAllSortBy(String by) { //코드, 이름, 가격

        //Goods[] goods = selectAll();
        switch (by) {
            case "코드":
            case "이름":
            case "가격":
                sortByAscending( by);
                break;
            default:
                return null;
        }
        return goodsArray;
    }


    /**
	    String 객체 안에 있는  int re = .compareTo(String s)  메소드
		  : 두개의 문자열을 비교한다. : 어떤 문자가 순서로 앞에 오는지 리턴해주는 메소드 

		      리턴값 :   0    : 두문자열이 같다.
			            양수 :  호출하는 객체가 인자보다 순서 앞에 있을때 : 
						음수 :  인수가 객체보다 순서 앞에 있을때 

	*/

    private void sortByAscending( String by) {

        // 선택정렬
        for (int i = 0; i < GoodsService.count; i++) {
            int minIndex = i;
            for (int j = i + 1; j < GoodsService.count; j++) {

                if (by.equals("코드")) {
                    String selected = goodsArray[j].getCode();
                    if (goodsArray[minIndex].getCode().compareTo(selected) > 0) { //양수니
                        minIndex = j;
                    }
                } else if (by.equals("이름")) {
                    String selected = goodsArray[j].getName();
                    if (goodsArray[minIndex].getName().compareTo(selected) > 0) { //양수니 
                        minIndex = j;
                    }
                } else {
                    int selected = goodsArray[j].getPrice();
                    if (selected < goodsArray[minIndex].getPrice()) {
                        minIndex = j;
                    }
                }

            }

            swapGoods(i, minIndex);
        }
    }





    private void swapGoods(int i, int j) {

        Goods tmp = goodsArray[i];
        goodsArray[i] = goodsArray[j];
        goodsArray[j] = tmp;
    }

	/**
     * 상품 지우기
     *
     * @param code 지울 상품코드
     * @return 성공시 true, 실패시 false
     */
    public boolean deleteByCode(String code) {
       
        for (int i = 0; i < count; i++) {
            Goods goods = goodsArray[i];
            if (goods.getCode().equals(code)) { //삭제하려는 상품을 찾아서 같으면 
                int j = i;
                for (; j < count - 1; j++) { // 앞으로 한칸씩
                    goodsArray[j] = goodsArray[j + 1];
                }

                goodsArray[j] = null;
                count--; //삭제가 되면 저장된 객체의 수를 감소한다.
                return true;
            }
        }
        return false;
    }

}
