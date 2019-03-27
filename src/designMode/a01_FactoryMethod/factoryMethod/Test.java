package designMode.a01_FactoryMethod.factoryMethod;

/**
 *
 */
public class Test {

	public static void main(String[] args) {  
		IFactory provider = new AudiCarFactory();  
        Car sender = provider.produce();  
        sender.run();  
    }
}
