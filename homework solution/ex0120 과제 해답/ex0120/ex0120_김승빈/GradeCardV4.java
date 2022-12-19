

import java.util.Scanner;

/**
 이름: 김승빈
 날짜: 22.01.20
 주제: 성적표 V4
 1. 성적표 2. 종료 메뉴출력
 1을 입력하면 이름, 국어, 영어, 수학 점수를 키보드 입력을 받아 성적표를 출력 -> 다시 메뉴를 출력
 2를 입력하면 프로그램 종료
 */
public class GradeCardV4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("================");
            System.out.println("1.성적표 | 2.종료");
            System.out.println("================");
            System.out.print("> ");

            int command = Integer.parseInt(sc.nextLine()); //String을 int형으로 변환
            if (command == 1) {
                System.out.print("이름을 입력하세요.> ");
                String name = sc.nextLine();

                System.out.print("국어,영어,수학 점수를 빈 칸으로 구분하여 입력하세요.ex)55 60 70> ");
                int korean = sc.nextInt();
                int	english = sc.nextInt();
                int math = sc.nextInt();
                sc.nextLine();

                int totalGrade = korean + english + math;
                double average = (int) ((totalGrade / 3.0) * 100) / 100.0;

                char grades;
                if (average >= 90) grades = 'A';
                else if (average >= 80) grades = 'B';
                else if (average >= 70) grades = 'C';
                else if (average >= 60) grades = 'D';
                else grades = 'F';

                System.out.println("=== " + name + " 님의 성적표 ===");
                System.out.println("국어점수: " + korean);
                System.out.println("영어점수: " + english);
                System.out.println("수학점수: " + math);
                System.out.println("총   점: " + totalGrade);
                System.out.println("평   균: " + average);
                System.out.println("학   점: " + grades);
            } else if (command == 2) {
                break; //반복을빠져나온다
            } else {
                System.out.println("제대로 입력하세요.");
            }
        } while (true);

        sc.close();
        System.out.println("안녕히 가세요.");
    }

}
