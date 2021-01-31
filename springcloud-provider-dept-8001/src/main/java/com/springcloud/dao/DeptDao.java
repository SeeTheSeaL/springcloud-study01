package com.springcloud.dao;

import com.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lee
 * @date 2020/10/6 - 1:50 下午
 */
@Mapper
@Repository
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept queryById(long id);

    public List<Dept> queryAll();

}
