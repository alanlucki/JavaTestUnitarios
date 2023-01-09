package com.platzi.javatests.payments;

public class PaymentResponse {

    private PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    enum PaymentStatus {
        OK,
        ERROR
    }

}
