package Mediator;
/**
 * �н���ģʽ
 * 
 *���ģ�����״�ṹ����Զࣩ������һ�Զ�
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class Client {
    static int aaa=100;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
          Mediator mediator=new President();
          Market market=new Market(mediator);
          Development development=new Development(mediator);
          Finacial finacial=new Finacial(mediator);
          
          
          market.selfAction();
          market.outAction();

	}


}
