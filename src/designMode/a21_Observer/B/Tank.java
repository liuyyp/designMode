package designMode.a21_Observer.B;

import java.util.Observable;

//目标对象
public class Tank extends Observable {
	
	private int x;
	private int y; 
	
	public Tank(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void set(int x,int y){
		this.x = x;  //目标对象的状态发生了改变
		this.y = y;
		
		setChanged();  //表示目标对象已经做了更改
		notifyObservers();  //通知所有的观察者
	}

	public void print(){
		System.out.println("坦克现在坐标：("+x+","+y+")。");
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	
}
