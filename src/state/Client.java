package state;




/**
 * ״̬ģʽ
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class Client {
     public static void main(String[] args) {
          Context context=new Context();
          context.setState(new FreeState());
          context.setState(new BookedState());
          context.setState(new CheckedState());
          System.out.println("���ڵķ���״̬�ǣ�"+context.getState());
     }
}
