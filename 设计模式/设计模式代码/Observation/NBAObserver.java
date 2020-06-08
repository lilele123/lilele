package Observation;

import java.util.Observable;

public class NBAObserver extends Observable
{
	public NBAObserver(String name, Subject sub)
	{
		super();
	}

	public void update()
	{
		int name = 0;
		Subject sub = null;
		System.out.println(sub.getAction() + "	" + name + "关闭NBA直播，继续工作！");
	}
}
