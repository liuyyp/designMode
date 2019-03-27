package designMode.a15_Mediator;

public class Client {
	public static void main(String[] args) {
		Mediator m = new President();
		
		Department market = new Market(m);
		Department devp = new Development(m);
		Department finacial = new Finacial(m);
		
		devp.selfAction();
		devp.outAction();
		
	}
}
