package designMode.a21_Observer.A;

import java.util.ArrayList;
import java.util.List;

//目标对象
public class Subject {
	
	private List<Observer> list = new ArrayList<Observer>();
	
	public void registerObserver(Observer obs){
		list.add(obs);
	}
	public void removeObserver(Observer obs){
		list.add(obs);
	}

	//通知所有的观察者更新状态
	public void notifyAllObservers(){
		for (Observer obs : list) {
			obs.update(this);
		}
	}
	
}
