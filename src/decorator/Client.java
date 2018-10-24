package decorator;

import java.util.Arrays;

/**
 * װ��ģʽ
 * ��̬��Ϊһ�����������µĹ���
 * װ��ģʽ��һ�����ڴ���̳еļ���������ͨ���̳��������������չ������¹��ܣ�
 * ʹ�ö���Ĺ�����ϵ����̳й�ϵ��������ͬʱ����������ϵ�Ŀ�������
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
public class Client {
    
    public static void main(String[] args) {
    	System.out.println("***************��ͨ");
    	Car car=new Car();
        car.move();
        
        System.out.println("***************�����µĹ��ܣ�����");
        FlyCar fcar=new FlyCar(car);
        fcar.fly();
        
        System.out.println("***********�����µĹ���,ˮ����");
        WaterCar wcar=new WaterCar(car);
        wcar.swim();;
        
        
        System.out.println("****************�����µĹ���,ˮ����");
        WaterCar wcar2=new WaterCar(new FlyCar(new Car()));
        wcar2.move();
        System.out.println("---");
    	
    	
        
	}
}
