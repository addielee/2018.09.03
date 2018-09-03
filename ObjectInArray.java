//ObjectInArray.java

class ObjectOne{
	public int a;
}

public class ObjectInArray{

	//메인 메소드에서 
	public static void main(String [] args){

		//ObjectOne 타입을 5개 까지 저장하는 배열을 선언하고
		ObjectOne [] ob = new ObjectOne[5] ;

		//5개의 ObjectOne객체를 생성하세요.
		for(int i=0;i<ob.length;i++){
			ob[i]=new ObjectOne();
		}

		//각 객체가 갖고있는 전역변수 출력
		System.out.println("--------각 전역변수(변경 전)--------");
		for(int i=0;i<ob.length;i++){
			System.out.println("ob["+i+"].a : "+ob[i].a);
		}

		//각 객체의 주소값 출력
		System.out.println("--------각 객체 주소--------");
		for(int i=0;i<ob.length;i++){
			System.out.println(ob[i]);
		}

		//각각의 ObjectOne객체가 서로 다른 a의 값을 갖도록 a의 값을 변경하세요.
	
		for(int i=0;i<ob.length;i++){
			ob[i].a=i*10;
		}
		/**ob[0].a=10;
		ob[1].a=20;
		ob[2].a=30;
		ob[3].a=40;
		ob[4].a=50;*/

		//각 ObjectOne 객체의 a를 출력하세요
		System.out.println("--------각 a(변경 후)--------");
		for(int i=0;i<ob.length;i++){
			System.out.println("ob["+i+"].a : "+ob[i].a);
		}

	}
}
