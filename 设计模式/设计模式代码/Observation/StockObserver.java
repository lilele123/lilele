package Observation;

//����Ʊͬ����
public class StockObserver
{
	private String		name;
	private Boss	sub;

	public StockObserver(String name, Boss huhansan)
	{
		this.name = name;
		this.sub = huhansan;
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "�رչ�Ʊ���飬����������");
	}
}
