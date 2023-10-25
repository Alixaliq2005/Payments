package az.ingress.payment.service;

import az.ingress.payment.dto.Request.PaymentRequest;
import az.ingress.payment.dto.Response.PaymentResponse;

import java.util.List;

public interface PaymentServiceImpl {
    List<PaymentResponse> findAll();
    void CreatePayment(PaymentRequest paymentRequest);
    void updatePayment( PaymentRequest paymentRequest,  Long id);
    void deletePayment(Long id);
    PaymentResponse getPayById(Long id);
}
