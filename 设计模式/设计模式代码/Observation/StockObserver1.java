package Observation;

import java.util.Observable;

//���ھ���Ĺ۲��ߣ���Ҫ���ĵĵط����ǰ��롮ǰ̨����ϵĵط����ĳ���Գ����֪ͨ��
public class StockObserver1 extends Observable
{
	public StockObserver1(String name, Subject sub)
	{
		super();
	}

	public void update()
	{
		int name = 0;
		Subject sub = null;
		System.out.println(sub.getAction() + "	" + name + "�رչ�Ʊ���飬����������");
	}
}
