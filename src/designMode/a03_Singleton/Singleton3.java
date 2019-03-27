package designMode.a03_Singleton;

/**
 * 单例模式 - 双重检查
 *从1.5开始，加了volatile关键字的引用，它的初始化就不能是： 
	- a. 先分配内存，让instance指向这块内存 
	- b. 在内存中创建对象
	
	而应该是： 
	- a.在内存中创建对象 
	- b.让instance指向这个对象.
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
            synchronized (Singleton3.class) {  
                if (instance == null) {
                    instance = new Singleton3();
                }  
            }
        } 
        return instance;  
    }  
  
}  