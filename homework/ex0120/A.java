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

		System.out.print("�̸�: ");
		name = sc.nextLine();

		System.out.print("��������:");
		kor =Integer.parseInt( sc.nextLine() ); // ���ڿ� ---> ���ڷκ���

		System.out.print("��������:");
		eng =Integer.parseInt( sc.nextLine() );

		System.out.print("��������:");
		math =Integer.parseInt( sc.nextLine() );

		System.out.print("����:");
		total = kor + eng + math;

     

		
	

	}

}