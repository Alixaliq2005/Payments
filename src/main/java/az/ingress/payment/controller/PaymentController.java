package az.ingress.payment.controller;

import az.ingress.payment.dto.Request.PaymentRequest;
import az.ingress.payment.dto.Response.PaymentResponse;
import az.ingress.payment.service.PaymentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/pay")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentServiceImpl paymentServiceImpl;

    @GetMapping
    public List<PaymentResponse> findAll() {
        return paymentServiceImpl.findAll();
    }

    @PostMapping("/create")
    public void createPayment(@RequestBody PaymentRequest paymentRequest) {
        paymentServiceImpl.CreatePayment(paymentRequest);
    }

    @GetMapping("/{id}")
    public PaymentResponse getPayById(@PathVariable Long id) {
        return paymentServiceImpl.getPayById(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody PaymentRequest paymentRequest, @PathVariable Long id) {
        paymentServiceImpl.updatePayment(paymentRequest, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        paymentServiceImpl.deletePayment(id);
    }

}
