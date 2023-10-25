package az.ingress.payment.service;

import az.ingress.payment.dto.Request.PaymentRequest;
import az.ingress.payment.dto.Response.PaymentResponse;
import az.ingress.payment.entity.Payment;
import az.ingress.payment.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PaymentService implements PaymentServiceImpl {

    private final PaymentRepository paymentRepository;

    private final ModelMapper modelMapper;

    @Override
    public List<PaymentResponse> findAll() {
        return paymentRepository
                .findAll()
                .stream()
                .map(payment -> modelMapper.map(payment, PaymentResponse.class))
                .collect(Collectors.toList());
    }


    @Override
    public void CreatePayment(PaymentRequest paymentRequest){
        Payment payment = modelMapper.map(paymentRequest,Payment.class);
        paymentRepository.save(payment);
    }


    @Override
    public PaymentResponse getPayById(Long id){
        Payment payment= paymentRepository.findById(id).orElseThrow(()->new RuntimeException());
        return modelMapper.map(payment,PaymentResponse.class);
    }

    @Override
    public void updatePayment( PaymentRequest paymentRequest,  Long id){
        Payment payment= modelMapper.map(paymentRequest,Payment.class);
        paymentRepository.save(payment);
    }

    @Override
    public void deletePayment(Long id){
        paymentRepository.deleteById(id);
    }

}
