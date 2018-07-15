package com.atguigu.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.atguigu.bean.Employee;

//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {
  @Select("select * from employee where id = #{id}")
  public Employee getEmpById(Integer id);
  @Insert("insert into employee(last_name,email,gender,d_id) values(#{lastName},#{emial},#{gender},#{dId})")
  public void insertEmp(Employee employee);
  
  @Update("update employee set last_name=#{lastName},email=#{email},gender=#{gender} where id=#{id}")
  public void updateEmp(Employee employee);
  
  @Delete("delete from employee where id=#{id}")
  public int deleteEmp(Integer id);
}

