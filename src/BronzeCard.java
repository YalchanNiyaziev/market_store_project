import java.math.BigDecimal;

public class BronzeCard extends Card {

    public BronzeCard(CardOwner owner, BigDecimal turnover) {
        super(owner, turnover, new BigDecimal(0.0));
    }

    @Override
    public BigDecimal getDiscountRate() {

        BigDecimal discountRate;
        int comparing100 = this.getTurnover().compareTo(new BigDecimal(100));
        int comparing300 = this.getTurnover().compareTo(new BigDecimal(300));

        if (comparing100 == -1)
            discountRate = this.getInitialDiscountRate();
        else if (((comparing100 == 1) || (comparing100 == 0))
                && ((comparing300 == -1) || (comparing300 == 0)))
            discountRate = new BigDecimal(0.01);
        else
            discountRate = new BigDecimal(0.025);
        return discountRate;
    }
}
