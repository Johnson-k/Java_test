package simpleFactory;
/**
 * ����ģʽ
 * ʵ���˴����ߺ͵����ߵķ���
 * ��ϸ���ࣨ�򵥹���ģʽ����������ģʽ�����󹤳�ģʽ��
 * ���������ƵĻ���ԭ��
 * ocp(����ԭ��open-close principle)��һ�������ʵ��Ӧ������չ���ţ����޸Ĺر�
 * DIP��������תԭ�� dependence inversion principle������Ҫ��Խӿڱ�̣���Ҫ���ʵ�ֱ��
 * LOD �������ط��� law of Demeter��:ֻ����ֱ�ӵ����ѵ�����ͨ�ţ��������İ����ͨ��
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public interface Car {
void run();
}
