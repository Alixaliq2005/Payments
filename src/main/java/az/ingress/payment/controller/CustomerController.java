package az.ingress.payment.controller;

import az.ingress.payment.dto.Request.CustomerRequest;
import az.ingress.payment.dto.Response.CustomerResponse;
import az.ingress.payment.service.CustomerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerServiceImpl customerServiceImpl;

    @GetMapping
    public List<CustomerResponse> findAll() {
        return customerServiceImpl.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody CustomerRequest customerRequest) {
        customerServiceImpl.createCustomer(customerRequest);
    }

    @GetMapping("/{id}")
    public CustomerResponse getPayById(@PathVariable Long id){
        return customerServiceImpl.getCustomerById(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody CustomerRequest customerRequest,@PathVariable Long id){
        customerServiceImpl.updateCustomer(customerRequest,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        customerServiceImpl.deleteCustomer(id);
    }
}
