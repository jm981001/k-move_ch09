package remotecontrol;

public class SmartTelevision implements Remotecontrol {
@Override
			public void turnOn() {
				System.out.println("Smart TV를 켭니다");
				
			}
			
			public void turnOff() {
				System.out.println("Smart TV를 끕니다");
			}
}
