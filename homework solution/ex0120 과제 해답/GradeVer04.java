/**
  본인이름: 이명진
  날짜: 22.1.20
  주제 : 성적프로그램Ver4 - 이름,국어,영어,수학 점수를 키보드 입력을 받아서 성적표를 출력한다.
*/
import java.util.Scanner; 

class GradeVer04{
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);

		String name;
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		char grade;
		boolean run = true;

		while(run){
			System.out.println("------------메뉴------------");
            System.out.println("   1. 성적표     2. 종료     ");
            System.out.println("---------------------------");
            System.out.print("메뉴 선택 >  ");
            int menuNum = Integer.parseInt(sc.nextLine());
            if(menuNum==1){
				System.out.print("이름은:");
				name = sc.nextLine();

				System.out.print("국어점수:");
				kor =Integer.parseInt( sc.nextLine() ); // 문자열 ---> 숫자로변경

				System.out.print("영어점수:");
				eng =Integer.parseInt( sc.nextLine() );

				System.out.print("수학점수:");
				math =Integer.parseInt( sc.nextLine() );

				sum = kor + eng + math;
				avg = (int) ((sum / 3.0) * 100) / 100.0;// 소수점 둘째자리까지

	
				if (avg >= 90){
					grade = 'A';
				}else if (avg >= 80){
					grade = 'B';
				}else if (avg >= 70){
					grade = 'C';
				}else if (avg >= 60){
					grade = 'D';
				}else {
					grade = 'F';
				}

				System.out.println("------------성적표--------------");
				System.out.println("이    름: " + name);
				System.out.println("국어점수: " + kor);
				System.out.println("영어점수: " + eng);
				System.out.println("수학점수: " + math);
				System.out.println("총    점: " + sum);
				System.out.println("평    균: " + avg); 
				System.out.println("학    점: " + grade);
			
				System.out.println("------메뉴로 돌아갑니다-------");

			}else if(menuNum==2){
				run = false;
			}else {
				System.out.println("잘못 입력하였습니다.");
			}
		}
		System.out.println("** 프로그램이 종료되었습니다. **");
	}
}