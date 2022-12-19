/** 
	������ǰ�� ���õ� ����� ����� Ŭ����
*/

class ElectronicsService {
	public static int count; //�迭 �濡 ����� ��ǰ�� ������ üũ!
	String [][] data = new String [][]{//������ �ʱ�ġ �����͸� �غ�
		{"100","��ǳ��","35000","�Ｚ ��ǳ��"},
		{"200","���ڷ���","55000","�� ��������.."},
		{"300","������","5500000","��ǳ ������ �ʹ� �ÿ���"},
		{"400","�����","800000","LG �����"},
		{"500","����̱�","9000","LG ����̱�"}
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

}// Ŭ���� ��
