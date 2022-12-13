package com.example.spring_data_jpa_demo.repository;

import com.example.spring_data_jpa_demo.pojo.Admin;
import com.example.spring_data_jpa_demo.service.AdminService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 管理存储库  DAO
 *
 * @author JokerQ
 * @Classname AdminRepository
 * @Description TODO
 * @Date 2022/12/12 17:13:57
 * @Created by Administrator
 */
public interface AdminRepository extends JpaRepository<Admin,String> {


    /**
     * select * from admin where a_name=?
     *
     * @param a_name 名字
     * @return {@code List<Admin>}
     */
    List<Admin> findByName(String a_name);
}
