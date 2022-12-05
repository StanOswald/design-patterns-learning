package cn.stanoswald.behavioral.strategy.pay;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
