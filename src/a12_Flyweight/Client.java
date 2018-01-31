package a12_Flyweight;

public class Client {
	
	/**
	 * 享元模式包括三种角色：
		    享元接口（Flyweight）：定义了对外公开的获取其内部数据和接收外部数据的方法。
		    具体享元（Concrete Flyweight）：享元接口的实现。
		    享元工厂（Flyweight Factory）：该类的实例负责创建和管理享元对象，用户或其他对象必须请求他以获取一个享元对象。
	 * @author liuyj
	 * @date 2018年1月29日
	 */
	public static void main(String[] args) {
		ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
		System.out.println(chess1 == chess2);
		
		System.out.println("增加外部状态的处理===========");
		chess1.display(new Coordinate(10, 10));
		chess2.display(new Coordinate(20, 20));
		
			
	}
}
