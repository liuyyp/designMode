package a08_Proxy.staticProxy;

public class ProxyStar implements Star {
	
	private Star star = new RealStar();

	@Override
	public void collectMoney() {
		System.out.println("经纪人--收钱");
	}

	@Override
	public void confer() {
		System.out.println("经纪人--面谈");
	}

	@Override
	public void signContract() {
		System.out.println("经纪人--签合同");
	}

	@Override
	public void sing() {
		System.out.println("经纪人找歌手准备唱歌。");
		star.sing();
	}

}
