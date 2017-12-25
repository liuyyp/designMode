package a01_FactoryMethod;

/**
 * 普通工厂模式 ：就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 * 
 * @author CC
 *
 */
public class Test {

	public static void main(String[] args) {
		int sum = 0;
		outer: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					sum++;
					if (sum > 500) {
						break outer;
					}
				}
			}
		}
	}
}
