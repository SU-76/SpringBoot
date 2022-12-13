package com.example.spring_data_jpa_demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Classname Admin
 * @Description TODO
 * @Date 2022/12/12 14:18:10
 * @Created by Administrator
 */
@Entity
public class Admin {
    @Id
    private String a_id;
    @Column(name = "a_name")//指定字段
    private String name;
    @Column(name = "a_pass")
    private String password;

    @Override
    public String toString() {
        return "Admin{" +
                "a_id=" + a_id +
                ", a_name='" + name + '\'' +
                ", a_pass='" + password + '\'' +
                '}';
    }
}
