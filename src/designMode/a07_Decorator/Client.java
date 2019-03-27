package designMode.a07_Decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Client {
	public static void main(String[] args) {
//		Car car  = new Car();
//		car.move();
//		
//		System.out.println("创建汽车，增加新的功能，水里游---------");
//		ICar  waterCar = new WaterCar(car);
//		waterCar.move();
//		
//		System.out.println("创建汽车，继续增加新的功能：飞行-------");
//		ICar waterFlyCar = new FlyCar(waterCar);
//		waterFlyCar.move();
		
		
		ICar car = new FlyCar(new AICar(new WaterCar(new Car())));
		car.move();
		
//		IO流，典型的装饰模式
//		Reader r = new BufferedReader(new InputStreamReader(new FileInputStream(new File("d:/a.txt"))));
		
		//也叫包装模式  Wrapper
		
	}
}
