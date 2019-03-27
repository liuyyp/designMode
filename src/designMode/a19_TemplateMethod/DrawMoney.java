package designMode.a19_TemplateMethod;

class DrawMoney extends BankTemplateMethod {

	@Override
	public void transact() {
		System.out.println("我要取款！！！");
	}
	
}