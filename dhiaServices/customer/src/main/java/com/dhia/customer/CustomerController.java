package com.dhia.customer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api")
public record CustomerController(CustomerService customerService) {

    @PostMapping("/customer")
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest){
        log.info("new costumer request register!!",customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }

}
