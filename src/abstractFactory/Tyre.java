package abstractFactory;

public interface Tyre {
void massage();
}
class LuxuryTyre implements Tyre{

	@Override
	public void massage() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
	
}
class LowTyre implements Tyre{

	@Override
	public void massage() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
	
}