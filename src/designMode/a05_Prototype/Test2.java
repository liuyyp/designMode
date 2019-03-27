package designMode.a05_Prototype;

/**
 * 测试普通new方式创建对象和clone方式创建对象的效率差异！
 * 如果需要短时间创建大量对象，并且new的过程比较耗时。则可以考虑使用原型模式！
 */
public class Test2 {
	
	public static void testNew(int size){
		long start = System.currentTimeMillis();
		
		for(int i=0;i<size;i++){
			Sheep t = new Sheep();
		}
		long end = System.currentTimeMillis();
		
		System.out.println("new的方式创建耗时："+(end-start));
	}
	
	public static void testClone(int size) throws CloneNotSupportedException{
		long start = System.currentTimeMillis();
		
		Sheep t = new Sheep();
		for(int i=0;i<size;i++){
			Sheep temp = (Sheep) t.clone();
		}
		long end = System.currentTimeMillis();
		
		System.out.println("clone的方式创建耗时："+(end-start));
	}
	
	
	public static void main(String[] args) throws Exception {	
		testClone(500);
		testNew(500);
	}
}

