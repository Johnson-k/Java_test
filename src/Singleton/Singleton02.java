package Singleton;
 
/**
 * ����ʽ���� Ч�ʸߣ������ӳټ��أ������õ�ʱ���ٴ�����
 * ���ʼ��ʱ������ʼ���������
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Singleton02 {
private static Singleton02 instance;
private  Singleton02() {}

public static synchronized Singleton02 getinstance() {
	if(instance==null){
		instance=new Singleton02();
	}
	return instance;
}
}
