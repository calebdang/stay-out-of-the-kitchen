package com.sotk.stayoutthekitchen.Controller;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.sotk.stayoutthekitchen.Entity.Customer;
import com.sotk.stayoutthekitchen.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/customer")
@CrossOrigin
public class SubscriberController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/save")
    public ResponseEntity<String> saveCustomer(@RequestBody(required =false) Customer request){
        customerRepository.save(request);
        return new ResponseEntity<String>(request.toString(), HttpStatus.OK);
    }

    @PostMapping("/view")
    public ResponseEntity<String> saveCustomer(){
        List<Customer> custList = customerRepository.findAll();
        return new ResponseEntity<String>(custList.toString(), HttpStatus.OK);
    }

}
