package prototype;

import java.io.FileInputStream;

import java.io.ObjectOutputStream;
import java.util.Date;


/**
 * ����ԭ��ģʽ
 * ���¡
 * ���¡֮�󣬱����ƵĶ��������ٸı�Ҳ����Ӱ���¿�¡���Ķ�������Է����ı�
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Client2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date=new Date(12312456);
	    Sheep s1=new Sheep("����",date);
        System.out.println(s1);
        System.out.println(s1.getName()+":"+s1.getBirthday());
        Sheep s2=(Sheep)s1.clone();
        s2.setName("����");
        System.out.println(s2);
        System.out.println(s2.getName()+":"+s2.getBirthday());
        date.setDate(89898);
        System.out.println(s2.getName()+":"+s2.getBirthday());
        System.out.println("********************���֮��ԭ���ĸı��ˣ��µ�û�ı�*********");
        System.out.println(s1.getName()+":"+s1.getBirthday());
        
     
	}
}
