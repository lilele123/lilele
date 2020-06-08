package Observation;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

//前台秘书类
public class Secretary
{
	private List<StockObserver>	observers	= new ArrayList<StockObserver>();
	private String				action;

	public void attach(StockObserver observer)
	{
		Observable.add(observer);
	}

	public void announce()
	{
		for (StockObserver obj : observers)
		{
			obj.update();
		}
	}

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}
}
