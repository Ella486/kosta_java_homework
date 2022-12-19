/** 
	������ǰ�� ���õ� ����� ����� Ŭ����
*/

class ElectronicsService {
	public static int count = 0; //�迭 �濡 ����� ��ǰ�� ������ üũ!
	String [][] data = new String [][]{//������ �ʱ�ġ �����͸� �غ�
		{"200","��ǳ��","35000","�Ｚ ��ǳ��"},
		{"500","���ڷ���","55000","�� ��������.."},
		{"300","������","5500000","��ǳ ������ �ʹ� �ÿ���"},
		{"100","�����","800000","LG �����"},
		{"400","����̱�","9000","LG ����̱�"}
	}; 

	private static ElectronicsService instance = new ElectronicsService();

	Electronics elecArr [] ;

	
	/**
    �ܺο��� ��ü �����ȵ�.
	*/
	private ElectronicsService(){
		//������ �ʱ�ȭ(������ǰ �ʱ�ġ ������)����.
		elecArr = new Electronics[10];

		for (int i=0 ; i< data.length ; i++ ){
			elecArr[i] = 
				new Electronics(Integer.parseInt(data[i][0]), data[i][1], Integer.parseInt(data[i][2]),data[i][3]);//������ �ʱ�ȭ

			ElectronicsService.count++;
		}

		/*System.out.println("------------------------");
		for (int i=0 ; i< ElectronicsService.count ; i++){
			System.out.println( elecArr[i] + "|" + elecArr[i].getModelNo() + "|"+ elecArr[i].getModelName());

		}
		System.out.println("------------------------"); */

	}
	/**
		���� ��ü�� ����
	*/
	public static ElectronicsService getInstance(){


		return instance;
	}
	
	/**
		������ǰ ���
		return : true�̸� ��ϼ���, false�̸� ��Ͻ���
	*/
	public boolean insert (Electronics electronics){
		if(elecArr.length == ElectronicsService.count){
		return false;
		}
		elecArr[ElectronicsService.count++] = electronics;

		return true;
	}

	/**
		��ϵ� ��ü ������ǰ �˻�
	*/

	public Electronics [] selectAll(){

		return elecArr;


	}

	/**
		�𵨹�ȣ�� �ش��ϴ� ������ǰ �˻�
	*/

	public Electronics searchByModelNo(int modelNo){
		for (int i=0 ;i< ElectronicsService.count ; i++){
				Electronics electronics = elecArr[i];
				if (electronics.getModelNo() == modelNo){ //������ ã�Ҵ� �ִ�.//�̰� ��ҹ��� �����ؼ� �ڵ带 �������
					return electronics;
				}
				
			}
		return null;
		
	}

	public boolean update(Electronics electronics){
			Electronics dbElec = this.searchByModelNo(electronics.getModelNo());

			if(dbElec != null){//ã�Ҵ�, �����Ѵ�.
				//���޵� ������ ����� ���� �����Ѵ�
				
				dbElec.setModelDetail(electronics.getModelDetail());
				return true;
			}

			return false;
	}

	/**
     ��ǰ �����
     */
    public boolean deleteByModelNo(int modelNo) {
		
       
        for (int i = 0; i < count; i++) {
            Electronics electronics = elecArr[i];
            if (electronics.getModelNo() == modelNo) { //�����Ϸ��� ��ǰ�� ã�Ƽ� ������ 
                int j = i;
                for (; j < count - 1; j++) { // ������ ��ĭ��
                    elecArr[j] = elecArr[j + 1];
                }

                elecArr[j] = null;
                count--; //������ �Ǹ� ����� ��ü�� ���� �����Ѵ�.
                return true;
            }
        }
        return false;
    }

	/**
     �׸��� �������� ����
    */
    public Electronics[] selectAllSortBy(String by) { //�𵨹�ȣ, �̸�, ����

		switch (by) {
            case "�𵨹�ȣ":
            case "�̸�":
            case "����":
                sortByAscending( by);
                break;
            default:
                return null;
        }
        return elecArr;
    }


    /**
	    String ��ü �ȿ� �ִ�  int re = .compareTo(String s)  �޼ҵ�
		  : �ΰ��� ���ڿ��� ���Ѵ�. : � ���ڰ� ������ �տ� ������ �������ִ� �޼ҵ� 

		      ���ϰ� :   0    : �ι��ڿ��� ����.
			            ��� :  ȣ���ϴ� ��ü�� ���ں��� ���� �տ� ������ : 
						���� :  �μ��� ��ü���� ���� �տ� ������ 

	*/

    public void sortByAscending( String by) {

        // ��������
        for (int i = 0; i < ElectronicsService.count; i++) {
            int minIndex = i;
            for (int j = i + 1; j < ElectronicsService.count; j++) {

                if (by.equals("�𵨹�ȣ")) {
                    int selected = elecArr[j].getModelNo();
                    if (selected < elecArr[minIndex].getModelNo()) {
                        minIndex = j;
                    }
                } else if (by.equals("�̸�")) {
                    String selected = elecArr[j].getModelName();
                    if (elecArr[minIndex].getModelName().compareTo(selected) > 0) { //����� 
                        minIndex = j;
                    }
                } else {
                    int selected = elecArr[j].getModelPrice();
                    if (selected < elecArr[minIndex].getModelPrice()) {
                        minIndex = j;
                    }
                }

            }

            swapElectronics(i, minIndex);
        }
    }


    public void swapElectronics(int i, int j) {

        Electronics tmp = elecArr[i];
        elecArr[i] = elecArr[j];
        elecArr[j] = tmp;
    }

}// Ŭ���� ��
