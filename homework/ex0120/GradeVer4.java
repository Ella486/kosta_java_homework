2/**
  본인이름: 이명진
  날짜: 22.1.20
  주제 : 성적프로그램Ver4 
*/
import java.util.Scanner;

class GradeVer4 {

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
                int kor = sc.nextInt();
                int	eng = sc.nextInt();
                int math = sc.nextInt();
                sc.nextLine();

                int total = kor + eng + math;
                double avg = (int) ((total / 3.0) * 100) / 100.0;

                char grade;
                if (avg >= 90) grade = 'A';
                else if (avg >= 80) grade = 'B';
                else if (avg >= 70) grade = 'C';
                else if (avg >= 60) grade = 'D';
                else grade = 'F';

                System.out.println("=== " + name + " 님의 성적표 ===");
                System.out.println("국어점수: " + kor);
                System.out.println("영어점수: " + eng);
                System.out.println("수학점수: " + math);
                System.out.println("총   점: " + total);
                System.out.println("평   균: " + avg);
                System.out.println("학   점: " + grade);
            } else if (command == 2) {
                break; //반복을빠져나온다
            } else {
                System.out.println("제대로 입력하세요.");
            }
        } while (true);

        
		System.out.println("안녕히 가세요.");
	}
}
