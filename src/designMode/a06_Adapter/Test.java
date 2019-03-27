package designMode.a06_Adapter;

public class Test {

	public static void main(String[] args) {
		Computer computer = new Computer();
		
		//使用圆口键盘打字
//		PS2 yuan = new KeyBoard();
//		computer.type(yuan);
		
		//使用转接器
		USB adapter = new Adapter();
		computer.type(adapter);
	}
}
