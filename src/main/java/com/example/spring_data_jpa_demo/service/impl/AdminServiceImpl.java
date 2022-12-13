package com.example.spring_data_jpa_demo.service.impl;

import com.example.spring_data_jpa_demo.pojo.Admin;
import com.example.spring_data_jpa_demo.repository.AdminRepository;
import com.example.spring_data_jpa_demo.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname AdminServiceImpl
 * @Description TODO
 * @Date 2022/12/13 08:38:37
 * @Created by Administrator
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminRepository adminRepository;

    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    @Override
    public Admin findById(String id) {
        return adminRepository.findById(id).get();
    }

    @Override
    public Admin save(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void delete(String id) {
        adminRepository.deleteById(id+"");
    }

    @Override
    public List<Admin> findByName(String a_name) {
        return adminRepository.findByName(a_name);
    }
}
