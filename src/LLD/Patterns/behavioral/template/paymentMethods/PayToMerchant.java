package LLD.Patterns.behavioral.template.paymentMethods;

import LLD.Patterns.behavioral.template.Payment;

public class PayToMerchant extends Payment {
    @Override
    public void validateRequest() {
        System.out.println("Merchant request validated");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credited amount to Merchant account");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debited amount from your account");

    }

    @Override
    public void calculatePlatformFee() {
        System.out.println("Platform fee calculation done");

    }
}
