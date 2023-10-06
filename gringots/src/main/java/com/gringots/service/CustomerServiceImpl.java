package com.gringots.service;

import com.gringots.dao.CustomerDao;
import com.gringots.model.request.CustomerRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Locale;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerDao customerDao;


    @Override
    public boolean registerCustomer(CustomerRequestDto customerRequestDto) throws SQLException {
        boolean isCustomerCreated =  false;

        //Assuming that customer email & customer Type is checked for null though the front-end
        if(!customerDao.customerAlreadyExist(customerRequestDto.getEmail())){

            String firstName = customerRequestDto.getFirstName();
            String lastName  = customerRequestDto.getLastName();
            String nic = customerRequestDto.getNic();
            String dob = customerRequestDto.getDob();
            String email = customerRequestDto.getEmail();
            String address = customerRequestDto.getAddress();
            String phoneNumber = customerRequestDto.getPhoneNumber();
            String nicImage = customerRequestDto.getNicImage();
            String customerType =  customerRequestDto.getCustomerType();
            String organizationName =  customerRequestDto.getContactPersonName();
            String organizationRegNo = customerRequestDto.getOrganizationRegNo();
            String contactPersonName =  customerRequestDto.getContactPersonName();

            isCustomerCreated = customerDao.createCustomer(customerType,address,phoneNumber,nicImage,email);

        }



//        CREATE TABLE `customer` (
//  `customer_id` BIGINT,
//  `customer_type` enum('individual','organization'),
//  `address` varchar(150),
//  `phone_number` int,
//  `nic_image` blob,
//  `email` VARCHAR(45) UNIQUE NOT NULL,
//                PRIMARY KEY (`customer_id`)

        return isCustomerCreated;
    }
}
