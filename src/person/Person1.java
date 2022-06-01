package person;

public class Person1 {
	Person field =new Person() {
		void work(){
			System.out.println("출근합니다");
		}
		void wake(){
			System.out.println("6시에 일어납니다.");
			work();
		}	
	};

}
