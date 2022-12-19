package mvc;

import java.util.ArrayList;
import java.util.List;

import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

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
		List<Electronics> list = service.selectAll();

        EndView.printAll(list);
    }
 

	 /**
     * ������ǰ ��� 
     */
   
    public void insert(Electronics electronics) {
        // ������� �ߺ����θ� üũ�ϰ� �ߺ��� �ƴϸ� ����Ѵ�.
    	try {
          Electronics savedElec = service.searchByModelNo(electronics.getModelNo());
          //�ߺ��̰�
          EndView.printMessage(electronics.getModelNo() + "�� �ߺ��̹Ƿ� ����� �� �����ϴ�.");
          
    	}catch (SearchNotFoundException e) {
			//�ߺ��ƴϹǷ� ������Ѵ�!
    		try {
    		  service.insert(electronics);
    		  EndView.printMessage("��ϵǾ����ϴ�.");
    		}catch (ElectronicsArrayBoundsException ex) {
    			EndView.printMessage(ex.getMessage());
			}
	
		}
    }
    
    

    /**
     * �𵨹�ȣ�� �ش��ϴ� ������ǰ �˻�
     * @param modelNo
     */
    public void searchByModelNo(int modelNo) {
    	try {
		  Electronics electronics = service.searchByModelNo(modelNo);
		 EndView.printSearchByModelNo(electronics);
    	}catch (SearchNotFoundException e) {
    		EndView.printMessage(e.getMessage());
		}
    } 

    /**
     * �𵨹�ȣ�� �ش��ϴ� ������ǰ �����ϱ� 
     * @param electronics
     */
    public void update(Electronics electronics) {
    	try {
    	  service.update(electronics);
    	  EndView.printMessage(electronics.getModelNo() + "�� �ش��ϴ� ��ǰ ������ �����Ǿ����ϴ�.");
    	}catch (SearchNotFoundException e) {
    		EndView.printMessage("�������� �ʾҽ��ϴ�.");
		}
    }
    
}











