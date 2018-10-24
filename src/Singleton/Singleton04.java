package Singleton;

/**
 * ��̬�ڲ���ʵ�ַ�ʽ��Ҳ��һ�������ط�ʽ��
 * ֻ����������getInstance �Ż�����ڲ���̬�࣬����
 * ��ʱ���̰߳�ȫ�ģ�instance��static final ���ͣ�
 * ��֤���ڴ���ֻ������һ��ʵ�����ڣ�����ֻ�ܱ���ֵһ�Σ��Ӷ�
 * ��֤���̰߳�ȫ�ԣ��汸�˲������˵��ú��ӳټ��ص�����
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Singleton04 {
    private  static class SingletonClassInstance{
	  private static final Singleton04 instance=new Singleton04();
    }
    public static Singleton04 getInstance(){
    	return SingletonClassInstance.instance;
    }
    private Singleton04(){}
}
