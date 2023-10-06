package com.gringots.dao;

import com.gringots.model.request.CustomerRequestDto;

import java.sql.SQLException;

public interface CustomerDao {

    boolean customerAlreadyExist(String email);

    boolean createCustomer(String customerType, String address, String phoneNumber, String nicImage, String email) throws SQLException;
}
