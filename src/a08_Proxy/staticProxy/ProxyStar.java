package a08_Proxy.staticProxy;

public class ProxyStar implements Star {
	
	private Star star = new RealStar();

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()");
	}

	@Override
	public void signContract() {
		System.out.println("ProxyStar.signContract()");
	}

	@Override
	public void sing() {
		System.out.println("经纪人准备工作。");
		star.sing();
	}

}
