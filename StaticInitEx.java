class StaticInitEx{


	static{
		//기능 구현(DB연결처럼 선행되어 세팅 준비해야할 것들 점검하기 위해 먼저 실행, 문제가 생기면 아예 main에 진입 못하도록)
					//ex) 많은 초기치 데이터 로딩, DB연결, 환경설정 세팅, 사전작업
					//static끼리 논다는 제약,static이라 메모리 할당

		System.out.println("난 메인보다 먼저 실행");
	}
	public static void main(String[] args) {
		System.out.println("***메인 시작***");
	}
}
