package Mediator;

public class Development implements Department{
  private Mediator mediator;
	public Development(Mediator mediator) {
	super();
	this.mediator = mediator;
	mediator.register("devlopment", this);
}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("ר�Ŀ���");
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("�㱨������ûǮ�ˣ���Ҫ�ʽ�");
	}

}
