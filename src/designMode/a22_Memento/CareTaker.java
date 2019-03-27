package designMode.a22_Memento;

/**
 * 负责人类
 * 负责管理备忘录对象
 * @author Administrator
 *
 */
public class CareTaker {
	
	private EmpMemento memento;

	
	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}
	
}
