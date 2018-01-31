package a12_Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 * 
 */
public class ChessFlyWeightFactory {
	//享元池
	private static Map<String,ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();
	
	public static ChessFlyWeight getChess(String color){
		
		ChessFlyWeight cfw = map.get(color);
		
		if(cfw ==null){
			cfw = new ConcreteChess(color);
			map.put(color, cfw);
		}
		
		return cfw;
	}
	
	
}
