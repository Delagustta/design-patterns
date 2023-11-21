package org.example.behavioral.strategy;

/**
 * Common interface for all strategies.
 */
public interface PayStrategy {
    void collectPaymentDetails();
    boolean pay(int paymentAmount);
}
