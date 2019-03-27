package designMode.a22_Memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		
		Emp emp = new Emp("aaa", 11, 111);
		System.out.println("第一次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		taker.setMemento(emp.memento());   //备忘一次
		
		emp.set("bbb", 22, 222);
		
		System.out.println("第二次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		emp.recovery(taker.getMemento()); //恢复到备忘录对象保存的状态
		
		System.out.println("第三次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
	}
}
