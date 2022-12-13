package com.example.spring_data_jpa_demo;

import com.example.spring_data_jpa_demo.pojo.Admin;
import com.example.spring_data_jpa_demo.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SpringDataJpaDemoApplicationTests {

	@Resource
	private AdminService adminService;

	@Test
	void contextLoads() {
	}

	@Test
	public void test01(){
		List<Admin> adminList = adminService.findAll();
		adminList.forEach(admin -> System.out.println(admin));
	}

	@Test
	public void test02(){
		Admin admin = adminService.findById("1");
		System.out.println(admin);
	}

	@Test
	public void test03(){
		List<Admin> adminList = adminService.findByName("admin");
		adminList.forEach(admin -> System.out.println(admin));
	}
}
