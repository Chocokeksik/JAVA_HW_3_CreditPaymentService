public class CreditPaymentService {
    public double calculate(int loan, int term, double interest) {

        int a = 1;
        int z = 12;
        double b = interest / 100 / 12;
        double c = a + b;
        double o = term * z;
        double d = Math.pow(c, -o);
        double x = a - d;


        double payment = b / x * loan;
        return payment;


    }

}
