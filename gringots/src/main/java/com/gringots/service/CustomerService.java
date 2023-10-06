package com.gringots.service;

import com.gringots.model.request.CustomerRequestDto;

import java.sql.SQLException;

public interface CustomerService {
    boolean registerCustomer(CustomerRequestDto customerRequestDto) throws SQLException;
}
