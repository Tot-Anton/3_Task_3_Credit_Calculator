public class CreditPaymentService {
    public double calculate(int amount, double rate, int time) {

        // конвертации для формата месяца
        rate = (rate/100)/12;

        // перевод время в месяцах
        time = time * 12;

        //формула M = P [{r*(1+r)^n}/{(1+r)^n – 1}]

        double payment = amount * ((rate * Math.pow(1 + rate, time))
                / (Math.pow(1 + rate, time) - 1));
        return payment;

    }
}
