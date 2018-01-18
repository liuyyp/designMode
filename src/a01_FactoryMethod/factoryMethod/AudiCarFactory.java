package a01_FactoryMethod.factoryMethod;

public class AudiCarFactory implements IFactory {  
    
    @Override  
    public Car produce(){  
        return new AudiCar();  
    }  
}  