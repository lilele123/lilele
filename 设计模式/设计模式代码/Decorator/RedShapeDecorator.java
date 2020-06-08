package Decorator;

//Shape接口的具体装饰类，继承自抽象装饰类SHapeDecorator
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator decoratedShape;

    //构造方法传入一个被装饰的Shape对象
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

   @Override
   public void draw() {
      decoratedShape.draw();//画出一个图形           
      setRedBorder(decoratedShape);//为这个图形加一个红色的边框
   }

    //Shape接口抽象装饰类的子类RedShapeDecorator特有的一个装饰Shape实现类的装饰方法
    private void setRedBorder(Shape decoratedShape){
          System.out.println("Border Color: Red");
    }

}
