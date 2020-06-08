package Decorator;

//具体形状对象，可以给这些对象添加职责
public class Rectangle implements Shape{

    @Override
    public void draw() {

        System.out.println("shape:rectangle.");

    }

}
