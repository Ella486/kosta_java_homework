
import java.util.Scanner;

/**
 이름: 김승빈
 날짜: 22.01.20
 주제: 성적표 V3
 이름, 국어, 영어, 수학 점수를 키보드 입력을 받아 성적표를 출력
 */
public class GradeCardV3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요.> ");
        String name = sc.nextLine();

        System.out.print("국어점수 .ex)45~100> ");
        int korean = sc.nextInt();

		 System.out.print("영어점수 .ex)45~100> ");
        int	english = sc.nextInt();

		 System.out.print("수학점수 .ex)45~100> ");
        int math = sc.nextInt();


        int totalGrade = korean + english + math;
        double average = (int) ((totalGrade / 3.0) * 100) / 100.0;

        char grades;
        if (average >= 90) grades = 'A';
        else if (average >= 80) grades = 'B';
        else if (average >= 70) grades = 'C';
        else if (average >= 60) grades = 'D';
        else grades = 'F';

        System.out.println("--------------------------");
        System.out.println("이    름: " + name);
        System.out.println("국어점수: " + korean);
        System.out.println("영어점수: " + english);
        System.out.println("수학점수: " + math);
        System.out.println("총    점: " + totalGrade);
        System.out.println("평    균: " + average); // 소수2
        System.out.println("학    점: " + grades);
        System.out.println("--------------------------");

        sc.close();
    }

}
