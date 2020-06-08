package Sub;

//外观发
public class Facade {

	SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;
    //构造方法初始化
    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();

    }
    public void MethodA(){
        System.out.println("\n方法组A----");
        one.MethodOne();
        two.MethodTwo();
    }
    public void MethodB(){
        System.out.println("\n方法组B----");
        three.MethodThree();
        four.MethodFour();
    }

}
