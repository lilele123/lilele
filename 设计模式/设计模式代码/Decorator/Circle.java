package Decorator;

//具体形状对象，可以给这些对象添加职责
public class Circle implements Shape{

    @Override
    public void draw() {

        System.out.println("shape:circle.");

    }

}
