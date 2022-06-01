package a;

public class A {
	A(){
		System.out.println("A객체가 생성됨");
	}
	
	
	//인스턴스 필드
	int field;
	B field1 =new B(); //0
	C field2 =new C(); //0
	
	//인스턴스 메서드
	void methoda1() {
		B var1 = new B(); //0
		C var2 = new C(); //0
	}	
	
	//정적 필드 초기화 
	//static B field3= new B(); //X
	static C field4 =new C(); //0
	
	//정적 메서드
	static void methoda2() {
		//B var1 = new B(); //X
		C var2 = new C(); //0
	}
	
	//인스턴스 멤버 클래스
	class B {
		B() {System.out.println("B객체가 생성됨");}
		int field1;
		//static int field2(){}
		void methodb(){
			field=10;
			methoda1();
			methoda2();
		}
		//static void method2(){}
	}
	//정적 멤버 클래스
	
	static class C{
	C(){System.out.println("C객체가 생성됨");}
	int field1;
	static int field2;
	void method1() {
		//field =10; //X
		//methoda1();//X
		methoda2();
	}
	static void method2() {}
	}
	void method() {
		//로컬 클래스
		class D{
			D(){System.out.println("D객체가 생성됨");}
			int field1;
			//static int field2;
			void method1() {}
			//static int method2{};
		}
		D d =new D();
		d.field1=3;
		d.method1();
		
		}
}
