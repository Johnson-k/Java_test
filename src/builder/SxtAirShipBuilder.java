package builder;
/**
 * uilder��β�Ķ��ǹ�����ģʽ
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class SxtAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine builderEngine() {
		// TODO Auto-generated method stub
		System.out.println("����������");
		return new Engine("��ѧ�÷�����");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		// TODO Auto-generated method stub
		System.out.println("�����");
		return new OrbitalModule("�����");
	}

	@Override
	public EscapeTower builEscapeTower() {
		// TODO Auto-generated method stub
		System.out.println("���ݲ�");
		return new EscapeTower("���ݲ�");
	} 
   
}
