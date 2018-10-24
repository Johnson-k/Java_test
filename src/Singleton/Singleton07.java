package Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
 
/**
 * ����ʽ���� Ч�ʸߣ������ӳټ��أ������õ�ʱ���ٴ�����
 * ���ʼ��ʱ������ʼ���������
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Singleton07 implements Serializable{
  private static Singleton07 instance;


/**
 * ��ֹ����©���Ĺؼ����ж�instance�Ƿ���ڣ�������ڣ�����ʱ�׳�����ʱ�쳣
 */
  private  Singleton07() {
	if (instance!=null) {
		throw new RuntimeException();
	}
	
}

   public static synchronized Singleton07 getinstance() {
	if(instance==null){
		instance=new Singleton07();
	}
	return instance;
  }
   
   //����������������Է�ֹ�����л��ƽ⣬���ص�ʱ��ֱ�ӷ��ش˷���ָ���Ķ��󣬶�����Ҫ�ٵ��������µĶ���
   private Object readResolve() throws ObjectStreamException{
	return instance;
  }
}
