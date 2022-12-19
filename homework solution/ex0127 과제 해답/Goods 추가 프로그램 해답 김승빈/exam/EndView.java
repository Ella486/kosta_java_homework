public class EndView {

    /**
     * �������� ���
     */
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printSelectedAll(Goods[] goodsArray) {
        System.out.println("========== ��ǰ LIST ( " + GoodsService.count + " )�� ==========");
        for (int i = 0; i < GoodsService.count; i++) {
            Goods goods = goodsArray[i];
            System.out.println("�� ǰ �� ��: " + goods.getCode());
            System.out.println("�� ǰ �� ��: " + goods.getName());
            System.out.println("�� ǰ �� ��: " + goods.getPrice());
            System.out.println("�� ǰ �� ��: " + goods.getExplain());
            System.out.println("--------------------------------------");
        }
    }

    public static void printSelectedByCode(Goods goods) {
        System.out.println("========== " + goods.getCode() + " �� �ش��ϴ� ���� ==========");
        System.out.println("�� ǰ �� ��: " + goods.getCode());
        System.out.println("�� ǰ �� ��: " + goods.getName());
        System.out.println("�� ǰ �� ��: " + goods.getPrice());
        System.out.println("�� ǰ �� ��: " + goods.getExplain());
    }

}
