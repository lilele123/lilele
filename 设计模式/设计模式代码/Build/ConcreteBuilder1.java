package Build;

//具体建造类
public class ConcreteBuilder1 extends Builder{
    Product product = new Product();
    @Override
    public void BuildPartA() {
    product.partsList.add("部件A");

    }

    @Override
    public void BuildPartB() {
        product.partsList.add("部件B");
    }

    @Override
    public Product GetResult() {
        return product;
    }

}
