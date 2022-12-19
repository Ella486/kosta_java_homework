/**
	View�� Model ���̿��� �߰�����.
	: ������� ��û�� �޾Ƽ� �׿� �ش��ϴ� ���񽺸� ȣ���ϰ�
	  ȣ���� ����� �޾Ƽ� ��� ���� ���� ��� �並 ȣ�����ش�.
*/

class ElectronicsController {

	private ElectronicsService service = ElectronicsService.getInstance() ; //�̱����̶� �ܺο��� ��ü�� ��� ����� getInstance()�޼ҵ� ȣ��
	private Electronics [] elecArr = new Electronics [10];

	/**
		������ǰ ���
	*/
	public void insert (Electronics electronics){
		//������� �ߺ����θ� üũ�ϰ� �ߺ��ƴϸ� ����Ѵ�.
		Electronics savedElec = service.searchByModelNo(electronics.getModelNo());
		 if(savedElec == null){ //�ߺ��ƴϴ�.
		 if( service.insert(electronics)  ){
             EndView.printMessage("��ϵǾ����ϴ�.");  
		 }else{
             EndView.printMessage("��ϵ��� �ʾҽ��ϴ�.");
		 }

	  }else{
         EndView.printMessage(electronics.getModelNo()+"�� �ߺ��̹Ƿ� ����Ҽ� �����ϴ�.");
	  }

	}

	/**
		��ü�˻�
	*/
	public void selectAll(){

		Electronics[] elecArr = service.selectAll(); // service.selectAll()�� ��ü Ÿ��: Electronics[]
		EndView.printAll(elecArr);
		//System.out.println("elecArr" + elecArr); <----������ǰ �迭�� �ּҰ�

	}

	/**
		�𵨹�ȣ�� �ش��ϴ� ������ǰ �˻�
	*/
	public void searchByModelNo(int modelNo){

		Electronics electronics = service.searchByModelNo(modelNo);//ȣ��
		if(electronics == null){
			EndView.printMessage(modelNo + "�� ���� �����̹Ƿ� �˻��� �� �����ϴ�.");
		}else{
			EndView.printSearchByModelNo(electronics);
			
		}
	         
	}

	/**
		�𵨹�ȣ�� �ش��ϴ� ������ǰ �����ϱ�
	*/
	public void update(Electronics electronics){

		
		//������ electronics�� ������ ���񽺷� �̵��Ѵ�.(ȣ���Ѵ�.)
		boolean result = service.update(electronics);
		if(result){
			EndView.printMessage(electronics.getModelNo() + " �� �ش��ϴ� ��ǰ�� ������ �����Ǿ����ϴ�.");
		}else{
			EndView.printMessage("�����ϴ� �𵨹�ȣ�� �ƴϹǷ� �������� �ʾҽ��ϴ�");
		}

	}
	/**
		�𵨹�ȣ�� �ش��ϴ� ������ǰ �����ϱ�
	*/
	public void forDelete(int modelNo){
		
		if (service.deleteByModelNo(modelNo)) {
            EndView.printMessage("�����Ǿ����ϴ�.");
        } else {
            EndView.printMessage("���� �𵨹�ȣ�Դϴ�.");
        }

	}
	
	/**�����ϱ�*/
	public void forSort(String by) {

		Electronics[] electronics = service.selectAllSortBy(by);
        if (electronics == null) {
            EndView.printMessage("���� ����(" + by + ")�� �ùٸ��� ���� �Է��Դϴ�.");
        } else {
            EndView.printAll(electronics);//�������� ���� ���°���
        }

	}

}//Ŭ���� ��
