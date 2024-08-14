package companies.tamara;

public class First {

    public static void main(String[] args) {
//        print(1.23, 1.12);
//        print(1.03, 0.42);
        print(2.0000000000003, 1.0000000000042);
    }

    private static void print(double first, double second) {
        var _this = new Money(first, "USD");
        var _that = new Money(second, "USD");
        var actual = _this.minus(_that);
        System.out.println(actual.getAmount());
    }
}
