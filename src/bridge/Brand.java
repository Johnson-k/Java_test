package bridge;

public interface Brand {
    void sale();
}
class lenovo implements Brand{

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("�������");
	}
	
}
class dell implements Brand{
  
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}
	
}
class Shenzhou implements Brand{

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("���ݵ���");
	}
	
}