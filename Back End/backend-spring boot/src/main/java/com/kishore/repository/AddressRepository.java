package com.kishore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishore.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
