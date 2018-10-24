package Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *����ͨ�������л��ķ�������������
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Client4 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		// TODO Auto-generated method stub
          testSingleton07();
	}
	/**
	 * ����ͨ�������л��ķ�������������
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
    public static void testSingleton07() throws IOException, ClassNotFoundException{
    	System.out.println("__________�����Ĳ���____��ַ��ͬ����ͬһ��______");
    	Singleton07 singleton01=Singleton07.getinstance();
    	Singleton07 singleton02=Singleton07.getinstance();
        System.out.println(singleton01);
        System.out.println(singleton02);
        
        //���л�
       try {
		FileOutputStream fos=new FileOutputStream("d:/testSingleton07.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(singleton01);
		oos.close();
		fos.close();
	    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	     }
       
       //�����л�
       System.out.println("__________ͨ�����л������л�____��ַ����ͬ���������¶���__�������readResolve()�������򲻻ᴴ���µĶ���____");
       ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:/testSingleton07.txt"));
       Singleton07 singleton03=(Singleton07)ois.readObject();
       System.out.println(singleton03);
    }
}
