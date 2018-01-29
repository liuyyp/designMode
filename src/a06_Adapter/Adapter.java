package a06_Adapter;

/**
 * 类适配器方式 （使用extends，由于只能单继承，不方便扩展）
 * @author glodon
 */
public class Adapter extends KeyBoard implements USB {

	@Override
	public void usbType() {
		type();
	}  
	
}