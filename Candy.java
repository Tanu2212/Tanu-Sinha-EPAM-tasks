package candies;

public abstract class Candy {
    public String name;
    public int weight;
    public int price;
    public int numOfSugar;

    public Candy(String name, int weight, int price, int numOfSugar) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.numOfSugar = numOfSugar;
    }

    public abstract String getName();

    public abstract int getWeight();

    public abstract int getPrice();

    public abstract int getNumOfSugar();
}
