import candies.Candy;
import candies.ChocolateCandy;
import candies.FruitCandy;
import candies.MilkCandy;
import childrens_gift.Gift;

public class Main {
    public static void main(String[] args) {
        Gift gift = new Gift();
        gift.addCandyToGift(getCandy("jack"));
        gift.addCandyToGift(getCandy("jack"));
        gift.addCandyToGift(getCandy("ladybug"));
        gift.addCandyToGift(getCandy("barberry"));
        gift.addCandyToGift(getCandy("barberry"));
        gift.addCandyToGift(getCandy("barberry"));
        gift.getWeight();
        gift.showGiftContent();
        gift.sortByWeight(20, 30);
    }

    static Candy getCandy(String name) {
        Candy candy = null;
        if(name.equalsIgnoreCase("jack")) {
            candy = new ChocolateCandy("Jack", 90, 100, 10);
        }
        if(name.equalsIgnoreCase("ladybug")) {
            candy = new MilkCandy("Ladybug", 30, 20, 3);
        }
        if(name.equalsIgnoreCase("barberry")) {
            candy = new FruitCandy("Barberry", 20, 30, 7);
        }
        return candy;
    }
}
