package com.sky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sky.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
