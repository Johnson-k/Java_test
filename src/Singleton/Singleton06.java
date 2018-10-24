package Singleton;
 
/**
 * ����ʽ���� Ч�ʸߣ������ӳټ��أ������õ�ʱ���ٴ�����
 * ���ʼ��ʱ������ʼ���������
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Singleton06 {
private static Singleton06 instance;


/**
 * ��ֹ����©���Ĺؼ����ж�instance�Ƿ���ڣ�������ڣ�����ʱ�׳�����ʱ�쳣
 */
private  Singleton06() {
	if (instance!=null) {
		throw new RuntimeException();
	}
	
}

public static synchronized Singleton06 getinstance() {
	if(instance==null){
		instance=new Singleton06();
	}
	return instance;
}
}
