package com.atguigu.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.atguigu.springcloud.entities.Dept;

@Mapper// mybatis 的dao接口层一定要加上这个注解
public interface DeptDao {

	  public boolean addDept(Dept dept);
	 
	  public Dept findById(Long id);
	 
	  public List<Dept> findAll();
}
