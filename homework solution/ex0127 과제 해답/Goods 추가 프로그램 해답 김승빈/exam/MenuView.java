import java.util.Scanner;

public class MenuView {

    private Scanner scanner = new Scanner(System.in);
    private GoodsService service;

    public void printMenu(String[][] data) {

        service = new GoodsService(data);
        while (true) {
            System.out.println("========================================================================================");
            System.out.println("1.등록 | 2.전체검색 | 3.상품코드검색 | 4. 수정하기 | 5. 정렬하기 | 6. 삭제하기 | 9. 종료");
            System.out.println("========================================================================================");

            System.out.print("메뉴 선택> ");
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
                    System.out.println("다음에 또 이용해주세요. 프로그램 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("메뉴는 1~4 or 9 입력해주세요.");
            }
        }
    }

    private void inputForDelete() {

        System.out.print("삭제할 코드를 적어주세요.> ");
        String code = scanner.nextLine();

        if (service.deleteByCode(code)) {
            EndView.printMessage("삭제 성공");
        } else {
            EndView.printMessage("없는 코드입니다.");
        }
    }



    private void inputForSort() {

        System.out.print("정렬 기준을 적어주세요. (코드 | 이름 | 가격)> ");
        String by = scanner.nextLine();

        Goods[] goods = service.selectAllSortBy(by);
        if (goods == null) {
            EndView.printMessage("정렬 기준(" + by + ")는 올바르지 않은 입력입니다.");
        } else {
            EndView.printSelectedAll(goods);
        }
    }



    private void inputForInsert() {

        System.out.print("상품코드> ");
        String code = scanner.nextLine();

        System.out.print("상품이름> ");
        String name = scanner.nextLine();

        System.out.print("상품가격> ");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.print("상품설명> ");
        String explain = scanner.nextLine();

        Goods goods = new Goods(code, name, price, explain);

        int result = service.insert(goods);
        if (result == 0) {
            EndView.printMessage(code + "는 중복이므로 등록할 수 없습니다.");
        } else if (result == -1) {
            EndView.printMessage("배열의 길이가 벗어나 더이상 등록할 수 없습니다.");
        } else {
            EndView.printMessage("등록되었습니다.");
        }
    }

    private void inputForSelect() {

        System.out.print("검색할 상품코드> ");
        String code = scanner.nextLine();

        Goods foundGoods = service.selectByCode(code);
        if (foundGoods == null) {
            EndView.printMessage(code + "에 해당하는 상품이 없습니다.");
        } else {
            EndView.printSelectedByCode(foundGoods);
        }
    }

    private void inputForUpdate() {

        System.out.print("수정할 상품코드> ");
        String code = scanner.nextLine();

        System.out.print("수정할 가격> ");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.print("수정할 설명> ");
        String explain = scanner.nextLine();

        Goods goods = new Goods(code, price, explain);
        if (service.update(goods)) {
            EndView.printMessage("수정이 완료되었습니다.");
        } else {
            EndView.printMessage(code + "에 해당하는 상품이 없습니다.");
        }
    }

}
