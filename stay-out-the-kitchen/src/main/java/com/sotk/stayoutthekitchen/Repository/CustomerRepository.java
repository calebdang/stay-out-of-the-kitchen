package com.sotk.stayoutthekitchen.Repository;

import com.sotk.stayoutthekitchen.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
