
/**
	��û�� ����� ȭ�� ��� ����ϴ� Ŭ����
*/



class EndView {

	/**
		�������� �޼����� ����ϴ� �޼ҵ�

	*/
	public static void printMessage(String message){
		System.out.println(message);

	}

	/**
		��ü�˻��� ����� ����ϴ� �޼ҵ�
	*/
	public static void printSelectAll(Goods [] goodsArr){
		System.out.println("********��ǰ LIST (" + GoodsService.count+ ") �� *****************");

		//������ּ���
		System.out.println("<��ǰ�ڵ�>");

		for (int i=0; i<GoodsService.count ; i++ ){
				System.out.println(goodsArr[i].getCode() );
		}
		System.out.println("<��ǰ�̸�>");
		for (int i=0; i<GoodsService.count ; i++ ){
				System.out.println(goodsArr[i].getName() );
		}
		System.out.println("<��ǰ����>");
		for (int i=0; i<GoodsService.count ; i++ ){
				System.out.println(goodsArr[i].getPrice() );
		}
		System.out.println("<��ǰ����>");
		for (int i=0; i<GoodsService.count ; i++ ){
				System.out.println(goodsArr[i].getExplain() );
		}

	}
	/**
		��ǰ�ڵ忡 �ش��ϴ� ���� ����ϴ� �޼ҵ�
	*/
	public static void printSelectByCode(Goods goods){
		System.out.println("------------------" + goods.getCode() + "�� �ش��ϴ� ����----------------");
		//�������
			System.out.println("<��ǰ�ڵ�>");

				System.out.println(goods.getCode() );
		System.out.println("<��ǰ�̸�>");
				System.out.println(goods.getName() );
		System.out.println("<��ǰ����>");
				System.out.println(goods.getPrice() );
		System.out.println("<��ǰ����>");
				System.out.println(goods.getExplain() );
		
	}
		
}
