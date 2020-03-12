package candies;

public class FruitCandy extends Candy {

    public FruitCandy(String name, int weight, int price, int numOfSugar) {
        super(name, weight, price, numOfSugar);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int getNumOfSugar() {
        return this.numOfSugar;
    }
}
