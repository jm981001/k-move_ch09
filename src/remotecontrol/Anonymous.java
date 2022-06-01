package remotecontrol;

public class Anonymous {

	Remotecontrol field = new Remotecontrol() {
		public void turnOn() {
			System.out.println("TV를 켭니다");
			
		}
		
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
	};
	void method1() {
		//로컬 변수 값으로 익명 구현 객체
		Remotecontrol localVar= new Remotecontrol() {
		
			public void turnOn() {
				System.out.println("audio를 켭니다");
				
			}
			
			public void turnOff() {
				System.out.println("audio를 끕니다");
			}
		};
	
	}
	void method2(Remotecontrol rc) {
		rc.turnOn();
	}
	
}
