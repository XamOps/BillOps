package com.xammer.billops.repository;

import com.xammer.billops.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import com.xammer.billops.domain.User;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByUser(User user); // <-- ADD THIS METHOD
}
