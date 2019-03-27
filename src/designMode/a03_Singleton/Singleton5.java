package designMode.a03_Singleton;

/**
 * 单例模式 - 枚举类型
 *
 */
public enum Singleton5 {  
	INSTANCE;
	
    public void test(){
    	System.out.println(123);
    }
    
    public static void main(String[] args) {
    	Singleton5.INSTANCE.test();
	}
    
}  