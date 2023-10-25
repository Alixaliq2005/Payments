package az.ingress.payment.service;

import az.ingress.payment.dto.Request.CustomerRequest;
import az.ingress.payment.dto.Response.CustomerResponse;

import java.util.List;

public interface CustomerServiceImpl {
    List<CustomerResponse> findAll();
    void createCustomer(CustomerRequest customerRequest);
    CustomerResponse getCustomerById(Long id);
    void updateCustomer( CustomerRequest customerRequest,  Long id);
    void deleteCustomer(Long id);
}
