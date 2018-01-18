package a01_FactoryMethod.simpleFactory;

/**
 * 普通工厂模式  ：就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 *
 */
public class Test {

	public static void main(String[] args) {  
        CarFactory factory = new CarFactory();  
        Car sender = factory.produce("audi");  
        sender.run();  
    }
}
