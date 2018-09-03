class ArgsEx{   //컴파일까지만 여기서. 실행은 cmd창에서 값 주면서
	public static void main(String[] args) {  //String args []로 쓸 수도 있음
		System.out.println("args="+args);
		System.out.println("args.length="+args.length);

		for(int i=0;i<args.length;i++){
			System.out.println("args["+i+"] : "+args[i]);
		}
		
		//만약, args에 숫자 2개가 입력된다는 가정 하에 두 수의 합을 구한다
		System.out.println(args[0]+args[1]);

		/**
			1) 문자역(String) -> 숫자(int) 변환 : int i = Integer.parseInt(문자열);

			2) 숫자(int) -> 문자열(String) 변환 : String s = Integer.toString(숫자)
		*/
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println(x+y);
	
	}
}

/**
	실행할 때 사용자가 값을 전달할 수 있다.
		java ArgsExam 값 값 값 ......
*/
