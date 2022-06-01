package exam06;

public class Chatting {
	void starChat(String chatId) {
		String nickName = chatId;
		//nickName = chatId;
		Chat chat = new Chat() {
			public void start() {
				while(true) {
					String inputData= "안녕하세요";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
			
		};
		chat.start();
}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
		
	}
}
