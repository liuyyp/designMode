package a01_FactoryMethod.factoryMethod;

public class BydCarFactory implements IFactory{  
	  
    @Override  
    public Car produce() {  
        return new BydCar();  
    }  
}  