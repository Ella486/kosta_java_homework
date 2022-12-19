public class GoodsService {

    private Goods[] goodsArray = new Goods[10];
    public static int count = 0; // �迭�� Goods �� ����� ����

    public GoodsService(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            goodsArray[i] = createGoods(data[i]);
            count++;
        }
    }

    /**
     * Goods �� ������ ����
     *
     * @param row �ϳ��� ������ ��
     */
    private Goods createGoods(String[] row) {

        return new Goods(row[0], row[1],
                Integer.parseInt(row[2]), row[3]);
    }

    /**
     * ��ǰ ����ϱ�
     *
     * @param goods ��ǰ
     * @return 0: ��ǰ�ڵ� �ߺ�, 1: ��� ����, -1: �迭 ���� �ʰ�
     */
    public int insert(Goods goods) {

        if (goodsArray.length == count) {
            return -1;
        }
        // �ߺ�üũ
        if (selectByCode(goods.getCode()) != null) {
            return 0;
        }
        goodsArray[count++] = goods;
        // ���
        return 1;
    }

    /**
     * ��� ��ǰ���� ��ȯ
     *
     * @return ��� ��ǰ��ϵ�
     */
    public Goods[] selectAll() {

        return goodsArray;
    }

    /**
     * ��ǰ �ڵ尪���� ã��
     *
     * @param code ��ǰ�� �ڵ�
     * @return �ڵ忡 �ش��ϴ� ��ǰ
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
     * ��ǰ ����, �������� ����
     *
     * @param goods ������ ��ǰ����
     * @return false: �ڵ� �ߺ�, true: ���� ����
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
     * �׸��� �������� ����
     *
     * @param by ���� ������ �� �ʵ��. �ڵ� or �̸� or ����
     * @return ���� �ʵ�� �������� ���ĵ� �迭. ������ �߸��Ǿ��ٸ� null
     */
    public Goods[] selectAllSortBy(String by) { //�ڵ�, �̸�, ����

        //Goods[] goods = selectAll();
        switch (by) {
            case "�ڵ�":
            case "�̸�":
            case "����":
                sortByAscending( by);
                break;
            default:
                return null;
        }
        return goodsArray;
    }


    /**
	    String ��ü �ȿ� �ִ�  int re = .compareTo(String s)  �޼ҵ�
		  : �ΰ��� ���ڿ��� ���Ѵ�. : � ���ڰ� ������ �տ� ������ �������ִ� �޼ҵ� 

		      ���ϰ� :   0    : �ι��ڿ��� ����.
			            ��� :  ȣ���ϴ� ��ü�� ���ں��� ���� �տ� ������ : 
						���� :  �μ��� ��ü���� ���� �տ� ������ 

	*/

    private void sortByAscending( String by) {

        // ��������
        for (int i = 0; i < GoodsService.count; i++) {
            int minIndex = i;
            for (int j = i + 1; j < GoodsService.count; j++) {

                if (by.equals("�ڵ�")) {
                    String selected = goodsArray[j].getCode();
                    if (goodsArray[minIndex].getCode().compareTo(selected) > 0) { //�����
                        minIndex = j;
                    }
                } else if (by.equals("�̸�")) {
                    String selected = goodsArray[j].getName();
                    if (goodsArray[minIndex].getName().compareTo(selected) > 0) { //����� 
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
     * ��ǰ �����
     *
     * @param code ���� ��ǰ�ڵ�
     * @return ������ true, ���н� false
     */
    public boolean deleteByCode(String code) {
       
        for (int i = 0; i < count; i++) {
            Goods goods = goodsArray[i];
            if (goods.getCode().equals(code)) { //�����Ϸ��� ��ǰ�� ã�Ƽ� ������ 
                int j = i;
                for (; j < count - 1; j++) { // ������ ��ĭ��
                    goodsArray[j] = goodsArray[j + 1];
                }

                goodsArray[j] = null;
                count--; //������ �Ǹ� ����� ��ü�� ���� �����Ѵ�.
                return true;
            }
        }
        return false;
    }

}
