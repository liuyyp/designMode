package designMode.a20_State;


public class Client {
	public static void main(String[] args) {
		Room ctx = new Room();
		
		ctx.setState(new FreeState());
		ctx.setState(new BookedState());
		
	}
}
