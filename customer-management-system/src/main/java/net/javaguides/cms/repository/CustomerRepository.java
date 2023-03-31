package net.javaguides.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.cms.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
