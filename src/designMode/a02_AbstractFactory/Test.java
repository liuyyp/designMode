package designMode.a02_AbstractFactory;

/**
 * 抽象工厂模式：产品族
 *
 */
public class Test {

	public static void main(String[] args) {  
		IFactory factory = new FastFactory();  
        Car sender = factory.bydCar();
        sender.run();  
    }
}
