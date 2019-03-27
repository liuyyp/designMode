package designMode.a22_Memento;

import java.util.Stack;

/**
 * 负责人类
 * 负责管理备忘录对象
 * @author Administrator
 *
 */
public class CareTaker2 {
	
	private Stack<EmpMemento> stack = new Stack<EmpMemento>();
	
	
	public EmpMemento getMemento() {
		return stack.pop();
	}

	public void setMemento(EmpMemento memento) {
		stack.add(memento);
	}
	
}
