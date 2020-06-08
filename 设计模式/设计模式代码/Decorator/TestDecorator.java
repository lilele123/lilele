package Decorator;

//²âÊÔÀà
public class TestDecorator {

    public static void main(String[] args) {

      Shape circle = new Circle();
      Shape redCircle = new RedShapeDecorator(new Circle());
      Shape redRectangle = new RedShapeDecorator(new Rectangle());

      System.out.println("Circle with normal border");
      circle.draw();//1¡¢»­Í¼ÐÎ  

      System.out.println("\nCircle of red border");
      redCircle.draw();//1¡¢»­Í¼ÐÎ  2¡¢¼ÓºìÉ«±ß¿ò

      System.out.println("\nRectangle of red border");
      redRectangle.draw();//1¡¢»­Í¼ÐÎ  2¡¢¼ÓºìÉ«±ß¿ò

    }

}
