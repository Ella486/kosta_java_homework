/**
  본인이름: 이명진
  날짜: 22.1.20
  주제 : 성적프로그램Ver3 - 이름,국어,영어,수학 점수를 키보드 입력을 받아서 성적표를 출력한다.
*/
import java.util.Scanner; 

class GradeVer3{
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름은:");
		String name = sc.nextLine();

		System.out.print("국어점수:");
		int kor =Integer.parseInt( sc.nextLine() ); // 문자열 ---> 숫자로변경

		System.out.print("영어점수:");
		int eng =Integer.parseInt( sc.nextLine() );

		System.out.print("수학점수:");
		int math =Integer.parseInt( sc.nextLine() );

		int total = kor + eng + math;
		double avg = (int) ((total / 3.0) * 100) / 100.0;// 소수점 둘째자리까지

	
		char grade;
		if (avg >= 90) grade = 'A';
		else if (avg >= 80) grade = 'B';
		else if (avg >= 70) grade = 'C';
		else if (avg >= 60) grade = 'D';
		else grade = 'F';

		System.out.println("--------------------------");
		System.out.println("이    름: " + name);
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		System.out.println("총    점: " + total);
		System.out.println("평    균: " + avg); 
		System.out.println("학    점: " + grade);
			
		System.out.println("------End--------");

	}
}