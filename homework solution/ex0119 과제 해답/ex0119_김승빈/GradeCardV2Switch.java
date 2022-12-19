/**
  이름: 김승빈
  날짜: 22.01.19
  주제: 성적표V2 스위치버전
*/
class GradeCardV2Switch {

	public static void main(String[] args) {
        String name = "김승빈";
        int korean = (int) (Math.random() * 56 + 45);
		int	english = (int) (Math.random() * 56 + 45);
		int math = (int) (Math.random() * 56 + 45);
		int totalGrade = korean + english + math;
        double average = (int) ((totalGrade / 3.0) * 100) / 100.0;

        char grades;
        switch ((int) (average / 10)) {
			case 10:
			case 9:
				grades = 'A';
				break;
			case 8:
				grades = 'B';
				break;
			case 7:
				grades = 'C';
				break;
			case 6:
				grades = 'D';
				break;
			default:
				grades = 'F';
        }

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