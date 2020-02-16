import java.math.BigDecimal;

public class GoldCard extends Card {

    public GoldCard(CardOwner owner, BigDecimal turnover) {
        super(owner, turnover, new BigDecimal(0.02));
    }

    @Override
    public BigDecimal getDiscountRate() {

        BigDecimal buffTurnover = this.getTurnover();
        BigDecimal discountRate = this.getInitialDiscountRate();

        while (buffTurnover.compareTo(new BigDecimal(100)) == 1
                || buffTurnover.compareTo(new BigDecimal(100)) == 0) {


            buffTurnover = buffTurnover.subtract(new BigDecimal(100));
            discountRate = discountRate.add(new BigDecimal(0.01));
        }
        if (1 == discountRate.compareTo(new BigDecimal(0.1)))
            discountRate = new BigDecimal(0.1);
        return discountRate;
    }
}
