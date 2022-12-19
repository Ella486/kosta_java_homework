public class EndView {

    /**
     * 성공여부 출력
     */
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printSelectedAll(Goods[] goodsArray) {
        System.out.println("========== 상품 LIST ( " + GoodsService.count + " )개 ==========");
        for (int i = 0; i < GoodsService.count; i++) {
            Goods goods = goodsArray[i];
            System.out.println("상 품 코 드: " + goods.getCode());
            System.out.println("상 품 이 름: " + goods.getName());
            System.out.println("상 품 가 격: " + goods.getPrice());
            System.out.println("상 품 설 명: " + goods.getExplain());
            System.out.println("--------------------------------------");
        }
    }

    public static void printSelectedByCode(Goods goods) {
        System.out.println("========== " + goods.getCode() + " 에 해당하는 정보 ==========");
        System.out.println("상 품 코 드: " + goods.getCode());
        System.out.println("상 품 이 름: " + goods.getName());
        System.out.println("상 품 가 격: " + goods.getPrice());
        System.out.println("상 품 설 명: " + goods.getExplain());
    }

}
