package factoryMethod;

import javax.crypto.Cipher;

public class Client01 {
   public static void main(String[] args) {
	Car c1=new AudiFactory().createCar();
	Car c2=new BydFactory().createCar();
    c1.run();
    c2.run();
    
    //���ӱ�����ʱֻ��Ҫ���ӱ�����ͱ��۹��������Ͽ���ԭ��
	Car c3=new BenzFactory().createCar();
    c3.run();
}
}
