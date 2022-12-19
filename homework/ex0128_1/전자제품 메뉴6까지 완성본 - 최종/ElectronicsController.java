/**
	View�� Model ���̿��� �߰�����.
	: ������� ��û�� �޾Ƽ� �׿� �ش��ϴ� ���񽺸� ȣ���ϰ�
	  ȣ���� ����� �޾Ƽ� ��� ���� ���� ��� �並 ȣ�����ش�.
*/

class ElectronicsController {

	private ElectronicsService service = ElectronicsService.getInstance() ;
	private Electronics [] elecArr = new Electronics [10];

	/**
		������ǰ ���
	*/
	public void insert (Electronics electronics){
		//������� �ߺ����θ� üũ�ϰ� �ߺ��ƴϸ� ����Ѵ�.
		Electronics savedElec = service.searchByModelNo(electronics.getModelNo());
		 if(savedElec == null){ //�ߺ��ƴϴ�.
		 if(  service.insert(electronics)  ){
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

		Electronics[] elecArr = service.selectAll();
		EndView.printAll(elecArr);
		

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

		Electronics elec = service.searchByModelNo(electronics.getModelNo()); //�ɹ��ʵ� ȣ��
		elec.setModelDetail(electronics.getModelDetail());

		//������ electronics�� ������ ���񽺷� �̵��Ѵ�.(ȣ���Ѵ�.)
		boolean result = service.update(elec);
		if(result){
			EndView.printMessage(electronics.getModelNo() + " �� �ش��ϴ� ��ǰ�� ������ �����Ǿ����ϴ�.");
		}else{
			EndView.printMessage("�������� �ʾҽ��ϴ�");
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
