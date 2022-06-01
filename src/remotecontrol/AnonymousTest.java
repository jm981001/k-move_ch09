package remotecontrol;

public class AnonymousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anonymous anony = new Anonymous();
		anony.field.turnOn();
		anony.method1();
		//매개변수 값으로 익명 구현 객체
		//SmartTelevision stv= new SmartTelevision();
		anony.method2(new Remotecontrol() {
			public void turnOn() {
				System.out.println("smart TV 켭니다");
			}
			public void turnOff() {
				System.out.println("smart TV 끕니다");
			}
		});
	}

}
