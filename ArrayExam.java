class ArrayExam{
	
	//각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요

	int [] intArr = new int [5]; //0
	double [] doubleArr = new double [5]; //0.0
	char [] charArr = new char [5]; //u0000      char 초기화는 공백
	boolean [] booleanArr = new boolean [5]; //false
	String [] stringArr = new String [5]; //null


	//메소드 : printArrayValue01	
	//위의 배열들에 자동으로 초기화 된값을 출력하세요
	
	public void printArrayValue01(){
		int i=0;

		for(i=0;i<intArr.length;i++){
			System.out.println(intArr[i]);
		}

		//개선된 for = 향상된 for문
		/*
			for(데이터타입 변수이름 : 반복대상){
				System.out.print(변수이름);
			}
		*/
		System.out.println("*********intArr 를 향상된 for ***********");
		for(int v : intArr){
			System.out.println(v);

		}
		System.out.println();

		for(i=0;i<doubleArr.length;i++){
			System.out.println(doubleArr[i]);
		}

		System.out.println();

		for(i=0;i<charArr.length;i++){
			System.out.println(charArr[i]);
		}

		System.out.println();
		
		for(i=0;i<booleanArr.length;i++){
			System.out.println(booleanArr[i]);
		}

		System.out.println();

		for(i=0;i<stringArr.length;i++){
			System.out.println(stringArr[i]);
		}	

		System.out.println();
	}

	//메소드 : printArrayValue02	
	//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.

	public void printArrayValue02(){

		
		int i=0;
		String [] str = {"오늘은","즐거운","불금","야호","!!"};
		
		for(i=0;i<intArr.length;i++){
			intArr[i]=i+1;
		}
		for(i=0;i<doubleArr.length;i++){
			doubleArr[i]=i+0.5;
		}
		for(i=0;i<charArr.length;i++){
			charArr[i]=(char)(i+65);
		}
		for(i=0;i<booleanArr.length;i++){
			if(i%2==0) booleanArr[i]=true;
			//else booleanArr[i]=false;  이미 디폴트가 false임
		}
		for(i=0;i<stringArr.length;i++){
			stringArr[i]="A"+i;
		}
	}

	//arrS=str;   ->str의 주소글 arrS에 할당해라 -> 원래 가리키고 있던 주소값에서 대체됨
	//arrS[i]=str[i]; ->각 공간에 할당되어 있던 값이 대체
	
	//메소드 : printArrayValue03	
	//새롭게 할당된값을 출력하세요
	public void printArrayValue03(){
		System.out.println("----변경 후----");
		this.printArrayValue01(); //현재 클래스 내에 있는 클래스 호출, for문 다시 돌릴 필요 없음
		System.out.println();
	}

	
	//메인메소드에서
	//ArrayExam의 메소드들을 순서대로 호출하세요.
	
	public static void main(String [] args){
		ArrayExam ae = new ArrayExam();  //전역변수 초기화

		ae.printArrayValue01();
		ae.printArrayValue02();
		ae.printArrayValue03();


	}
	
}
