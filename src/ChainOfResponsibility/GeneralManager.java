package ChainOfResponsibility;

public class GeneralManager extends Leader{

	
    public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void handleRequest(LeaveRequest request) {
    	if(request.getLeaveDays()<30 ){
    		System.out.println("Ա��"+request.getName()+"�������"+request.getLeaveDays());
    	    System.out.println("�ܾ���"+this.name+"����ͨ��");
    	}else {
			System.out.println("��ְ"+request.getName()+request.getLeaveDays());
		}
    	
    }
}
