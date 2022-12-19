package mvc;

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

    Electronics elecArr []; // ��������

    /** 
     * �ܺο��� ��ü �����ȵ�. 
     */
    private ElectronicsService() {
        // ������ �ʱ�ȭ(������ǰ �ʱ�ġ ������) ����.
        elecArr = new Electronics[10]; 

        for(int i=0; i<data.length; i++) {
            elecArr[i] = new Electronics(Integer.parseInt(data[i][0]), data[i][1], Integer.parseInt(data[i][2]), data[i][3]); // ������ �ʱ�ȭ 
            
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
        if(elecArr.length == ElectronicsService.count) {
            return false;
        }
        elecArr[ElectronicsService.count++] = electronics;
        
        return true;
    }

    /**
     * ��ϵ� ��ü ������ǰ �˻� 
     * @return
     */
    public Electronics[] selectAll() {
        return elecArr;
    }

    /**
     * �𵨹�ȣ�� �ش��ϴ� ������ǰ �˻� 
     * @param modelNo
     * @return
     */
    public Electronics searchByModelNo(int modelNo) {
        for(int i=0; i < ElectronicsService.count ; i++) {
            if(elecArr[i].getModelNo() == modelNo ){
                return elecArr[i];
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