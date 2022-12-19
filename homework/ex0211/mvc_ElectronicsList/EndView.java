package mvc_ElectronicsList;

import java.util.List;

/**
 * ����� ��û�� �ش��ϴ� ����� ����Ϳ� ����ϴ� Ŭ���� 
 */

class EndView {

    /**
     * ���޵� �迭�� ���(��ü �˻� ���)
     * @param electronics
     */
    public static void printAll(List<Electronics> electronics){
		System.out.println("****** ������ǰ �� ("+ElectronicsService.count+")�� *****************");
        for(int i=0; i < ElectronicsService.count ; i++) {
           System.out.println(electronics.get(i));
        }

		System.out.println();
    }

    // �𵨹�ȣ�� �ش��ϴ� ������ǰ ����ϱ�
    public static void printSearchByModelNo(Electronics electronics) {
        System.out.println(electronics +"\n");
    }

    /**
     * ���� ���ο� ���õ� �޼��� ��� 
     * @param message
     */
    public static void printMessage(String message) {
         System.out.println(message+"\n");
    }

    
}
