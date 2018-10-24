package Observer;

import java.util.Observable;

public class COncreteSubject extends Observable{

	private int state;
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public void set(int s){
		state=s;
		setChanged();//��ʾĿ������Ѿ����˸���
		notifyObservers(state);//֪ͨ���еĹ۲��ߣ�������������ı���
	}
}
