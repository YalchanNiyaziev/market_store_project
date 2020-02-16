import java.math.BigDecimal;

public class PayDesk {

    public static BigDecimal getDiscountRate(Card card) {

        return card.getDiscountRate().multiply(new BigDecimal(100));
    }

    public static BigDecimal getDiscount(Card card, Purchase purchase) {

        return card.getDiscountRate().multiply(purchase.getValue());
    }

    public static BigDecimal getTotalPurchaseValue(Card card, Purchase purchase) {

        return purchase.getValue().subtract(getDiscount(card, purchase));
    }

    public static void showPurchaseInfo(Card card, Purchase purchase) {

        System.out.printf("Purchase value: $%.2f %n", purchase.getValue());
        System.out.printf("Discount rate:   %.1f%% %n", getDiscountRate(card));
        System.out.printf("Discount:       $%.2f %n", getDiscount(card, purchase));
        System.out.printf("Total:          $%.2f %n", getTotalPurchaseValue(card, purchase));


    }

    public static void main(String[] args) {

        CardOwner ownerOne = new CardOwner("John", "Doe");
        CardOwner ownerTwo = new CardOwner("Jenny", "Doe");
        CardOwner ownerThree = new CardOwner("Jack", "Doe");

        Card bronzeCard = new BronzeCard(ownerOne, new BigDecimal(0));
        Card silverCard = new SilverCard(ownerTwo, new BigDecimal(600));
        Card goldCard = new GoldCard(ownerThree, new BigDecimal(1500));

        Purchase purchaseOne = new Purchase("teddy bear", new BigDecimal(150));
        Purchase purchaseTwo = new Purchase("bike", new BigDecimal(850));
        Purchase purchaseThree = new Purchase("iphone", new BigDecimal(1300));

        System.out.println("\n1.Bronze");
        showPurchaseInfo(bronzeCard, purchaseOne);

        System.out.println("\n2.Silver");
        showPurchaseInfo(silverCard, purchaseTwo);

        System.out.println("\n3.Gold");
        showPurchaseInfo(goldCard, purchaseThree);

    }
}
