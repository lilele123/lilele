package Build;

public class Main {

	public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();
        director.Construct(b1);
        Product product1 = b1.GetResult();
        product1.Show();
        director.Construct(b2);
        Product product2 = b2.GetResult();
        product2.Show();
    }

}
