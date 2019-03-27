package designMode.a21_Observer.B;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {

	private int x;
	private int y;
	
	
	@Override
	public void update(Observable o, Object arg) {
		x = ((Tank)o).getX();
		y = ((Tank)o).getY();
	}

	
	public void print(){
		System.out.println("观察者：发现坦克现在坐标：("+x+","+y+")。");
	}
	
}
