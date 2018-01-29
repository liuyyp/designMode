package a07_Decorator;

//Decorator装饰角色
abstract class SuperCar implements ICar {
	protected ICar car;
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
	
	abstract void newFun();//新功能

	@Override
	public void move() {
		car.move();
	}
}


//ConcreteDecorator具体装饰角色
class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
	}
	
	public void newFun(){
		System.out.println("天上飞！");
	}

	@Override
	public void move() {
		super.move();
		newFun();
	}
	
}

//ConcreteDecorator具体装饰角色
class WaterCar extends SuperCar {
	
	public WaterCar(ICar car) {
		super(car);
	}
	
	public void newFun(){
		System.out.println("水上游！");
	}
	
	@Override
	public void move() {
		super.move();
		newFun();
	}
	
}

//ConcreteDecorator具体装饰角色
class AICar extends SuperCar {
	
	public AICar(ICar car) {
		super(car);
	}
	
	public void newFun(){
		System.out.println("自动驾驶！");
	}
	
	@Override
	public void move() {
		super.move();
		newFun();
	}
	
}