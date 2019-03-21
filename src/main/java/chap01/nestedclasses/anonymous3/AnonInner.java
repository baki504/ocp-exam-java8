package chap01.nestedclasses.anonymous3;

public class AnonInner {

    @FunctionalInterface
    interface SalesTodayOnly {
        int dollarsOff();
    }

    public int pay() {
        return admission(5, new SalesTodayOnly() {

            @Override
            public int dollarsOff() {
                return 3;
            }

        });
    }

    public int payWithLambda() {
        return admission(5, () -> 3);
    }

    public int admission(int basePrice, SalesTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        System.out.println(new AnonInner().pay());
        System.out.println(new AnonInner().payWithLambda());

    }

}
