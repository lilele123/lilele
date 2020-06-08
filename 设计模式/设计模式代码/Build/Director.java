package Build;

public class Director {

	public void Construct(Builder builder){
        //指挥建造过程，所有的都是这样。针对他的父类抽象编程
        builder.BuildPartA();
        builder.BuildPartB();
    }

}
