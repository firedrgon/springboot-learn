package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import com.atguigu.bean.Employee;
import com.atguigu.mapper.EmployeeMapper;

@CacheConfig(cacheNames="emp")
@Service
public class EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;
	
//	@Cacheable(cacheNames= {"emp"}, key = "#root.methodName + '[' + #id + ']'")
//	@Cacheable(cacheNames= {"emp"}, keyGenerator = "myKeyGenerator",condition="#id>1")
	@Cacheable(cacheNames= {"emp"}, key = "#id")
	public Employee getEmp(Integer id) {
		Employee emp = employeeMapper.getEmpById(id);
		return emp;
	}
	
	@CachePut(cacheNames= {"emp"}, key="#emp.id")
	public Employee updateEmp(Employee emp) {
		employeeMapper.updateEmp(emp);
		return emp;
	}
	
	@CacheEvict(cacheNames = {"emp"},key="#id")
	public void deleteEmp(Integer id) {
		employeeMapper.deleteEmp(id);
	}
	
	@Caching(
			cacheable= {
					@Cacheable(value="emp",key="#lastName")	
			},
			put = {
				@CachePut(value="emp",key="#result.id"),
				@CachePut(value="emp",key="#result.email")
			}
	)
	public Employee getEmpLastname(String lastName) {
		return null;
	}
}












