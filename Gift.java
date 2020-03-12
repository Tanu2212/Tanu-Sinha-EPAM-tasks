package childrens_gift;

import candies.Candy;

import java.util.ArrayList;
import java.util.List;

public class Gift {
    private int weight;
    private List<Candy> candies = new ArrayList<>();

    public void showGiftContent() {
        for (Candy candy : candies) {
            System.out.println("===== " + candy.getName() + " | weight " + candy.getWeight() + " | " + " price " + candy.getPrice() + " | num of sugar " + candy.getNumOfSugar());
        }
    }

    public void addCandyToGift(Candy candy) {
        candies.add(candy);
        weight += candy.getWeight();
    }

    public void removeCandyFromGift(Candy candy) {
        candies.remove(candy);
        weight -= candy.getWeight();
    }

    public void sortBySugarAmount(int from, int to) {
        for (Candy candy : candies) {
            if (candy.getNumOfSugar() >= from && candy.getNumOfSugar() <= to) {
                System.out.println(candy.getName());
            }
        }
    }

    public void sortByWeight(int from, int to) {
        for (Candy candy : candies) {
            if (candy.getWeight() >= from && candy.getWeight() <= to) {
                System.out.println(candy.getName());
            }
        }
    }

    public void getWeight() {
        System.out.println("Weight of gift : " + weight);
    }
}
