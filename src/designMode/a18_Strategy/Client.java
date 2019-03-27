package designMode.a18_Strategy;

public class Client {
	public static void main(String[] args) {
		
		Context ctx = new Context(new OldCustomerManyStrategy());
		
		ctx.pringPrice(998);
		
	}
}
