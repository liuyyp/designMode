package designMode.a15_Mediator;

public class Market implements Department {

	private Mediator m;  //持有中介者(总经理)的引用
	
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作！接到项目，需要研发支持！");
		
		m.command("development");
		
	}

	@Override
	public void selfAction() {
		System.out.println("跑去接项目！");
	}

}
