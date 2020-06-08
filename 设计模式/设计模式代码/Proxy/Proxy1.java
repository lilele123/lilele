package Proxy;

//Proxy类，保存一个引用使用代理可以访问实体，并提供一个与Subject的接口相同的接口，这样的代理可以用替代实体。
public class Proxy1 implements Subject
{
	RealSubject	realSubject;

	public void request()
	{
		if (null == realSubject)
		{
			realSubject = new RealSubject();
		}
		realSubject.request();
	}
}
