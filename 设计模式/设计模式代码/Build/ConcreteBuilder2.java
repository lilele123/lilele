package Build;

//具体建造类2
public class ConcreteBuilder2 extends Builder{
    Product product = new Product();
    @Override
    public void BuildPartA() {
    product.partsList.add("部件X");

    }

    @Override
    public void BuildPartB() {
        product.partsList.add("部件Y");
    }

    @Override
    public Product GetResult() {
        return product;
    }

}
