/**
  본인이름: 이수빈
  날짜: 2022.01.21
  주제 : 성적구하기Ver5
*/

import java.util.Scanner;

public class TestVer5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean menu = true;

		while (menu) {
			System.out.println("====================");
			System.out.println("1.성적표구하기 | 2.종료");
			System.out.println("====================");
			System.out.print("선택> ");

			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				System.out.println("1번을 선택했습니다.");

				System.out.print("이름> ");
				String name = sc.nextLine();

				System.out.print("국어점수>  ");
				int kor = Integer.parseInt(sc.nextLine());

				System.out.print("영어점수> ");
				int eng = Integer.parseInt(sc.nextLine());

				System.out.print("수학점수> ");
				int math = Integer.parseInt(sc.nextLine());


				
				printAll(name, kor, eng, math);
				
				break;

			case 2:
				menu = false;
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				System.out.println("메뉴는 1~2 숫자만 선택가능합니다.");
				break;

			}
		}
	}

	private static int totalScore(int kor, int eng, int math) {

		int total = kor + eng + math;

		return total;
	}

	private  double average(int total, int subject) {

		double avg =  (total / (double)subject);

		return avg;
	}
	
	private static char gradeScope(double avg) {
		
		char grade = ' ';

		switch((int)(avg/10)) {
			case 10:
			case 9: grade = 'A';
			break;

			case 8: grade = 'B';
			break;

			case 7: grade = 'C';
			break;

			case 6: grade = 'D';
			break;

			default : grade = 'F';
			

		}	

		return grade;

	}
	
	////////////////////////////////////////////////////////////////
	public  void printAll(String name, int kor, int eng, int math) {
		
		int count = 3;
		
		System.out.println(name + "의 성적은 다음과 같습니다.");
		
		int totalS = totalScore(kor, eng, math);
		System.out.println("총점> " + totalS);
		
		double average = average(totalS, count);
		System.out.println("평균> " + average);
		
		char grade = gradeScope(average);
		System.out.println("등급> " + grade);
	
		
	}
	

}
