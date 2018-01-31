package a08_Proxy.staticProxy;

public class RealStar implements Star {

	@Override
	public void collectMoney() {
		System.out.println("周杰伦--收钱");
	}

	@Override
	public void confer() {
		System.out.println("周杰伦--面谈");
	}

	@Override
	public void signContract() {
		System.out.println("周杰伦--签合同");
	}

	@Override
	public void sing() {
		System.out.println("周杰伦--唱歌");
	}
	
	
	
}
