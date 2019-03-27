package designMode.a02_AbstractFactory;

public abstract class AudiCar implements Car {
	public String name = "奥迪车";
}  

class FastAudiCar extends AudiCar{

	@Override
	public void run() {
		System.out.println(name + "飞快的跑起来了！！！");
	}
	
}

class SlowAudiCar extends AudiCar{

	@Override
	public void run() {
		System.out.println(name + "龟速前进。。。");
	}
	
}