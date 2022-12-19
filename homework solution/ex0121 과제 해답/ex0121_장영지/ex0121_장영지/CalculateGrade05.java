
/**
  본인이름: 장영지
  날짜: 0121
  주제 : 성적구하기5

*/
import java.util.Scanner;

 class PrintGrade00
{

	//총점구하기
	private int getTotal(int lang ,int eng,int  math){//50 70 60

		return lang + eng + math;
	}


   //평균구하기 
	private double getAvg(int total, int num){//210  3
          //평균을 구해서 소숫점자리 2자리까지...
		  double   result = total / (double)num; //82.235642
		  result = (int)(result*100) / 100.0;

		return  result;
		
	}

	//등급구하기 
	private char getGrade(double avg){
		if(avg >= 90) return 'A';
		else if(avg >=80) return 'B';
		else if(avg >=70) return 'C';
		else if(avg >=60) return 'D';
		else return 'F';
	}

    //성적표를  출력하는 메소드 
	public void printGrade(String name, int lang, int eng, int math){ //
		int total = this.getTotal(lang, eng, math);
		double avg= this.getAvg(total, 3);
		char grade = this.getGrade(avg);

		System.out.println("이름 : "+name);
		System.out.println("총점 : " + total + "\n평균점수 : "+ avg +"\n성적 : "+grade + "\n");	
	}
}



////////////////////////////////////////////////////////////////////////////////////////
class CalculateGrade05{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
        PrintGrade00 one = new PrintGrade00();
		while(true){
			System.out.println("------------------------------------");
			System.out.println("  1. 성적표	2. 종료");
			System.out.println("------------------------------------");
			System.out.print("선택 >> ");
			int cho = sc.nextInt(); // 1 입력하고 엔터

			System.out.println();

			if(cho == 1){

				sc.nextLine(); //

				System.out.print("이름 입력 : ");
				String name = sc.nextLine();

				System.out.print("국어 점수 입력 : ");
				int lang = sc.nextInt();

				System.out.print("수학 점수 입력 : ");
				int math = sc.nextInt();

				System.out.print("영어 점수 입력 : ");
				int eng = sc.nextInt();

				System.out.println("------------------------------------");
				one.printGrade(name, lang, eng, math);

				
			}else if(cho == 2){
				break;
			}
		}
	}
}