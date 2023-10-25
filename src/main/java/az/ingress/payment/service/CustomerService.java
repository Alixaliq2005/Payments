package az.ingress.payment.service;

import az.ingress.payment.dto.Request.CustomerRequest;
import az.ingress.payment.dto.Response.CustomerResponse;
import az.ingress.payment.entity.Customer;
import az.ingress.payment.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService implements CustomerServiceImpl {
    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<CustomerResponse> findAll() {
        return customerRepository
                .findAll()
                .stream()
                .map(costumer -> modelMapper.map(costumer, CustomerResponse.class))
                .collect(Collectors.toList());
    }


    @Override
    public void createCustomer(CustomerRequest customerRequest){
        Customer customer=modelMapper.map(customerRequest,Customer.class);
        customerRepository.save(customer);
    }


    @Override
    public CustomerResponse getCustomerById(Long id){
        Customer customer= customerRepository.findById(id).orElseThrow(()->new RuntimeException());
        return modelMapper.map(customer,CustomerResponse.class);
    }

    @Override
    public void updateCustomer( CustomerRequest customerRequest,  Long id){
        Customer customer= modelMapper.map(customerRequest,Customer.class);
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id){
        customerRepository.deleteById(id);
    }

}
