package mvc_ElectronicsList;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ǰ�� ���õ� ����� ����� Ŭ����
 */

class ElectronicsService {
    String [][] data = new String [][]{
		{"100","��ǳ��","35000","�Ｚ ��ǳ��"},
		{"200","���ڷ���","55000","�� ��������.."},
		{"300","������","5500000","��ǳ ������ �ʹ� �ÿ���"},
		{"400","�����","800000","LG �����"},
		{"500","����̱�","9000","LG ����̱�"}
	}; // ������ �ʱ�ġ �����͸� �غ�!! electronics�� ���� 

	
    private static ElectronicsService instance = new ElectronicsService(); // 16��°�ٷΰ� 

    public static int count; // �迭�濡 ����� ������ǰ�� ������ üũ!!

    //Electronics elecArr []; // ��������
    
    private List<Electronics> list = new ArrayList<Electronics>();

    /** 
     * �ܺο��� ��ü �����ȵ�. 
     */
    private ElectronicsService() {
        // ������ �ʱ�ȭ(������ǰ �ʱ�ġ ������) ����.
        //elecArr = new Electronics[10]; 
    	
        for(int i=0; i<data.length; i++) {
        	list.add(new Electronics(Integer.parseInt(data[i][0]), data[i][1], Integer.parseInt(data[i][2]), data[i][3])); // ������ �ʱ�ȭ 
            ElectronicsService.count++;
        }
      
    }

    /**
     * ���� ��ü�� �������ش�.
     * @return
     */
    public static ElectronicsService getInstance() {

        return instance;
    }

    /**
     * ������ǰ ���
     * return : true�̸� ��ϼ���, false�̸� ��Ͻ��� 
     * @param electronics
     * @return
     */
    public boolean insert(Electronics electronics) {

        // �迭�� ���̰� ��������� üũ�ϰ� 
    	System.out.println("size"+list.size()+" / count"+ ElectronicsService.count);
        if(list.size() == 10) {
        	//System.out.println("������ ������ �����ϴ�.");
            return false;
        }else {
	        list.add(electronics);
	        ElectronicsService.count++;
	        return true;
        }
        
    }

    /**
     * ��ϵ� ��ü ������ǰ �˻� 
     * @return
     */
    public List<Electronics> selectAll() {
        return list;
    }

    /**
     * �𵨹�ȣ�� �ش��ϴ� ������ǰ �˻� 
     * @param modelNo
     * @return
     */
    public Electronics searchByModelNo(int modelNo) {
        for(int i=0; i < ElectronicsService.count ; i++) {
            if(list.get(i).getModelNo() == modelNo ){
                return list.get(i);
            }
        }

        return null ;
    }


    /**
     * �𵨹�ȣ�� �ش��ϴ� ������ǰ �����ϱ� 
     * (���� �����Ѵ�)
     * @param electronics
     * @return
     */
    public boolean update(Electronics electronics) {
		//�μ��� ���޵� �𵨹�ȣ�� �ش��ϴ� ������ǰ�� �ִ��� �˻��Ѵ�.
        Electronics dbElectronics = this.searchByModelNo(electronics.getModelNo());

        if(dbElectronics != null) { //ã�Ҵ�!
            dbElectronics.setModelDetail( electronics.getModelDetail()  );
            return true;
        }

        return false;
    }


    
} // Ŭ���� �� 