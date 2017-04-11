package a04_Builder;

/**
 * 建造者模式  ：
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，
 * 用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。
 * 我们看一下代码：
 * 
 * 还和前面一样，一个Sender接口，两个实现类MailSender和SmsSender。最后，建造者类如下：
 *
 */
public class Test {

	public static void main(String[] args) {  
        Builder builder = new Builder();  
        builder.produceMailSender(10);  
    }  
}
