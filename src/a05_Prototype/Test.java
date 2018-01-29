package a05_Prototype;

import java.util.ArrayList;

/**
 * 原型模式 ：
 * 用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。
 * 
 * 原型模式的优点及适用场景:
       使用原型模式创建对象比直接new一个对象在性能上要好的多，因为Object类的clone方法是一个本地方法，它直接操作内存中的二进制流，特别是复制大对象时，性能的差别非常明显。
       使用原型模式的另一个好处是简化对象的创建，使得创建对象就像我们在编辑文档时的复制粘贴一样简单。
       因为以上优点，所以在需要重复地创建相似对象时可以考虑使用原型模式。比如需要在一个循环体内创建对象，假如对象创建过程比较复杂或者循环次数很多的话，使用原型模式不但可以简化创建过程，而且可以使系统的整体性能提高很多。
       
       实现Cloneable接口。在java语言有一个Cloneable接口，它的作用只有一个，就是在运行时通知虚拟机可以安全地在实现了此接口的类上使用clone方法。在java虚拟机中，只有实现了这个接口的类才可以被拷贝，否则在运行时会抛出CloneNotSupportedException异常。
       重写Object类中的clone方法。Java中，所有类的父类都是Object类，Object类中有一个clone方法，作用是返回对象的一个拷贝，但是其作用域protected类型的，一般的类无法调用，因此，Prototype类需要将clone方法的作用域修改为public类型。
 *
 */
public class Test {

	public static void main(String[] args)  {
		ArrayList<String> stuffs = new ArrayList<String>();
		stuffs.add("aaa");
		stuffs.add("bbb");
		Sheep s1 = new Sheep("多利", stuffs);
		Sheep s2 = s1.clone();
		System.out.println("克隆出来的s2 叫：" + s2.getName());
		s2.getStuff().add("ccc");
		
		System.out.println("s1的大小：" + s1.getStuff().size());
		System.out.println("s2的大小：" + s2.getStuff().size());
		System.out.println(s1.getStuff().hashCode());
		System.out.println(s2.getStuff().hashCode());
    }
}
