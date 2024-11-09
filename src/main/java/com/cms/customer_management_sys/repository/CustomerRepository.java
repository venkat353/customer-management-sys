package com.cms.customer_management_sys.repository;



import com.cms.customer_management_sys.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Custom query methods (if needed) will go here
}
