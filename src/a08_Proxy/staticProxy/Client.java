package a08_Proxy.staticProxy;

public class Client {
	public static void main(String[] args) {
		Star proxy = new ProxyStar();
		
		proxy.confer();
		proxy.signContract();
		proxy.sing();
		
		proxy.collectMoney();
		
	}
}
