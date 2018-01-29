package a08_Proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		
		StarHandler handler = new StarHandler();
		
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
		
		proxy.sing();
		
	}
	
}