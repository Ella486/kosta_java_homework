
import java.util.Scanner;

/**
   ������� ��û�� Ű����� �Է¹޴� Ŭ���� 
*/
public class MenuView{
    Scanner sc= new Scanner(System.in);
	ElectronicsController controller = new ElectronicsController(); // ���� ���� �ʱ�ȭ, ������ ȣ��

	/**
	  ��ü �޴��� ����ϴ� �޼ҵ�
	*/
	public void printMenu(){
        
	     while(true){
           System.out.println("-----------------------------------------------------------------------------------------");
           System.out.println("1.��ü�˻�   2.�𵨹�ȣ�˻�   3.����ϱ�   4.�����ϱ�   5.�����ϱ�   6.�����ϱ�   9.����");
		   System.out.println("------------------------------------------------------------------------------------------");
		   System.out.print("�޴����� > ");

		   String  menu = sc.nextLine();
		   switch(menu){
               case "1" : 
                 controller.selectAll();
			   break;
			   case "2" : 
                 this.inputSearch();
			   break;
			   case "3" : 
                 this.inputInsert();
			   break;
			   case "4" : 
                 this.inputUpdate();
			   break;
			   case "5" :
			     this.inputForDelete();
               break;
			   case "6" :
			     this.inputForSort();
               break;
			   case "9" : 
                 System.exit(0);
			   default:
				   System.out.println("�޴��� �ٽ� �������ּ���!!!!");

		   }//switch����

		 }//while����

	}//�޼ҵ峡

	/**
	   ����Ҷ� Ű���� �Է��� ó���ϴ� �޼ҵ�
	*/
	public void inputInsert(){
        System.out.print("�𵨹�ȣ��? ");
        int modelNo = Integer.parseInt(sc.nextLine());

		System.out.print("���̸���? ");
        String modelName = sc.nextLine();

		System.out.print("�𵨰�����? ");
        int modelPrice = Integer.parseInt(sc.nextLine());

		System.out.print("�𵨼�����? ");
        String modelDetail = sc.nextLine();

        
		controller.insert( new Electronics(modelNo, modelName, modelPrice, modelDetail) );
			// new Electronics(modelNo, modelName, modelPrice, modelDetail) �����ڸ� ���ؼ� ������ �ʱ�ȭ�� ����

	}

	/**
	  �𵨹�ȣ�� �ش��ϴ� ������ǰ �˻��ϱ� ���ؼ� �𵨹�ȣ Ű�����Է� ó���ϴ� �޼ҵ�
	*/
    public void inputSearch(){
       System.out.print("ã�� ������ǰ �𵨹�ȣ��? ");
       int modelNo = Integer.parseInt(sc.nextLine());
	   controller.searchByModelNo(modelNo);

   
	}


	/**
	  �𵨹�ȣ�� �ش��ϴ� ������ �����ϱ� ���� Ű���� �Է�ó���ϴ� �޼ҵ�
	*/
	public void inputUpdate(){
        System.out.print("�����Ϸ��� ������ǰ �𵨹�ȣ��? ");
        int modelNo = Integer.parseInt(sc.nextLine());

		System.out.print("�����Ϸ��� �𵨼�����? ");
        String modelDetail = sc.nextLine();

		controller.update( new Electronics(modelNo , modelDetail) );

	}

	/**
	  �𵨹�ȣ�� �ش��ϴ� ������ǰ �����ϱ� ���ؼ� �𵨹�ȣ Ű�����Է� ó���ϴ� �޼ҵ�
	*/
	 public void inputForDelete() {

        System.out.print("������ ������ǰ �𵨹�ȣ��? ");
		int modelNo = Integer.parseInt(sc.nextLine());

		controller.forDelete(modelNo);
        
    }
	
	/** �����ϱ�*/
	public void inputForSort() {

        System.out.print("���� ������ �����ּ���. (�𵨹�ȣ | �̸� | ����)> ");
        String by = sc.nextLine();
		
		
		controller.forSort(by);
   }

}//Ŭ������