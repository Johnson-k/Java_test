package Observer;
/**
 * 
 * 
 * �۲���ģʽ
 * 
 * JavaSE �ṩ�����еĹ۲���ģʽ
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class Client {
    
    public static void main(String[] args) {
		//��������
    	COncreteSubject subject=new COncreteSubject();
		//�����۲���
    	ObsererA ob1=new ObsererA();
    	ObsererA ob2=new ObsererA();
    	ObsererA ob3=new ObsererA();
    	
    	//�����������۲�����ӵ�Ŀ�����subject�Ĺ۲���������
    	subject.addObserver(ob1);
    	subject.addObserver(ob2);
    	subject.addObserver(ob3);
    	
    	//�ı�subject�����״̬
    	subject.set(300);
    	
    	System.out.println("******״̬�޸���");
    	
    	System.out.println(ob1.getMyState());
    	System.out.println(ob2.getMyState());
    	System.out.println(ob3.getMyState());
    	
	}
}
