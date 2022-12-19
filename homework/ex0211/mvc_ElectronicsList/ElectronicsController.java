package mvc_ElectronicsList;

import java.util.List;

/**
 * View�� Model ���̿��� �߰� ���� 
 *  : ������� ��û�� �޾Ƽ� �׿� �ش��ϴ� ���񽺸� ȣ���ϰ�
 *    ȣ���� ����� �޾Ƽ� ������� ���� ��� �並 ȣ�����ش�.
 */

class ElectronicsController {
    private ElectronicsService service = ElectronicsService.getInstance(); // null 

    /**
     * ��ü�˻�
     */
    public void selectAll() {
		// Electronics[] elecArr = service.selectAll();
    	List<Electronics> list = service.selectAll();

        EndView.printAll(list);
    }
 

	 /**
     * ������ǰ ��� 
     */
   
    public void insert(Electronics electronics) {
        // ������� �ߺ����θ� üũ�ϰ� �ߺ��� �ƴϸ� ����Ѵ�.
        Electronics savedElec = service.searchByModelNo(electronics.getModelNo());
        if(savedElec==null) {
            if(service.insert(electronics)) {
                EndView.printMessage("��ϵǾ����ϴ�.");
            }
            else {//�������(������ ������ �ǹ��� ���� ����.
            
                EndView.printMessage("��ϵ����ʾҽ��ϴ�.");
            }
        }
        else {
            EndView.printMessage(electronics.getModelNo() + "�� �ߺ��̹Ƿ� ����� �� �����ϴ�.");
        }

    }

    /**
     * �𵨹�ȣ�� �ش��ϴ� ������ǰ �˻�
     * @param modelNo
     */
    public void searchByModelNo(int modelNo) {
		Electronics electronics = service.searchByModelNo(modelNo);
        if(electronics==null){
            EndView.printMessage(modelNo+"�� ���� �𵨹�ȣ�� �˻��Ҽ� �����ϴ�.");
		}else{
           EndView.printSearchByModelNo(electronics);
		}
    } 

    /**
     * �𵨹�ȣ�� �ش��ϴ� ������ǰ �����ϱ� 
     * @param electronics
     */
    public void update(Electronics electronics) {
        boolean result = service.update(electronics);
        if(result) {
            EndView.printMessage(electronics.getModelNo() + "�� �ش��ϴ� ��ǰ ������ �����Ǿ����ϴ�.");
        }
        else {
            EndView.printMessage("�������� �ʾҽ��ϴ�.");
        }

    }

    
}
