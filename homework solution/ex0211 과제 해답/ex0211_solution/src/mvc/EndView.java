package mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * ����� ��û�� �ش��ϴ� ����� ����Ϳ� ����ϴ� Ŭ���� 
 */

class EndView {

    /**
     * ���޵� �迭�� ���(��ü �˻� ���)
     * @param electronics
     */
    public static void printAll(List<Electronics> list){
		System.out.println("****** ������ǰ �� ("+list.size()+")�� *****************");
        for(Electronics elec : list) {
           System.out.println(elec);
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
