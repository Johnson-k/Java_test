package adapter;


/**
 * �൱�������еıʼǱ���ֻ��USB�ӿ�
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
public class Client {
    public void test1(Target t){
    	
    	t.handlereq();
    }
    public static void main(String[] args) {
		Client client=new Client();//����
		Adaptee adaptee=new Adaptee();//����
	//	Target target=new AdapteImpl();  //ʹ�ü̳б�����ķ�ʽ
		Target target=new AdapteImpl2(adaptee);//��ϣ����뱻����Ķ���
		client.test1(target);
	}
}
