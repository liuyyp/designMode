package a06_Adapter;

public class Test {

	public static void main(String[] args) {
		Computer computer = new Computer();
		USB adapter = new Adapter();
		computer.type(adapter);
	}
}
