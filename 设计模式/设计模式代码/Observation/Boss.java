package Observation;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

//�����֪ͨ���������ǰ̨��Ҳ�������ϰ壬����Ҳ���и��Ե�һЩ������������֪ͨ����˵��������һ���ģ��������Ƕ�ȥʵ������ӿڡ�
public class Boss implements Subject
{
	private List<Observer>	observers	= new ArrayList<Observer>();
	private String			action;

	public void attach1(Observer observer)
	{
		observers.add(observer);
	}

	public void detach1(Observer observer)
	{
		observers.remove(observer);
	}

	public void announce()
	{
		for (Observer obj : observers)
		{
			obj.update(null, obj);
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

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		
	}
}
