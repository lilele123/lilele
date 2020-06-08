package Observation;

//看股票同事类
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
		System.out.println(sub.getAction() + "	" + name + "关闭股票行情，继续工作！");
	}
}
