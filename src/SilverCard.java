import java.math.BigDecimal;

public class SilverCard extends Card {

    public SilverCard(CardOwner owner, BigDecimal turnover) {
        super(owner, turnover, new BigDecimal(0.02));
    }

    @Override
    public BigDecimal getDiscountRate() {

        BigDecimal discountRate;
        int result = (this.getTurnover().compareTo(new BigDecimal(300)));
        if (result == 1)
            discountRate = new BigDecimal(0.035);
        else
            discountRate = this.getInitialDiscountRate();
        return discountRate;
    }
}
