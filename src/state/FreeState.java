package state;

import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * ����״̬
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class FreeState implements State{

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println(new Date()+"������У�û��ס");
	}
  
}
