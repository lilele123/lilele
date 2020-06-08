package Decorator;

/**
 * Shape接口的抽象装饰类
 * @author lmb
 *
 */
public abstract class ShapeDecorator implements Shape{

    public Shape decoratedShape;

    //ShapeDecorator类中要向构造方法传入一个被装饰的对象
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();      
    }

}
