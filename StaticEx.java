
class Test{
	int a=5;
	static int b=10;

	public void aa(){//non-static 영역에서 static, non-static 모두 접근 가능
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(this.b); //static 안에서만 this 못 쓸 뿐
	}
	public void bb(){
		aa();
		this.aa();
		cc();
		this.cc();
	
	}
	public static void cc(){ //static 안에서 static만 접근 가능, this사용불가
		//System.out.println(a);		//out도 static 변수!!
		//System.out.println(this.a);
		System.out.println(b);       //static 변수라 접근 가능
		//System.out.println(this.b);
	}

	public static void dd(){
		//aa();
		//this.aa();
		cc();		//static이라서 접근 가능
		//this.cc();
	}
}


//////////////////////////////////////////////
class StaticEx {
	public static void main(String[] args){
		System.out.println(Test.b); //미리 메모리에 할당된 static 변수라서 가능
		//System.out.println(Test.a);  //객체 생성해서 접근 가능

		Test.dd();
		//Test.aa();//객체 생성해서 접근 가능

		//static 변수 공유에 대하여...
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();

		System.out.println("t1 ="+t1); //주소값: class이름@hashcode형태
		System.out.println("t2 ="+t2);
		System.out.println("t3 ="+t3);

		//non-static변수 값 변경
		
		System.out.println("a 변수 값 변경 전...");
		System.out.println("t1.a= "+t1.a);
		System.out.println("t2.a= "+t2.a);
		System.out.println("t3.a= "+t3.a);

		t1.a=100;//값 변경

		System.out.println("a 변수 값 변경 후...");
		System.out.println("t1.a= "+t1.a);
		System.out.println("t2.a= "+t2.a);
		System.out.println("t3.a= "+t3.a);
		/////////////////////////////////////////////////

		//static변수 값 변경
		
		System.out.println("b 변수 값 변경 전...");
		System.out.println("t1.b= "+t1.b);
		System.out.println("t2.b= "+t2.b);
		System.out.println("t3.b= "+t3.b);

		t1.b=100;//값 변경

		System.out.println("b 변수 값 변경 후...");
		System.out.println("t1.b= "+t1.b);
		System.out.println("t2.b= "+t2.b);
		System.out.println("t3.b= "+t3.b);

		//->static변수는 하나로 인식(공유 변수)
	}
}
