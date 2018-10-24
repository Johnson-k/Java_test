package ChainOfResponsibility;

public class Manager extends Leader{

	
    public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void handleRequest(LeaveRequest request) {
    	if(request.getLeaveDays()<10 ){
    		System.out.println("Ա��"+request.getName()+"�������"+request.getLeaveDays());
    	    System.out.println("����"+this.name+"����ͨ��");
    	}else {
			if (this.nextLeader!=null) {
				System.out.println("***********����"+name+"�����ˣ�����"+this.nextLeader.name+"����");
				this.nextLeader.handleRequest(request);
				
			}
		}
    	
    }
}
