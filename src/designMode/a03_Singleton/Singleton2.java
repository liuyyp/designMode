package designMode.a03_Singleton;

/**
 * 单例模式 - 懒汉式    （性能 换 资源）
 * 
 */
public class Singleton2 {  
	  
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
    private static Singleton2 instance = null;  
  
    /* 私有构造方法，防止被实例化 */  
    private Singleton2() {  
    }  
  
    /* 静态工程方法，创建实例 */  
    public synchronized static Singleton2 getInstance() {
    	if (instance == null) {
    		instance = new Singleton2();  
        }
        return instance;
    }  
  
}  