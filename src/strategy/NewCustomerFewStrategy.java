package strategy;

public class NewCustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standardPrice) {
		// TODO Auto-generated method stub
		
		System.out.println("��ͨ�û�������");
		return standardPrice;
	}

}
