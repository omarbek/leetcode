package companies.tamara;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Money {

    private final Double amount;
    private final String currency;

    public Money(Double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money minus(Money _that) {
        int first = getScale(this.amount);
        int scales = getScale(_that.amount);
        if (first > scales) {
            scales = first;
        }
        double amount = this.amount - _that.amount;
        double diff = BigDecimal.valueOf(amount).setScale(scales, RoundingMode.HALF_UP).doubleValue();
        return new Money(diff, currency);
    }

    private int getScale(Double amount) {
        String[] arr = amount.toString().split("\\.");
        return arr[1].length();
    }

    public Double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(amount, money.amount) && Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }
}
