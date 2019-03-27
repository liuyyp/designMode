package designMode.a08_Proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
	
	Star realStar = new RealStar();
	
	//调用代理类时触发
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object object = null;
		
		
		if(method.getName().equals("sing")){
			
			System.out.println("经纪人：面谈，签合同，预付款");
			object = method.invoke(realStar, args);
			System.out.println("经纪人：收尾款");
		}
		
		return object;
	}

}
