package state;

public class Context {
	//�൱������ϵͳ���ݽ�ͬ���л���ͬ��״̬
   private State state;
   public State getState(){
	   return this.state;
   }
   public void setState(State s){
	   System.out.println("�޸�");
       state=s;
       state.handle();
   
   }
}
