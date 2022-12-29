package com.platzi.javatests.payments;

public class PaymentProcessor {

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    private PaymentGateway paymentGateway;
    public boolean makePayment(double amount){

        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        return response.getStatus() == PaymentResponse.PaymentStatus.OK;

    }

}
