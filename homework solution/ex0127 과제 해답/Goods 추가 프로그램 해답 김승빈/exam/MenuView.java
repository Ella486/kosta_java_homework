import java.util.Scanner;

public class MenuView {

    private Scanner scanner = new Scanner(System.in);
    private GoodsService service;

    public void printMenu(String[][] data) {

        service = new GoodsService(data);
        while (true) {
            System.out.println("========================================================================================");
            System.out.println("1.��� | 2.��ü�˻� | 3.��ǰ�ڵ�˻� | 4. �����ϱ� | 5. �����ϱ� | 6. �����ϱ� | 9. ����");
            System.out.println("========================================================================================");

            System.out.print("�޴� ����> ");
            int menuChoice = Integer.parseInt(scanner.nextLine());
            switch (menuChoice) {
                case 1:
                    inputForInsert();
                    break;
                case 2:
                    Goods[] goods = service.selectAll();
                    EndView.printSelectedAll(goods);
                    break;
                case 3:
                    inputForSelect();
                    break;
                case 4:
                    inputForUpdate();
                    break;
                case 5:
                    inputForSort();
                    break;
                case 6:
                    inputForDelete();
                    break;
                case 9:
                    System.out.println("������ �� �̿����ּ���. ���α׷� �����մϴ�.");
                    System.exit(0);
                default:
                    System.out.println("�޴��� 1~4 or 9 �Է����ּ���.");
            }
        }
    }

    private void inputForDelete() {

        System.out.print("������ �ڵ带 �����ּ���.> ");
        String code = scanner.nextLine();

        if (service.deleteByCode(code)) {
            EndView.printMessage("���� ����");
        } else {
            EndView.printMessage("���� �ڵ��Դϴ�.");
        }
    }



    private void inputForSort() {

        System.out.print("���� ������ �����ּ���. (�ڵ� | �̸� | ����)> ");
        String by = scanner.nextLine();

        Goods[] goods = service.selectAllSortBy(by);
        if (goods == null) {
            EndView.printMessage("���� ����(" + by + ")�� �ùٸ��� ���� �Է��Դϴ�.");
        } else {
            EndView.printSelectedAll(goods);
        }
    }



    private void inputForInsert() {

        System.out.print("��ǰ�ڵ�> ");
        String code = scanner.nextLine();

        System.out.print("��ǰ�̸�> ");
        String name = scanner.nextLine();

        System.out.print("��ǰ����> ");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.print("��ǰ����> ");
        String explain = scanner.nextLine();

        Goods goods = new Goods(code, name, price, explain);

        int result = service.insert(goods);
        if (result == 0) {
            EndView.printMessage(code + "�� �ߺ��̹Ƿ� ����� �� �����ϴ�.");
        } else if (result == -1) {
            EndView.printMessage("�迭�� ���̰� ��� ���̻� ����� �� �����ϴ�.");
        } else {
            EndView.printMessage("��ϵǾ����ϴ�.");
        }
    }

    private void inputForSelect() {

        System.out.print("�˻��� ��ǰ�ڵ�> ");
        String code = scanner.nextLine();

        Goods foundGoods = service.selectByCode(code);
        if (foundGoods == null) {
            EndView.printMessage(code + "�� �ش��ϴ� ��ǰ�� �����ϴ�.");
        } else {
            EndView.printSelectedByCode(foundGoods);
        }
    }

    private void inputForUpdate() {

        System.out.print("������ ��ǰ�ڵ�> ");
        String code = scanner.nextLine();

        System.out.print("������ ����> ");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.print("������ ����> ");
        String explain = scanner.nextLine();

        Goods goods = new Goods(code, price, explain);
        if (service.update(goods)) {
            EndView.printMessage("������ �Ϸ�Ǿ����ϴ�.");
        } else {
            EndView.printMessage(code + "�� �ش��ϴ� ��ǰ�� �����ϴ�.");
        }
    }

}
