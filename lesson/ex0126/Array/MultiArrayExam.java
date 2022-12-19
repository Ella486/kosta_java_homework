class MultiArrayExam {
	//String [] [] arr = new String [3][5]; // 3행 5열 (선언만 가능)(변수 선언만 가능)
	//String [] [] arr;
	//String [] [] arr = new String [3][];

	String [] [] arr = new String [][]{ //명시적 초기화
		{"A", "B","C" },
		{"월","화","수","목", "금"},
		{"배고프다", "뭐먹지?", "맛있는거", "먹고싶다."}

	};


	public void test() {

	System.out.println("arr= " + arr);
	//System.out.println("arr[0]= " + arr[0]);
	//System.out.println("arr[1]= " + arr[1]);
	//System.out.println("arr[2]= " + arr[2]);

	//System.out.println("arr[3]= " + arr[3]); //ArrayIndexOutofBoundsException 발생

	System.out.println("arr.length = " + arr.length);

		for (int i=0; i<arr.length ; i++){//행
			for ( int j=0; j<arr.length ; j++){//열
				System.out.print(arr[i][j] + "\t");

			}

			System.out.println();
		}

	}// test 메소드 끝

	public void test2() {
		int [] [] intArr = new int [4][];
		//System.out.println("intArr= " + intArr); // 주소값
		//System.out.println("intArr[0]= " + intArr[0]); //null
		//System.out.println("intArr[0][0]= " + intArr[0][0]);// Nullpointer

		//각 행의 열을 생성
		intArr[0] = new int [5];
		intArr[1] = new int [2];
		intArr[2] = new int [1];
		intArr[3] = new int [4];

		//System.out.println("intArr[0]= " + intArr[0]); //주소값
		//System.out.println("intArr[0][0]= " + intArr[0][0]); //값
		for (int i=0; i<intArr.length ; i++){//행
			for ( int j=0; j<intArr[i].length ; j++){//열
				System.out.print(intArr[i][j] + "\t");

			}

			System.out.println();
		}
		System.out.println("개선된 for ----------------");
		////////////////////////////////////
		//위 2중 반복문 개선된 for 변경

		for (int[] row : intArr ){//행
			for (int v : row){//열
				System.out.print(v + "\t");
			}

			System.out.println();
		}
		
	}




	public static void main(String[] args) {
		//test() 호출 // 같은 클래스 안에 있지만 메인메소드가 static 이므로 생성 해줘야함.

		MultiArrayExam ma = new MultiArrayExam();
		//ma.test();
		ma.test2();

	}//메인 끝
}//클래스 끝
