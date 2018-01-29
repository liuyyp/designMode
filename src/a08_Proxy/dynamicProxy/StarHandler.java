package a08_Proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
	
	Star realStar = new RealStar();
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object object = null;
		
		System.out.println("经纪人：面谈，签合同，预付款");
		
		if(method.getName().equals("sing")){
			object = method.invoke(realStar, args);
		}
		
		System.out.println("经纪人：收尾款");
		return object;
	}

}
