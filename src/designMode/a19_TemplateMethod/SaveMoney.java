package designMode.a19_TemplateMethod;

class SaveMoney extends BankTemplateMethod {

	@Override
	public void transact() {
		System.out.println("我要取款！！！");
	}
	
}