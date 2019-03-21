package chap01.nestedclasses.anonymous2;

public class AnonInner {

    @FunctionalInterface
    interface SaleTodayOnly {
        int dollarsOff();

        public int num = 10;

        default int dispNum() {
            return num;
        }
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            public int dollarsOff() {
                return 3;
            }
        };

        return basePrice - sale.dollarsOff();
    }

    public int admissionWithLambda(int basePrice) {
        SaleTodayOnly sale = () -> 3;
        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        System.out.println(new AnonInner().admission(10));
        System.out.println(new AnonInner().admissionWithLambda(10));
    }

}
