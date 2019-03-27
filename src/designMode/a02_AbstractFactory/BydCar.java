package designMode.a02_AbstractFactory;

public abstract class BydCar implements Car {  
	public String name = "比亚迪车";
}

class FastBydCar extends BydCar{

	@Override
	public void run() {
		System.out.println(name + "飞快的跑起来了！！！");
	}
	
}

class SlowBydCar extends BydCar{

	@Override
	public void run() {
		System.out.println(name + "龟速前进。。。");
	}
	
}