/**
  이름: 김승빈
  날짜: 22.01.19
  주제: 성적표V2 if 버전
*/
class GradeCardV2If {

	public static void main(String[] args) {
        String name = "김승빈";
        int korean = (int) (Math.random() * 56 + 45);
		int	english = (int) (Math.random() * 56 + 45);
		int math = (int) (Math.random() * 56 + 45);
		int totalGrade = korean + english + math;
        double average = (int) ((totalGrade / 3.0) * 100) / 100.0;

        char grades;
		int value = (int) (average / 10);

		if (value >= 9) grades = 'A';
		else if (value == 8) grades = 'B';
		else if (value == 7) grades = 'C';
		else if (value == 6) grades = 'D';
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
    }

}