import java.math.BigDecimal;

public abstract class Card {

    private CardOwner owner;
    private BigDecimal turnover;
    private BigDecimal initialDiscountRate;

    public Card(CardOwner owner, BigDecimal turnover, BigDecimal initialDiscountRate) {
        this.owner = owner;
        this.turnover = turnover;
        this.initialDiscountRate = initialDiscountRate;
    }

    public CardOwner getOwner() {
        return owner;
    }

    public BigDecimal getTurnover() {
        return turnover;
    }

    public BigDecimal getInitialDiscountRate() {
        return initialDiscountRate;
    }

    public abstract BigDecimal getDiscountRate();
}
