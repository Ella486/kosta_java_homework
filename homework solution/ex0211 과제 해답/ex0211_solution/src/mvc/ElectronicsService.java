package mvc;

import java.util.ArrayList;
import java.util.List;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

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

    private static ElectronicsService instance = new ElectronicsService(); 
    private static final int MAX_SIZE=10;
   
    List<Electronics> list = new ArrayList<Electronics>();

    /** 
     * �ܺο��� ��ü �����ȵ�. 
     */
    private ElectronicsService() {
        // ������ �ʱ�ȭ(������ǰ �ʱ�ġ ������) ����.
        for(int i=0; i< data.length; i++) {
            list.add( new Electronics(Integer.parseInt(data[i][0]), data[i][1], Integer.parseInt(data[i][2]), data[i][3]) ); // ������ �ʱ�ȭ 
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
     *
     * @param electronics
     * @return
     */
    public void insert(Electronics electronics) throws ElectronicsArrayBoundsException{
        // �迭�� ���̰� ��������� üũ�ϰ� 
        if(list.size() == ElectronicsService.MAX_SIZE) {//�ִ� 10�������� ��������!!!��� �ó������� �ִٴ� �����Ͽ�...
            throw new ElectronicsArrayBoundsException("�迭�� ���̸� ��� ���̻� ��� �Ҽ� �����ϴ�.");
        }
        
        list.add(electronics);
        
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
    public Electronics searchByModelNo(int modelNo)throws SearchNotFoundException {
       /* for(int i=0; i < list.size() ; i++) {
        	  Electronics elec = list.get(i);
            if(elec.getModelNo() == modelNo ){
                return elec;
            }
        }*/
    	
    	//������ for�κ���
    	for(Electronics elec : list) {
    		if(elec.getModelNo() == modelNo ){
                return elec;
            }
    	}
    	
        
        //ã�� ������ ����!!!
        throw new SearchNotFoundException(modelNo+"�� ���� �𵨹�ȣ�� �˻��Ҽ� �����ϴ�.");
        
    }


    /**
     * �𵨹�ȣ�� �ش��ϴ� ������ǰ �����ϱ� 
     * (���� �����Ѵ�)
     * @param electronics
     * @return
     */
    public void update(Electronics electronics) throws SearchNotFoundException{
		//�μ��� ���޵� �𵨹�ȣ�� �ش��ϴ� ������ǰ�� �ִ��� �˻��Ѵ�.
        Electronics dbElectronics = this.searchByModelNo(electronics.getModelNo());
     
         dbElectronics.setModelDetail( electronics.getModelDetail()  );
         
    }


    
} // Ŭ���� �� 














