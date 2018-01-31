package a12_Flyweight;

/**
 * 抽象享元类
 */
public interface ChessFlyWeight {
	void display(Coordinate c);
}

/**
 * 具体享元类
 */
class ConcreteChess implements ChessFlyWeight {

	private final String color;
	
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("棋子颜色："+color);
		System.out.println("棋子位置："+c.getX()+"----"+c.getY());
	}

}
