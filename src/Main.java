public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int amount = 1_000_000;
        double rate = 9.99;
        int time = 1;

        double payment = service.calculate(amount, rate, time);
        System.out.println("Monthly Payment = " + payment);


    }
}
