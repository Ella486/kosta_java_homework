/**
  �����̸�: �̸���
  ��¥: 22.1.26
  ���� : �迭�ǽ�����(��ǰ ���α׷�)
*/



/**
	��û�� ����� ȭ�� ��� ����ϴ� Ŭ����
*/



class EndView {

	/**
		�������� �޼����� ����ϴ� �޼ҵ�

	*/
	public static void printMessage(String message){
		System.out.println(message +"\t");

	}

	/**
		��ü�˻��� ����� ����ϴ� �޼ҵ�
	*/
	public static void printSelectAll(Goods [] goodsArr){//
		System.out.println("********��ǰ LIST (" + GoodsService.count+ ") �� *****************");

		//������ּ���
		
		for (int i=0; i<GoodsService.count ; i++ ){
				System.out.print(goodsArr[i].getCode() + " | ");
				System.out.print(goodsArr[i].getName() + " | ");
				System.out.print(goodsArr[i].getPrice() + " | ");
				System.out.print(goodsArr[i].getExplain() + " \n ");
		}
		
	}
	/**
		��ǰ�ڵ忡 �ش��ϴ� ���� ����ϴ� �޼ҵ�
	*/
	public static void printSelectByCode(Goods goods){
		System.out.println("------------------" + goods.getCode() + "�� �ش��ϴ� ����----------------");
		//�������
			System.out.print(goods.getCode() + " | ");
			System.out.print(goods.getName() + " | ");
			System.out.print(goods.getPrice() + " | ");
			System.out.print(goods.getExplain() + " \n ");
	}

	public static void printSelectByName(Goods goods){
		System.out.println("------------------" + goods.getName() + "�� �ش��ϴ� ����----------------");
		//�������
			System.out.print(goods.getCode() + " | ");
			System.out.print(goods.getName() + " | ");
			System.out.print(goods.getPrice() + " | ");
			System.out.print(goods.getExplain() + " \n ");
	}
		
}
