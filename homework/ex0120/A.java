import java.util.Scanner;
public class A {

	public static void main(String[] args) {

		String name; 
        int kor;
        int eng; 
        int math;
        int total;
        double avg;
        char grade;
	
		Scanner sc= new Scanner(System.in);

		System.out.print("이름: ");
		name = sc.nextLine();

		System.out.print("국어점수:");
		kor =Integer.parseInt( sc.nextLine() ); // 문자열 ---> 숫자로변경

		System.out.print("영어점수:");
		eng =Integer.parseInt( sc.nextLine() );

		System.out.print("수학점수:");
		math =Integer.parseInt( sc.nextLine() );

		System.out.print("총점:");
		total = kor + eng + math;

     

		
	

	}

}