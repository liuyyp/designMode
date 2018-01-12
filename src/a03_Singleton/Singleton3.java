package a03_Singleton;

/**
 * 单例模式 - 双重检查
 *
 */
public class Singleton3 {  
	  
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
    private static volatile Singleton3 instance = null;  
  
    /* 私有构造方法，防止被实例化 */  
    private Singleton3() {  
    }  
  
    /* 静态工程方法，创建实例 */  
    public static Singleton3 getInstance() {  
    	//double check
    	if (instance == null) {  
            synchronized (instance) {  
                if (instance == null) {  
                    instance = new Singleton3();  
                }  
            }  
        } 
        return instance;  
    }  
  
}  