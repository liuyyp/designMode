package designMode.a06_Adapter;

/**
 * 类适配器方式 （使用extends，由于只能单继承，不方便扩展）
 */
public class Adapter extends KeyBoard implements USB {

//	private PS2 ps2 = new KeyBoard();
	
	@Override
	public void type() {
		super.type();
	}  
	
}