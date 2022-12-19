/**
	����� ��û�� �ش��ϴ� ����� ����Ϳ� ����ϴ� Ŭ����
*/

class EndView {

	/**
		���޵� �迭�� ���(��ü �˻� ���)
	*/

	public static void printAll(Electronics[] elecArr){

		System.out.println("********��ǰ LIST (" + ElectronicsService.count+ ") �� *****************");

		//������ּ���
		
		for (int i=0; i<ElectronicsService.count ; i++ ){
				System.out.print(elecArr[i].getModelNo() + " | ");
				System.out.print(elecArr[i].getModelName() + " | ");
				System.out.print(elecArr[i].getModelPrice() + " | ");
				System.out.print(elecArr[i].getModelDetail() + " \n ");
		}


	}
	
	/**
		�𵨹�ȣ�� �ش��ϴ� ������ǰ ���
	*/

	public static void printSearchByModelNo(Electronics electronics){
		System.out.println("--------"+electronics.getModelNo() +"�� �ش��ϴ� ����--------------");
	   //���� ������ּ���
	   System.out.print( electronics.getModelNo() +" | ");
	   System.out.print( electronics.getModelName() +" | ");
	   System.out.print( electronics.getModelPrice() +" | ");
	   System.out.print( electronics.getModelDetail() +"\n");


	}

	/**
	�������ο� ���õ� �޼��� ���
	*/

	public static void printMessage(String message){
		System.out.println(message+"\n");

	}


}
