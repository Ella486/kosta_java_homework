/**
  �����̸�: �̸���
  ��¥: 22.1.28
  ���� : 6�� Ŭ���� Ȯ�ι���  18�� ��
*/

class ShopServiceExample {

	public static void main(String[] args) {

		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		if(obj1 == obj2){
			System.out.println("���� ShopService ��ü �Դϴ�.");
		}else{
			System.out.println("�ٸ� ShopService ��ü �Դϴ�.");
		}
	}
}
