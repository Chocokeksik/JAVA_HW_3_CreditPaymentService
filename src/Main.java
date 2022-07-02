public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double payment1 = service.calculate(1000000, 1, 9.99);
        System.out.println("Платеж по кредиту1:" + payment1);

        double payment2 = service.calculate(1000000, 2, 9.99);
        System.out.println("Платеж по кредиту2:" + payment2);

        double payment3 = service.calculate(1000000, 3, 9.99);
        System.out.println("Платеж по кредиту3:" + payment3);
    }
}
