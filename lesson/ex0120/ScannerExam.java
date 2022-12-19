import java.util.Scanner; // Scanner라는 객체를 util 폴더에서 가져와주세요.
/**
	java.util.Scanner 객체는 사용자로 부터 키보드 입력을 타입별로 받을 수 있도록 다양한 메소드를 제공하는 클래스이다.

		:숫자를 입력받을 때
		int no = xx.nextInt();

		:문자를 입력받을 때
		String data = xx.next(); // 공백없이 문자열 : 개행문자(" \n") 무시

		String data = xx.nextLine(); // 공백이 있는 경우

*/

class ScannerExam {
	public static void main(String[] args)   // 자주 사용하는 객체 ex) String, Math...... --> java, lang 폴더에 있다. import 안해도 자동 
	{
		Scanner sc = new Scanner(System.in); // 키보드입력받을 준비 완료!
		/** System.out.print("국어점수:");
		int kor = sc.nextInt();

		System.out.print("영어점수:");
		int eng = sc.nextInt();

		sc.nextLine(); // 개행을 읽어라.

		System.out.print("이름은:");
		String name = sc.nextLine(); */

		////////////////////////////////////////////
		System.out.print("이름은:");
		String name = sc.nextLine();


		System.out.print("국어점수:");
		int kor =Integer.parseInt( sc.nextLine() ); // 문자열 ---> 숫자로변경

		System.out.print("영어점수:");
		int eng =Integer.parseInt( sc.nextLine() );

	
		System.out.println(name + "님 국어점수는"+ kor + ",영어점수는" + eng);

		System.out.println("------End--------");
	}
}




//System.out.println();