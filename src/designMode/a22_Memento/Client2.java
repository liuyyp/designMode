package designMode.a22_Memento;

public class Client2 {
	public static void main(String[] args) {
		CareTaker2 taker = new CareTaker2();
		
		Emp emp = new Emp("aaa", 11, 1111);
		System.out.println("第一次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		taker.setMemento(emp.memento());   //备忘一次
		
		emp.set("bbb", 22, 2222);
		
		taker.setMemento(emp.memento());   //备忘2次
		
		
		emp.set("ccc", 33, 3333);
		
		
		System.out.println("第二次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		emp.recovery(taker.getMemento()); //恢复到备忘录对象保存的状态
		
		System.out.println("撤销操作：对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		emp.recovery(taker.getMemento()); //恢复到备忘录对象保存的状态
		
		System.out.println("撤销操作：对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
	}
}
