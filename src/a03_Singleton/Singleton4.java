package a03_Singleton;

/**
 * 单例模式 -（使用静态内置类实现）
 *
 */
public class Singleton4 {  
	  
	// 内部类
	private static class SingletonHandler {
		private static Singleton4 instance = new Singleton4();
	}
  
    private Singleton4() {  
    }  
  
    public static Singleton4 getInstance() {  
    	return SingletonHandler.instance;
    }  
  
}  