
class ArrayValue{
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)

	int [] arr = {1,2,3,4,5,6,7,8,9,10};  //생성할 때만 값 지정, 나중에 덮어쓰기 불가능
	//만약 다시 선언하면 값 변경이 아니라 새로운 객체가 생성됨


   /*printArrayvalue 메소드작성
       => 메소드 안에서 위에 선언된 배열방의 값을 출력한다.
  

	*/
	public void printArrayvalue(){ //이 메소드는 ArrayValue 안에 있고 int [] arr는 멤버 변수니깐 () 안에 안 받아도 됨
		/**for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}*/

		int len = arr.length; //arr.length이면 계속 값 받아와야해서 변수에 담는 것도 좋음
		for(int i=0;i<len;i++){
			System.out.println("arr["+i+"]: "+arr[i]);
		}
	}
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue에 있는 printArrayvalue메소드 호출
		ArrayValue value = new ArrayValue();
		value.printArrayvalue();

	}
}
