package composite;
/**
 * ���ģʽ����
 * 
 * �Ѳ��ֺ�����Ĺ�ϵ�����νṹ����ʾ���Ӷ�ʹ
 * �ͻ��˿���ʹ��ͳһ�ķ�ʽ�����ֶ�����������
 * 
 * 
 * ���ģʽ���ģ�
 *   ���󹹼���ɫ(Component)��������Ҷ�Ӻ����������Ĺ�ͬ��
 *   Ҷ�ӽ�ɫ��leaf�������ӽڵ�
 *   ������Composite)������ɫ�����������������԰����ӽڵ�
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFile f2,f3,f4,f5,f6;
		Folder f1=new Folder("�ҵ��ղ�");
		f2=new ImageFile("ͷ��.jpg");
		f3=new TextFile("jj.txt");
		Folder f11=new Folder("��Ӱ");
		f4=new VideoFile("Ц������.avr");
		f5=new VideoFile("�������.avr");
		f11.add(f4);
		f11.add(f5);
        f1.add(f2);
        f1.add(f3);
        f1.add(f11);
        f1.killVirus();
	}

}
