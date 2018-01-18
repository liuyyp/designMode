package a02_AbstractFactory;

public class SlowFactory implements IFactory{

	@Override
	public AudiCar audiCar() {
		return new SlowAudiCar();
	}

	@Override
	public BydCar bydCar() {
		return new SlowBydCar();
	}

}
