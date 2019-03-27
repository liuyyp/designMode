package designMode.a01_FactoryMethod.simpleFactory;

public class CarFactory {  
	  
    public Car produce(String type) {  
        if ("audi".equals(type)) {  
            return new AudiCar();  
        } else if ("byd".equals(type)) {  
            return new BydCar();  
        } else {  
            System.out.println("请输入正确的类型!");  
            return null;  
        }  
    }  
    
    
//    public Car audiCar(){
//    	return new AudiCar();
//    }
//    
//    public Car bydCar(){
//    	return new BydCar();
//    }
}  
