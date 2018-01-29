package a07_Decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Client {
	public static void main(String[] args) {
		Car car  = new Car();
		car.move();
		
		System.out.println("增加新的功能，飞行----------");
		ICar flycar = new FlyCar(car);
		flycar.move();
		
		System.out.println("增加新的功能，水里游---------");
		ICar  waterCar = new WaterCar(car);
		waterCar.move();
		
		System.out.println("增加两个新的功能，飞行，水里游-------");
		ICar waterFlyCar = new FlyCar(waterCar);
		waterFlyCar.move();
		
		
//		IO流，典型的装饰模式
//		Reader r = new BufferedReader(new InputStreamReader(new FileInputStream(new File("d:/a.txt"))));
		
		//也叫包装模式  Wrapper
		
	}
}
