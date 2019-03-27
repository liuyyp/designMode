package designMode.a02_AbstractFactory;

public class FastFactory implements IFactory{

	@Override
	public AudiCar audiCar() {
		return new FastAudiCar();
	}

	@Override
	public BydCar bydCar() {
		return new FastBydCar();
	}

}
