package com.atguigu.easyui.mappers;

import com.atguigu.easyui.entities.Employee;
import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer empId);

    int insert(Employee record);

    Employee selectByPrimaryKey(Integer empId);

    List<Employee> selectAll();

    int updateByPrimaryKey(Employee record);
    public static void main(String[] args) {
		System.out.println("11111111111111111");
	}
}