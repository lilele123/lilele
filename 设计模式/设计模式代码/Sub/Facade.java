package Sub;

//��۷�
public class Facade {

	SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;
    //���췽����ʼ��
    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();

    }
    public void MethodA(){
        System.out.println("\n������A----");
        one.MethodOne();
        two.MethodTwo();
    }
    public void MethodB(){
        System.out.println("\n������B----");
        three.MethodThree();
        four.MethodFour();
    }

}
