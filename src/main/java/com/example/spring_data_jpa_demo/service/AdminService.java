package com.example.spring_data_jpa_demo.service;

import com.example.spring_data_jpa_demo.pojo.Admin;

import java.util.List;

/**
 * @Classname AdminService
 * @Description TODO
 * @Date 2022/12/13 08:35:03
 * @Created by Administrator
 */
public interface AdminService {
    List<Admin> findAll();
    Admin findById(String id);
    Admin save(Admin admin);
    void delete(String id);
    List<Admin> findByName(String a_name);
}
