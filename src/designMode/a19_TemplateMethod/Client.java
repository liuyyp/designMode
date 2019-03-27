package designMode.a19_TemplateMethod;

public class Client {
	public static void main(String[] args) {
		BankTemplateMethod btm = new SaveMoney();
		btm.process();
		
		
		BankTemplateMethod btm2 = new DrawMoney();
		btm2.process();
	}
}
