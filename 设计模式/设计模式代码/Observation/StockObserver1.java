package Observation;

import java.util.Observable;

//对于具体的观察者，需要更改的地方就是把与‘前台’耦合的地方都改成针对抽象的通知者
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
		System.out.println(sub.getAction() + "	" + name + "关闭股票行情，继续工作！");
	}
}
