package adapter;
/**
 * �����������ݼ̳�����
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
/*
 * 
 * public class AdapteImpl2 extends Adaptee implements Target{
    
	
	@Override
	public void handlereq() {
		// TODO Auto-generated method stub
		super.request();
	}

}*/
/**
 * �������������������
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
public class AdapteImpl2 implements Target{
    
	private Adaptee adaptee;
	@Override
	public void handlereq() {
		// TODO Auto-generated method stub
		adaptee.request();
	}
	public AdapteImpl2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

}