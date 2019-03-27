package designMode.a21_Observer.B;

public class Client {
	public static void main(String[] args) {
		//创建目标对象Obserable
		Tank subject = new Tank(10,10);
		
		//创建观察者
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//将上面三个观察者对象添加到目标对象subject的观察者容器中
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		subject.addObserver(obs3);
		
		//改变subject对象的状态
		subject.set(1000,1000);
		System.out.println("===============状态修改了！");
		//观察者的状态发生了变化
		obs1.print();
		obs2.print();
		obs3.print();

		subject.set(500,800);
		System.out.println("===============状态修改了！");
		//观察者的状态发生了变化
		obs1.print();
		obs2.print();
		obs3.print();
		
	}
}
