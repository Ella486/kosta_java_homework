/**
  �����̸�: �̸���
  ��¥: 22.1.28
  ���� : 6�� Ŭ���� Ȯ�ι���  18�� ��
*/


class ShopService {

	private static ShopService singleton = new ShopService();

	private ShopService(){}

	static ShopService getInstance(){
		return singleton;
	}
}
